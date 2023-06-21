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

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DslGenerator extends AbstractGenerator {
	
	final String JAVA_SUFFIX = ".java";
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(interface: resource.allContents.toIterable.filter(Interface)) {
			fsa.generateFile(getPackage(interface).replace(".", "/") + "/" +  getInterfaceName(interface) + JAVA_SUFFIX, interface.compile)	
		}
		for(component: resource.allContents.toIterable.filter(Component)) {
			fsa.generateFile(getPackage(component).replace(".", "/") + "/" +  component.name + JAVA_SUFFIX, component.compile)	
		}
	}
	
	def compile(Component component) '''
		package «getPackage(component)»;
		public class «component.name» «component.provides.size() == 0 ? "" : ("implements " + ListExtensions.map(component.provides)[i | getInterfaceName(i)].join(", "))» {
			
			«FOR interfaceElement:component.provides»
				«getInterfaceName(interfaceElement)» «getInterfaceName(interfaceElement).toFirstLower»;
			«ENDFOR»
			«FOR interfaceElement:component.provides»
				«FOR method:interfaceElement.signatures»
					
					//Implementing «method.name» from interface «getInterfaceName(interfaceElement)»
					@Override 
					public «getType(method.returnType)» «method.name»(«ListExtensions.map(method.parameters)[p | getType(p.type) + " " + p.name].join(", ")») {
						// TODO: Insert code here
					}
				«ENDFOR»
			«ENDFOR»
		
			«FOR interfaceElement:component.provides»
				public void set«getInterfaceName(interfaceElement)»(«getInterfaceName(interfaceElement)» «getInterfaceName(interfaceElement).toFirstLower») {
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
	
	def compile(Signature signature) '''
		«getType(signature.returnType)» «signature.name» («ListExtensions.map(signature.parameters)[p | getType(p.type) + " " + p.name].join(", ")»);
	'''
	
	def String getPackage(EObject object) {
		var result = "";
		var element = object.eContainer;
		while(element !== null) {
			if(element instanceof NamedElement) {
				result = addSegment(result, element.name);
			} else {
				result = addSegment(result, element.eClass.name);
			}
			element  = element.eContainer;
		}
		
		return reversePackage(result).toLowerCase() as String
	}
	
	def String addSegment(String packageElement, String segment)  {
		var result = packageElement;
		if(segment !== null && !segment.isBlank()) {
			if(!result.isEmpty()) {
				result += ".";
			}
			result += segment.trim();
		}
		return result;
	}
	
	def String reversePackage(String name) {
		var elements = Arrays.asList(name.split("\\."));
		Collections.reverse(elements); 
		return elements.join(".");
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
}
