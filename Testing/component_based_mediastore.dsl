ComponentBasedSystem{
	repositories{
		Repository {
			components {
				Component "WebBrowser" {},
				Component "WebGUI" {
					requires("MediaStore")
					provides ("HTTP") 
				},
				Component "MediaManager" {
					requires("Sound", "AudioDB")
				},
				Component "DigitalWatermarking" {
					provides("Sound")
				},
				Component "DBCache" {
					requires("AudioDB")
					provides("AudioDB")
				},
				Component "PoolingAudioDB" {
					provides("AudioDB")
				},
				CompositeComponent "MediaStore" {
					requires("AudioDB")
					provides("MediaStore")
					encapsulatedInstances ("DBCache","DigitalWatermarking","MediaManager")
				}
			}
			interfaces {
				Interface "HTTP" {
					signatures {
						Signature "HTTPDownload" {
							returnType VoidType
						},
						Signature "HTTPUpload" {
							returnType VoidType
						}
					}
				},
				Interface "Sound" {
					signatures {
						Signature "Watermark" {
							returnType VoidType
						}
					}
				},
				Interface "AudioDB" {
					signatures {
						Signature "QueryDB" {
							returnType VoidType
						},
						Signature "AddFile" {
							returnType VoidType
						}
					}
				},
				Interface "MediaStore" {
					signatures {
						Signature "download" {
							returnType VoidType
						},
						Signature "upload" {
							returnType VoidType
						}
					}
				}
			}
		}
	}
	environments {
		Environment {
			container{
				Container "Application Server" {},
				Container "DatabaseServer" {}
			}
			link{
				Link "ServerDBServer" {
					containers ("Application Server","DatabaseServer") 
				}
			}
		}
	}
	systems{
		System {
			provides ("HTTP")
			encapsulatedInstances{
				AssemblyContext "WebGUI" {
					instantiatedComponent "WebGUI"
					requires {
						RequiredRole "WebGUI" {}
					}
					provides {
						ProvidedRole "WebGUI" {}
					}
				},
				AssemblyContext "MediaManager" {
					instantiatedComponent "MediaManager"
					requires {
						RequiredRole "MediaManagerDB" {},
						RequiredRole "MediaManagerWaterMarking" {}
					}
					provides {
						ProvidedRole "MediaManager" {}
					}
				},
				AssemblyContext "DBCache" {
					instantiatedComponent "DBCache"
					requires {
						RequiredRole "DBCache" {}
					}
					provides {
						ProvidedRole "DBCache" {}
					}
				},
				AssemblyContext "DigitalWatermarking" {
					instantiatedComponent "DigitalWatermarking"
					provides {
						ProvidedRole "DigitalWatermarking" {}
					}
				},
				AssemblyContext "MediaStore" {
					instantiatedComponent "MediaStore"
					requires {
						RequiredRole "MediaStore" {}
					}
					provides {
						ProvidedRole "MediaStore" {}
					}
				},
				AssemblyContext "PoolingAudioDB" {
					instantiatedComponent "PoolingAudioDB"
					requires {
						RequiredRole "PoolingAudioDB" {}
					}
					provides {
						ProvidedRole "PoolingAudioDB" {}
					}
				}
			}
			delegationConnectors {
				DelegationConnectorProvided {
					linkedInterface "AudioDB"
					linkdedRole "DBCache.DBCache"
				},
				DelegationConnectorRequired {
					linkedInterface "MediaStore"
					linkedRole "WebGUI.WebGUI"
				}
			}
			assemblyConnectors {
				AssemblyConnector {
					requiredRole "MediaManager.MediaManagerWaterMarking"
					providedRole "DigitalWatermarking.DigitalWatermarking"
				},
				AssemblyConnector {
					requiredRole "MediaManager.MediaManagerDB"
					providedRole "DBCache.DBCache"
				},
				AssemblyConnector {
					requiredRole "WebGUI.WebGUI"
					providedRole "MediaStore.MediaStore"
				},
				AssemblyConnector {
					requiredRole "MediaStore.MediaStore"
					providedRole "PoolingAudioDB.PoolingAudioDB"
				}
			}
		}
	}
	allocationContexts {
		AllocationContext "WebGUI" {
			assemblyContext "WebGUI"
			container "Application Server"
		},
		AllocationContext "PoolingAudioDB" {
			assemblyContext "PoolingAudioDB"
			container "DatabaseServer"
		},
		AllocationContext "MediaStore" {
			assemblyContext "MediaStore"
			container "Application Server"
		}
	}
}