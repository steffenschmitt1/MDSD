/*
 * generated by Xtext 2.30.0
 */
package kit.mdsd.xtext.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import metaModel.viewType.repository.Interface
import org.eclipse.emf.ecore.EObject
import metaModel.viewType.NamedElement
import java.util.Arrays
import java.util.Collections
import metaModel.viewType.repository.Signature
import metaModel.viewType.repository.Type
import metaModel.viewType.repository.BooleanType
import metaModel.viewType.repository.StringType
import metaModel.viewType.repository.IntType
import metaModel.viewType.repository.VoidType
import metaModel.viewType.repository.Parameter
import org.eclipse.emf.common.util.EList
import metaModel.viewType.repository.FloatType
import metaModel.viewType.repository.LongType
import metaModel.viewType.repository.CharType
import metaModel.viewType.repository.Component
import java.awt.Component.BaselineResizeBehavior
import metaModel.viewType.repository.Repository
import java.util.Collection
import java.util.HashSet
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DslGenerator extends AbstractGenerator {
	
	final String JAVA_SUFFIX = ".java";
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(repository: resource.allContents.toIterable.filter(Repository)) {
			fsa.generateFile(getPackage(repository).replace(".", "/") + "/" +  "Helper" + JAVA_SUFFIX, repository.compile)	
		}
		for(interface: resource.allContents.toIterable.filter(Interface)) {
			fsa.generateFile(getPackage(interface).replace(".", "/") + "/" +  getInterfaceName(interface) + JAVA_SUFFIX, interface.compile)	
		}
		for(component: resource.allContents.toIterable.filter(Component)) {
			fsa.generateFile(getPackage(component).replace(".", "/") + "/" +  getComponentName(component) + JAVA_SUFFIX, component.compile)	
		}
	}
	
    def compile(Component component) '''
		package «getPackage(component)»;
		
		««« Imports
		«FOR interfaceElement:getRequiredInterfaces(component)»
			import «getPackage(interfaceElement)».«getInterfaceName(interfaceElement)»;
		«ENDFOR»
		«IF component.requires.size > 0»
			import «getPackage(component.eContainer)».Helper;
		«ENDIF»
		
		public class «getComponentName(component)» «component.provides.size() == 0 ? "" : ("implements " + ListExtensions.map(component.provides)[i | getInterfaceName(i)].join(", "))» {
			««« Attributes
			«FOR interfaceElement:component.requires»
			
				«getInterfaceName(interfaceElement)» «getInterfaceName(interfaceElement).toFirstLower»;
			«ENDFOR»
			««« Methods
				«FOR interfaceElement:component.provides»
					«FOR method:interfaceElement.signatures»
					
						//Implementing «method.name» from interface «getInterfaceName(interfaceElement)»
						@Override 
						public «getType(method.returnType)» «method.name»(«ListExtensions.map(method.parameters)[p | getType(p.type) + " " + p.name].join(", ")») {
							«FOR interfaceElement2:component.requires»
								Helper.assertNotNull(«getInterfaceName(interfaceElement2).toFirstLower»);
							«ENDFOR»
							// TODO: Insert code here
						}
				«ENDFOR»
			«ENDFOR»
			««« Setter
			«FOR interfaceElement:component.requires»
			
				public void set«getInterfaceName(interfaceElement)»(«getInterfaceName(interfaceElement)» «getInterfaceName(interfaceElement).toFirstLower») {
					Helper.assertNull(«getInterfaceName(interfaceElement).toFirstLower»);
					this.«getInterfaceName(interfaceElement).toFirstLower» = «getInterfaceName(interfaceElement).toFirstLower»;
				}
			«ENDFOR»
		}
	'''
	
	
	def compile(Interface interfaceElement) '''
		package «getPackage(interfaceElement)»;
		
		public interface «getInterfaceName(interfaceElement)» {
			
			«FOR signature:interfaceElement.signatures»
			 	«signature.compile»
			 	
			«ENDFOR»
		}
	'''
	
		def compile(Repository repository) '''
		package «getPackage(repository)»;
		
		public class Helper {
			
			public static void assertNotNull(Object object) {
				if(object == null) {
					throw new NullPointerException();
				}
			}
			
			public static void assertNull(Object object) {
				if(object != null) {
					throw new IllegalArgumentException();
				}	
			}
			
		}
	'''
	
	def compile(Signature signature) '''
		«getType(signature.returnType)» «signature.name» («ListExtensions.map(signature.parameters)[p | getType(p.type) + " " + p.name].join(", ")»);
	'''
	
	def String getPackage(EObject object) {
		if(object instanceof Interface) {
			return "repository";
		} else if (object instanceof Component) {
			return object.name;
		} else if (object instanceof Repository) {
			return "repository";
		}
		return "unsupportetElement"
	}
	
	def String getPackageFull(EObject object) {
		var packageSegements = new ArrayList<String>();
		var element = object.eContainer;		
		while(element !== null) {
			if(element instanceof NamedElement) {
				packageSegements.add(element.name);
			} else {
				packageSegements.add(element.eClass.name);
			}
			element  = element.eContainer;
		}
		Collections.reverse(packageSegements);
		if(object instanceof NamedElement) {
			packageSegements.add(object.name);
		}
		return packageSegements.join(".") as String
	}
	
	def String getType(Type type) {
		if( type instanceof StringType) {
			return "String"
		} else if(type instanceof VoidType) {
			return "void";
		} else if(type instanceof BooleanType) {
			return "boolean";
		} else if(type instanceof IntType) {
			return "int";
		} else if(type instanceof FloatType) {
			return "float";
		} else if(type instanceof LongType) {
			return "long";
		} else if(type instanceof CharType) {
			return "char";
		}
		return "undefinedType"
	}
	
	def String getInterfaceName(Interface interfaceElement) {
		return "I" + interfaceElement.name;
	}
	
	def String getComponentName(Component component) {
		return component.name + "Impl";
	}
	
	def Collection<Interface> getRequiredInterfaces(Component component) {
		var interfaces = new HashSet<Interface>();
		interfaces.addAll(component.requires);
		interfaces.addAll(component.provides);
		return interfaces;
	}
}
