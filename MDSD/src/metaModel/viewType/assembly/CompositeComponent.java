/**
 */
package metaModel.viewType.assembly;

import java.util.Map;

import metaModel.viewType.repository.Component;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.CompositeComponent#getEncapsulatedInstances <em>Encapsulated Instances</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.assembly.AssemblyPackage#getCompositeComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ofOtherComponent'"
 * @generated
 */
public interface CompositeComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Encapsulated Instances</b></em>' reference list.
	 * The list contents are of type {@link metaModel.viewType.assembly.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Instances</em>' reference list.
	 * @see metaModel.viewType.assembly.AssemblyPackage#getCompositeComponent_EncapsulatedInstances()
	 * @model required="true"
	 * @generated
	 */
	EList<AssemblyContext> getEncapsulatedInstances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.encapsulatedInstances -&gt; select(instance | instance.instanceOf = self)-&gt;size() = 0'"
	 * @generated
	 */
	boolean ofOtherComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CompositeComponent
