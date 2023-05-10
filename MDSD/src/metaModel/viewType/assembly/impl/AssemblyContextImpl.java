/**
 */
package metaModel.viewType.assembly.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import metaModel.viewType.allocation.AllocationContext;
import metaModel.viewType.allocation.AllocationPackage;

import metaModel.viewType.assembly.AssemblyContext;
import metaModel.viewType.assembly.AssemblyPackage;
import metaModel.viewType.assembly.AssemblyTables;
import metaModel.viewType.assembly.CompositeComponent;
import metaModel.viewType.assembly.ProvidedRole;
import metaModel.viewType.assembly.RequiredRole;

import metaModel.viewType.impl.NamedElementImpl;

import metaModel.viewType.repository.Component;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.impl.AssemblyContextImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.impl.AssemblyContextImpl#getAllocationContext <em>Allocation Context</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.impl.AssemblyContextImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.impl.AssemblyContextImpl#getProvides <em>Provides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyContextImpl extends NamedElementImpl implements AssemblyContext {
	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected Component instanceOf;

	/**
	 * The cached value of the '{@link #getAllocationContext() <em>Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContext()
	 * @generated
	 * @ordered
	 */
	protected AllocationContext allocationContext;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredRole> requires;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> provides;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.ASSEMBLY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject)instanceOf;
			instanceOf = (Component)eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONTEXT__INSTANCE_OF, oldInstanceOf, instanceOf));
			}
		}
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceOf(Component newInstanceOf) {
		Component oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONTEXT__INSTANCE_OF, oldInstanceOf, instanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext getAllocationContext() {
		if (allocationContext != null && allocationContext.eIsProxy()) {
			InternalEObject oldAllocationContext = (InternalEObject)allocationContext;
			allocationContext = (AllocationContext)eResolveProxy(oldAllocationContext);
			if (allocationContext != oldAllocationContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, oldAllocationContext, allocationContext));
			}
		}
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext basicGetAllocationContext() {
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocationContext(AllocationContext newAllocationContext, NotificationChain msgs) {
		AllocationContext oldAllocationContext = allocationContext;
		allocationContext = newAllocationContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, oldAllocationContext, newAllocationContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationContext(AllocationContext newAllocationContext) {
		if (newAllocationContext != allocationContext) {
			NotificationChain msgs = null;
			if (allocationContext != null)
				msgs = ((InternalEObject)allocationContext).eInverseRemove(this, AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, AllocationContext.class, msgs);
			if (newAllocationContext != null)
				msgs = ((InternalEObject)newAllocationContext).eInverseAdd(this, AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, AllocationContext.class, msgs);
			msgs = basicSetAllocationContext(newAllocationContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, newAllocationContext, newAllocationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredRole> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentWithInverseEList<RequiredRole>(RequiredRole.class, this, AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRES, AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedRole> getProvides() {
		if (provides == null) {
			provides = new EObjectContainmentWithInverseEList<ProvidedRole>(ProvidedRole.class, this, AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDES, AssemblyPackage.PROVIDED_ROLE__ASSEMBLY_CONTEXT);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean assemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AssemblyContext::assemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated";
		try {
			/**
			 *
			 * inv assemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.instanceOf.oclIsTypeOf(CompositeComponent) implies
			 *         self.instanceOf.oclAsType(CompositeComponent)
			 *         .encapsulatedInstances->forAll(allocationContext = null)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AssemblyPackage.Literals.ASSEMBLY_CONTEXT___ASSEMBLY_CONTEXT_FROM_INNER_COMPONENTS_OF_COMPOSITE_COMPONENT_CANT_BE_ALLOCATED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AssemblyTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_metaModel_c_c_viewType_c_c_assembly_c_c_CompositeComponent = idResolver.getClass(AssemblyTables.CLSSid_CompositeComponent, null);
					final /*@NonInvalid*/ Component instanceOf = this.getInstanceOf();
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, instanceOf, TYP_metaModel_c_c_viewType_c_c_assembly_c_c_CompositeComponent).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (!oclIsTypeOf) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@Thrown*/ CompositeComponent oclAsType = (CompositeComponent)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, instanceOf, TYP_metaModel_c_c_viewType_c_c_assembly_c_c_CompositeComponent);
							final /*@Thrown*/ List<AssemblyContext> encapsulatedInstances = oclAsType.getEncapsulatedInstances();
							final /*@Thrown*/ OrderedSetValue BOXED_encapsulatedInstances = idResolver.createOrderedSetOfAll(AssemblyTables.ORD_CLSSid_AssemblyContext, encapsulatedInstances);
							/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR__1 = BOXED_encapsulatedInstances.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR__1.hasNext()) {
									if (accumulator == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator;
									}
									break;
								}
								/*@NonInvalid*/ AssemblyContext _1 = (AssemblyContext)ITERATOR__1.next();
								/**
								 * allocationContext = null
								 */
								final /*@NonInvalid*/ AllocationContext allocationContext = _1.getAllocationContext();
								final /*@NonInvalid*/ boolean eq = allocationContext == null;
								//
								if (!eq) {					// Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break;														// Stop immediately
								}
								else if (eq) {				// Normal successful body evaluation result
									;															// Carry on
								}
								else {															// Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						}
						catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_forAll;
							}
							if (CAUGHT_forAll == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, AssemblyTables.INT_0).booleanValue();
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
				if (allocationContext != null)
					msgs = ((InternalEObject)allocationContext).eInverseRemove(this, AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, AllocationContext.class, msgs);
				return basicSetAllocationContext((AllocationContext)otherEnd, msgs);
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequires()).basicAdd(otherEnd, msgs);
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvides()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
				return basicSetAllocationContext(null, msgs);
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDES:
				return ((InternalEList<?>)getProvides()).basicRemove(otherEnd, msgs);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANCE_OF:
				if (resolve) return getInstanceOf();
				return basicGetInstanceOf();
			case AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
				if (resolve) return getAllocationContext();
				return basicGetAllocationContext();
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRES:
				return getRequires();
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDES:
				return getProvides();
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANCE_OF:
				setInstanceOf((Component)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
				setAllocationContext((AllocationContext)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends RequiredRole>)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends ProvidedRole>)newValue);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANCE_OF:
				setInstanceOf((Component)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
				setAllocationContext((AllocationContext)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRES:
				getRequires().clear();
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDES:
				getProvides().clear();
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANCE_OF:
				return instanceOf != null;
			case AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
				return allocationContext != null;
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRES:
				return requires != null && !requires.isEmpty();
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDES:
				return provides != null && !provides.isEmpty();
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
			case AssemblyPackage.ASSEMBLY_CONTEXT___ASSEMBLY_CONTEXT_FROM_INNER_COMPONENTS_OF_COMPOSITE_COMPONENT_CANT_BE_ALLOCATED__DIAGNOSTICCHAIN_MAP:
				return assemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssemblyContextImpl
