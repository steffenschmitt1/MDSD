ComponentBasedSystem{
	repositories{
		Repository {
			components {
				Component "WebBrowser" {},
				Component "WebGUI" {},
				Component "MediaManager" {},
				Component "DigitalWatermarking" {},
				Component "DBCache" {},
				Component "PoolingAudioDB" {},
				CompositeComponent "MediaStore" {
					encapsulatedInstances ("DBCache","DigitalWatermarking","MediaManager")
				}
			}
			interface {
				Interface "HTTP" {},
				Interface "Sound" {},
				Interface "AudioDB" {},
				Interface "MediaStore" {}
			}
		}
	}
	enivronments {
		Enivronment {
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
					instanceOf "WebGUI"
					requires {
						RequiredRole "WebGUI" {}
					}
					provides {
						ProvidedRole "WebGUI" {}
					}
				},
				AssemblyContext "MediaManager" {
					instanceOf "MediaManager"
					requires {
						RequiredRole "MediaManagerDB" {},
						RequiredRole "MediaManagerWaterMarking" {}
					}
					provides {
						ProvidedRole "MediaManager" {}
					}
				},
				AssemblyContext "DBCache" {
					instanceOf "DBCache"
					requires {
						RequiredRole "DBCache" {}
					}
					provides {
						ProvidedRole "DBCache" {}
					}
				},
				AssemblyContext "DigitalWatermarking" {
					instanceOf "DigitalWatermarking"
					provides {
						ProvidedRole "DigitalWatermarking" {}
					}
				},
				AssemblyContext "MediaStore" {
					instanceOf "MediaStore"
					requires {
						RequiredRole "MediaStore" {}
					}
					provides {
						ProvidedRole "MediaStore" {}
					}
				},
				AssemblyContext "PoolingAudioDB" {
					instanceOf "PoolingAudioDB"
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
					requiredRole "DigitalWatermarking"
					providedRole ""
				}
			}
		}
	}
}