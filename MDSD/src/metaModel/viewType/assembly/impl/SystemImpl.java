/**
 */
package metaModel.viewType.assembly.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import metaModel.viewType.assembly.AssemblyConnector;
import metaModel.viewType.assembly.AssemblyContext;
import metaModel.viewType.assembly.AssemblyPackage;
import metaModel.viewType.assembly.AssemblyTables;
import metaModel.viewType.assembly.DelegationConnector;

import metaModel.viewType.repository.Component;
import metaModel.viewType.repository.Interface;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.impl.SystemImpl#getEncapsulatedInstances <em>Encapsulated Instances</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.impl.SystemImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.impl.SystemImpl#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.impl.SystemImpl#getAssemblyConnectors <em>Assembly Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements metaModel.viewType.assembly.System {
	/**
	 * The cached value of the '{@link #getEncapsulatedInstances() <em>Encapsulated Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> encapsulatedInstances;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> provides;

	/**
	 * The cached value of the '{@link #getDelegationConnectors() <em>Delegation Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<DelegationConnector> delegationConnectors;

	/**
	 * The cached value of the '{@link #getAssemblyConnectors() <em>Assembly Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyConnector> assemblyConnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyContext> getEncapsulatedInstances() {
		if (encapsulatedInstances == null) {
			encapsulatedInstances = new EObjectContainmentEList<AssemblyContext>(AssemblyContext.class, this, AssemblyPackage.SYSTEM__ENCAPSULATED_INSTANCES);
		}
		return encapsulatedInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvides() {
		if (provides == null) {
			provides = new EObjectResolvingEList<Interface>(Interface.class, this, AssemblyPackage.SYSTEM__PROVIDES);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegationConnector> getDelegationConnectors() {
		if (delegationConnectors == null) {
			delegationConnectors = new EObjectContainmentEList<DelegationConnector>(DelegationConnector.class, this, AssemblyPackage.SYSTEM__DELEGATION_CONNECTORS);
		}
		return delegationConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyConnector> getAssemblyConnectors() {
		if (assemblyConnectors == null) {
			assemblyConnectors = new EObjectContainmentEList<AssemblyConnector>(AssemblyConnector.class, this, AssemblyPackage.SYSTEM__ASSEMBLY_CONNECTORS);
		}
		return assemblyConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean providedInterfacesShouldMatchProvidedRolesOfInstances(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "System::providedInterfacesShouldMatchProvidedRolesOfInstances";
		try {
			/**
			 *
			 * inv providedInterfacesShouldMatchProvidedRolesOfInstances:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.encapsulatedInstances.instanceOf.provides->includesAll(
			 *           self.provides->asSet())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AssemblyPackage.Literals.SYSTEM___PROVIDED_INTERFACES_SHOULD_MATCH_PROVIDED_ROLES_OF_INSTANCES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AssemblyTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<AssemblyContext> encapsulatedInstances = this.getEncapsulatedInstances();
				final /*@NonInvalid*/ OrderedSetValue BOXED_encapsulatedInstances = idResolver.createOrderedSetOfAll(AssemblyTables.ORD_CLSSid_AssemblyContext, encapsulatedInstances);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(AssemblyTables.SEQ_CLSSid_Component);
				Iterator<Object> ITERATOR__1 = BOXED_encapsulatedInstances.iterator();
				/*@NonInvalid*/ SequenceValue collect_0;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect_0 = accumulator;
						break;
					}
					/*@NonInvalid*/ AssemblyContext _1 = (AssemblyContext)ITERATOR__1.next();
					/**
					 * instanceOf
					 */
					final /*@NonInvalid*/ Component instanceOf = _1.getInstanceOf();
					//
					accumulator.add(instanceOf);
				}
				/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(AssemblyTables.SEQ_CLSSid_Interface);
				Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						collect = accumulator_0;
						break;
					}
					/*@NonInvalid*/ Component _1_0 = (Component)ITERATOR__1_0.next();
					/**
					 * provides
					 */
					final /*@NonInvalid*/ List<Interface> provides = _1_0.getProvides();
					final /*@NonInvalid*/ OrderedSetValue BOXED_provides = idResolver.createOrderedSetOfAll(AssemblyTables.ORD_CLSSid_Interface, provides);
					//
					for (Object value : BOXED_provides.flatten().getElements()) {
						accumulator_0.add(value);
					}
				}
				final /*@NonInvalid*/ List<Interface> provides_0 = this.getProvides();
				final /*@NonInvalid*/ OrderedSetValue BOXED_provides_0 = idResolver.createOrderedSetOfAll(AssemblyTables.ORD_CLSSid_Interface_0, provides_0);
				final /*@NonInvalid*/ SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(BOXED_provides_0);
				final /*@NonInvalid*/ boolean result = CollectionIncludesAllOperation.INSTANCE.evaluate(collect, asSet).booleanValue();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.SYSTEM__ENCAPSULATED_INSTANCES:
				return ((InternalEList<?>)getEncapsulatedInstances()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.SYSTEM__DELEGATION_CONNECTORS:
				return ((InternalEList<?>)getDelegationConnectors()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.SYSTEM__ASSEMBLY_CONNECTORS:
				return ((InternalEList<?>)getAssemblyConnectors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.SYSTEM__ENCAPSULATED_INSTANCES:
				return getEncapsulatedInstances();
			case AssemblyPackage.SYSTEM__PROVIDES:
				return getProvides();
			case AssemblyPackage.SYSTEM__DELEGATION_CONNECTORS:
				return getDelegationConnectors();
			case AssemblyPackage.SYSTEM__ASSEMBLY_CONNECTORS:
				return getAssemblyConnectors();
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
			case AssemblyPackage.SYSTEM__ENCAPSULATED_INSTANCES:
				getEncapsulatedInstances().clear();
				getEncapsulatedInstances().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case AssemblyPackage.SYSTEM__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends Interface>)newValue);
				return;
			case AssemblyPackage.SYSTEM__DELEGATION_CONNECTORS:
				getDelegationConnectors().clear();
				getDelegationConnectors().addAll((Collection<? extends DelegationConnector>)newValue);
				return;
			case AssemblyPackage.SYSTEM__ASSEMBLY_CONNECTORS:
				getAssemblyConnectors().clear();
				getAssemblyConnectors().addAll((Collection<? extends AssemblyConnector>)newValue);
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
			case AssemblyPackage.SYSTEM__ENCAPSULATED_INSTANCES:
				getEncapsulatedInstances().clear();
				return;
			case AssemblyPackage.SYSTEM__PROVIDES:
				getProvides().clear();
				return;
			case AssemblyPackage.SYSTEM__DELEGATION_CONNECTORS:
				getDelegationConnectors().clear();
				return;
			case AssemblyPackage.SYSTEM__ASSEMBLY_CONNECTORS:
				getAssemblyConnectors().clear();
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
			case AssemblyPackage.SYSTEM__ENCAPSULATED_INSTANCES:
				return encapsulatedInstances != null && !encapsulatedInstances.isEmpty();
			case AssemblyPackage.SYSTEM__PROVIDES:
				return provides != null && !provides.isEmpty();
			case AssemblyPackage.SYSTEM__DELEGATION_CONNECTORS:
				return delegationConnectors != null && !delegationConnectors.isEmpty();
			case AssemblyPackage.SYSTEM__ASSEMBLY_CONNECTORS:
				return assemblyConnectors != null && !assemblyConnectors.isEmpty();
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
			case AssemblyPackage.SYSTEM___PROVIDED_INTERFACES_SHOULD_MATCH_PROVIDED_ROLES_OF_INSTANCES__DIAGNOSTICCHAIN_MAP:
				return providedInterfacesShouldMatchProvidedRolesOfInstances((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemImpl
