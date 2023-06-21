ComponentBasedSystem{
	repositories{
		Repository "Repository" {
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
							parameters {
								Parameter "testparam" {
									type StringType {}
								},
								Parameter "testparam2" {
									type IntType {}
								}
							}
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
			containers{
				Container "Application Server" {},
				Container "DatabaseServer" {}
			}
			links{
				Link "ServerDBServer" {
					containers ("Application Server","DatabaseServer") 
				}
			}
		}
	}
	systems{
		System {
			provides ("Repository.HTTP")
			encapsulatedInstances{
				AssemblyContext "WebGUI" {
					instantiatedComponent "Repository.WebGUI"
					requires {
						RequiredRole "WebGUI" {}
					}
					provides {
						ProvidedRole "WebGUI" {}
					}
				},
				AssemblyContext "MediaManager" {
					instantiatedComponent "Repository.MediaManager"
					requires {
						RequiredRole "MediaManagerDB" {},
						RequiredRole "MediaManagerWaterMarking" {}
					}
					provides {
						ProvidedRole "MediaManager" {}
					}
				},
				AssemblyContext "DBCache" {
					instantiatedComponent "Repository.DBCache"
					requires {
						RequiredRole "DBCache" {}
					}
					provides {
						ProvidedRole "DBCache" {}
					}
				},
				AssemblyContext "DigitalWatermarking" {
					instantiatedComponent "Repository.DigitalWatermarking"
					provides {
						ProvidedRole "DigitalWatermarking" {}
					}
				},
				AssemblyContext "MediaStore" {
					instantiatedComponent "Repository.MediaStore"
					requires {
						RequiredRole "MediaStore" {}
					}
					provides {
						ProvidedRole "MediaStore" {}
					}
				},
				AssemblyContext "PoolingAudioDB" {
					instantiatedComponent "Repository.PoolingAudioDB"
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
					linkedInterface "Repository.AudioDB"
					linkdedRole "DBCache.DBCache"
				},
				DelegationConnectorRequired {
					linkedInterface "Repository.MediaStore"
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