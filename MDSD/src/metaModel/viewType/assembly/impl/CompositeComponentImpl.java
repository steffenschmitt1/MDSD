/**
 */
package metaModel.viewType.assembly.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import metaModel.viewType.assembly.AssemblyContext;
import metaModel.viewType.assembly.AssemblyPackage;
import metaModel.viewType.assembly.AssemblyTables;
import metaModel.viewType.assembly.CompositeComponent;

import metaModel.viewType.repository.Component;

import metaModel.viewType.repository.impl.ComponentImpl;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.impl.CompositeComponentImpl#getEncapsulatedInstances <em>Encapsulated Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeComponentImpl extends ComponentImpl implements CompositeComponent {
	/**
	 * The cached value of the '{@link #getEncapsulatedInstances() <em>Encapsulated Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> encapsulatedInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.COMPOSITE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyContext> getEncapsulatedInstances() {
		if (encapsulatedInstances == null) {
			encapsulatedInstances = new EObjectResolvingEList<AssemblyContext>(AssemblyContext.class, this, AssemblyPackage.COMPOSITE_COMPONENT__ENCAPSULATED_INSTANCES);
		}
		return encapsulatedInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ofOtherComponent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "CompositeComponent::ofOtherComponent";
		try {
			/**
			 *
			 * inv ofOtherComponent:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.encapsulatedInstances->select(instance | instance.instanceOf = self)
			 *         ->size() = 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AssemblyPackage.Literals.COMPOSITE_COMPONENT___OF_OTHER_COMPONENT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AssemblyTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<AssemblyContext> encapsulatedInstances = this.getEncapsulatedInstances();
				final /*@NonInvalid*/ OrderedSetValue BOXED_encapsulatedInstances = idResolver.createOrderedSetOfAll(AssemblyTables.ORD_CLSSid_AssemblyContext, encapsulatedInstances);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(AssemblyTables.ORD_CLSSid_AssemblyContext_0);
				Iterator<Object> ITERATOR_instance = BOXED_encapsulatedInstances.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_instance.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ AssemblyContext instance = (AssemblyContext)ITERATOR_instance.next();
					/**
					 * instance.instanceOf = self
					 */
					final /*@NonInvalid*/ Component instanceOf = instance.getInstanceOf();
					final /*@NonInvalid*/ boolean eq = instanceOf.equals(this);
					//
					if (eq) {
						accumulator.add(instance);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = size.equals(AssemblyTables.INT_0);
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, AssemblyTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.COMPOSITE_COMPONENT__ENCAPSULATED_INSTANCES:
				return getEncapsulatedInstances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssemblyPackage.COMPOSITE_COMPONENT__ENCAPSULATED_INSTANCES:
				getEncapsulatedInstances().clear();
				getEncapsulatedInstances().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AssemblyPackage.COMPOSITE_COMPONENT__ENCAPSULATED_INSTANCES:
				getEncapsulatedInstances().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AssemblyPackage.COMPOSITE_COMPONENT__ENCAPSULATED_INSTANCES:
				return encapsulatedInstances != null && !encapsulatedInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AssemblyPackage.COMPOSITE_COMPONENT___OF_OTHER_COMPONENT__DIAGNOSTICCHAIN_MAP:
				return ofOtherComponent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompositeComponentImpl
