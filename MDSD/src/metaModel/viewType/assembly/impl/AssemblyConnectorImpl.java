/**
 */
package metaModel.viewType.assembly.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import metaModel.viewType.allocation.AllocationContext;

import metaModel.viewType.assembly.AssemblyConnector;
import metaModel.viewType.assembly.AssemblyContext;
import metaModel.viewType.assembly.AssemblyPackage;
import metaModel.viewType.assembly.AssemblyTables;
import metaModel.viewType.assembly.ProvidedRole;
import metaModel.viewType.assembly.RequiredRole;

import metaModel.viewType.environment.Link;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;

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
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.impl.AssemblyConnectorImpl#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.impl.AssemblyConnectorImpl#getProvidedRole <em>Provided Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends MinimalEObjectImpl.Container implements AssemblyConnector {
	/**
	 * The cached value of the '{@link #getRequiredRole() <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRole()
	 * @generated
	 * @ordered
	 */
	protected RequiredRole requiredRole;

	/**
	 * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole providedRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.ASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole getRequiredRole() {
		if (requiredRole != null && requiredRole.eIsProxy()) {
			InternalEObject oldRequiredRole = (InternalEObject)requiredRole;
			requiredRole = (RequiredRole)eResolveProxy(oldRequiredRole);
			if (requiredRole != oldRequiredRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, oldRequiredRole, requiredRole));
			}
		}
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole basicGetRequiredRole() {
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredRole(RequiredRole newRequiredRole, NotificationChain msgs) {
		RequiredRole oldRequiredRole = requiredRole;
		requiredRole = newRequiredRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, oldRequiredRole, newRequiredRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRole(RequiredRole newRequiredRole) {
		if (newRequiredRole != requiredRole) {
			NotificationChain msgs = null;
			if (requiredRole != null)
				msgs = ((InternalEObject)requiredRole).eInverseRemove(this, AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR, RequiredRole.class, msgs);
			if (newRequiredRole != null)
				msgs = ((InternalEObject)newRequiredRole).eInverseAdd(this, AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR, RequiredRole.class, msgs);
			msgs = basicSetRequiredRole(newRequiredRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, newRequiredRole, newRequiredRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getProvidedRole() {
		if (providedRole != null && providedRole.eIsProxy()) {
			InternalEObject oldProvidedRole = (InternalEObject)providedRole;
			providedRole = (ProvidedRole)eResolveProxy(oldProvidedRole);
			if (providedRole != oldProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, oldProvidedRole, providedRole));
			}
		}
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetProvidedRole() {
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedRole(ProvidedRole newProvidedRole, NotificationChain msgs) {
		ProvidedRole oldProvidedRole = providedRole;
		providedRole = newProvidedRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, oldProvidedRole, newProvidedRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedRole(ProvidedRole newProvidedRole) {
		if (newProvidedRole != providedRole) {
			NotificationChain msgs = null;
			if (providedRole != null)
				msgs = ((InternalEObject)providedRole).eInverseRemove(this, AssemblyPackage.PROVIDED_ROLE__ASSEMBLY_CONNECTOR, ProvidedRole.class, msgs);
			if (newProvidedRole != null)
				msgs = ((InternalEObject)newProvidedRole).eInverseAdd(this, AssemblyPackage.PROVIDED_ROLE__ASSEMBLY_CONNECTOR, ProvidedRole.class, msgs);
			msgs = basicSetProvidedRole(newProvidedRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, newProvidedRole, newProvidedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean connectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AssemblyConnector::connectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers";
		try {
			/**
			 *
			 * inv connectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not (self.requiredRole.assemblyContext.allocationContext = null
			 *         ) and
			 *         not (self.providedRole.assemblyContext.allocationContext = null
			 *         ) implies self.requiredRole.assemblyContext.allocationContext.container = self.providedRole.assemblyContext.allocationContext.container or
			 *         self.requiredRole.assemblyContext.allocationContext.container.links->exists(link |
			 *           link.containers->includes(self.providedRole.assemblyContext.allocationContext.container))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AssemblyPackage.Literals.ASSEMBLY_CONNECTOR___CONNECTED_ASSEMBLY_CONTEXTS_SHOULD_BE_ALLOCATED_TO_SAME_CONTAINER_OR_TO_LINKED_CONTAINERS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AssemblyTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						final /*@NonInvalid*/ RequiredRole requiredRole = this.getRequiredRole();
						final /*@NonInvalid*/ AssemblyContext assemblyContext = requiredRole.getAssemblyContext();
						final /*@NonInvalid*/ AllocationContext allocationContext = assemblyContext.getAllocationContext();
						final /*@NonInvalid*/ boolean eq = allocationContext == null;
						final /*@NonInvalid*/ Boolean not;
						if (!eq) {
							not = ValueUtil.TRUE_VALUE;
						}
						else {
							if (eq) {
								not = ValueUtil.FALSE_VALUE;
							}
							else {
								not = null;
							}
						}
						final /*@Thrown*/ Boolean and;
						if (not == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ ProvidedRole providedRole = this.getProvidedRole();
							final /*@NonInvalid*/ AssemblyContext assemblyContext_0 = providedRole.getAssemblyContext();
							final /*@NonInvalid*/ AllocationContext allocationContext_0 = assemblyContext_0.getAllocationContext();
							final /*@NonInvalid*/ boolean eq_0 = allocationContext_0 == null;
							final /*@NonInvalid*/ Boolean not_0;
							if (!eq_0) {
								not_0 = ValueUtil.TRUE_VALUE;
							}
							else {
								if (eq_0) {
									not_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									not_0 = null;
								}
							}
							if (not_0 == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								if ((not == null) || (not_0 == null)) {
									and = null;
								}
								else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and = and;
					}
					catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_or;
						try {
							/*@Caught*/ Object CAUGHT_eq_1;
							try {
								final /*@NonInvalid*/ RequiredRole requiredRole_0 = this.getRequiredRole();
								final /*@NonInvalid*/ AssemblyContext assemblyContext_1 = requiredRole_0.getAssemblyContext();
								final /*@NonInvalid*/ AllocationContext allocationContext_1 = assemblyContext_1.getAllocationContext();
								if (allocationContext_1 == null) {
									throw new InvalidValueException("Null source for \'\'http://metaModel/viewType/allocation\'::AllocationContext::container\'");
								}
								final /*@Thrown*/ metaModel.viewType.environment.Container container = allocationContext_1.getContainer();
								final /*@NonInvalid*/ ProvidedRole providedRole_0 = this.getProvidedRole();
								final /*@NonInvalid*/ AssemblyContext assemblyContext_2 = providedRole_0.getAssemblyContext();
								final /*@NonInvalid*/ AllocationContext allocationContext_2 = assemblyContext_2.getAllocationContext();
								if (allocationContext_2 == null) {
									throw new InvalidValueException("Null source for \'\'http://metaModel/viewType/allocation\'::AllocationContext::container\'");
								}
								final /*@Thrown*/ metaModel.viewType.environment.Container container_0 = allocationContext_2.getContainer();
								final /*@Thrown*/ boolean eq_1 = container.equals(container_0);
								CAUGHT_eq_1 = eq_1;
							}
							catch (Exception e) {
								CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or;
							if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_exists;
								try {
									final /*@NonInvalid*/ RequiredRole requiredRole_1 = this.getRequiredRole();
									final /*@NonInvalid*/ AssemblyContext assemblyContext_3 = requiredRole_1.getAssemblyContext();
									final /*@NonInvalid*/ AllocationContext allocationContext_3 = assemblyContext_3.getAllocationContext();
									if (allocationContext_3 == null) {
										throw new InvalidValueException("Null source for \'\'http://metaModel/viewType/allocation\'::AllocationContext::container\'");
									}
									final /*@Thrown*/ metaModel.viewType.environment.Container container_1 = allocationContext_3.getContainer();
									final /*@Thrown*/ List<Link> links = container_1.getLinks();
									final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(AssemblyTables.ORD_CLSSid_Link, links);
									/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
									Iterator<Object> ITERATOR_link = BOXED_links.iterator();
									/*@Thrown*/ Boolean exists;
									while (true) {
										if (!ITERATOR_link.hasNext()) {
											if (accumulator == ValueUtil.FALSE_VALUE) {
												exists = ValueUtil.FALSE_VALUE;
											}
											else {
												throw (InvalidValueException)accumulator;
											}
											break;
										}
										/*@NonInvalid*/ Link link = (Link)ITERATOR_link.next();
										/**
										 *
										 * link.containers->includes(self.providedRole.assemblyContext.allocationContext.container)
										 */
										/*@Caught*/ Object CAUGHT_includes;
										try {
											final /*@NonInvalid*/ List<metaModel.viewType.environment.Container> containers = link.getContainers();
											final /*@NonInvalid*/ OrderedSetValue BOXED_containers = idResolver.createOrderedSetOfAll(AssemblyTables.ORD_CLSSid_Container, containers);
											final /*@NonInvalid*/ ProvidedRole providedRole_1 = this.getProvidedRole();
											final /*@NonInvalid*/ AssemblyContext assemblyContext_4 = providedRole_1.getAssemblyContext();
											final /*@NonInvalid*/ AllocationContext allocationContext_4 = assemblyContext_4.getAllocationContext();
											if (allocationContext_4 == null) {
												throw new InvalidValueException("Null source for \'\'http://metaModel/viewType/allocation\'::AllocationContext::container\'");
											}
											final /*@Thrown*/ metaModel.viewType.environment.Container container_2 = allocationContext_4.getContainer();
											final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_containers, container_2).booleanValue();
											CAUGHT_includes = includes;
										}
										catch (Exception e) {
											CAUGHT_includes = ValueUtil.createInvalidValue(e);
										}
										//
										if (CAUGHT_includes == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
											exists = ValueUtil.TRUE_VALUE;
											break;														// Stop immediately
										}
										else if (CAUGHT_includes == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
											;															// Carry on
										}
										else if (CAUGHT_includes instanceof InvalidValueException) {		// Abnormal exception evaluation result
											accumulator = CAUGHT_includes;									// Cache an exception failure
										}
										else {															// Impossible badly typed result
											accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
										}
									}
									CAUGHT_exists = exists;
								}
								catch (Exception e) {
									CAUGHT_exists = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								}
								else {
									if (CAUGHT_eq_1 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_eq_1;
									}
									if (CAUGHT_exists instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_exists;
									}
									if (CAUGHT_exists == null) {
										or = null;
									}
									else {
										or = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or = or;
						}
						catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and;
							}
							if (CAUGHT_or instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_or;
							}
							if ((CAUGHT_and == null) || (CAUGHT_or == null)) {
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				if (requiredRole != null)
					msgs = ((InternalEObject)requiredRole).eInverseRemove(this, AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR, RequiredRole.class, msgs);
				return basicSetRequiredRole((RequiredRole)otherEnd, msgs);
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				if (providedRole != null)
					msgs = ((InternalEObject)providedRole).eInverseRemove(this, AssemblyPackage.PROVIDED_ROLE__ASSEMBLY_CONNECTOR, ProvidedRole.class, msgs);
				return basicSetProvidedRole((ProvidedRole)otherEnd, msgs);
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				return basicSetRequiredRole(null, msgs);
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				return basicSetProvidedRole(null, msgs);
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				if (resolve) return getRequiredRole();
				return basicGetRequiredRole();
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				if (resolve) return getProvidedRole();
				return basicGetProvidedRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				setRequiredRole((RequiredRole)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				setProvidedRole((ProvidedRole)newValue);
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				setRequiredRole((RequiredRole)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				setProvidedRole((ProvidedRole)null);
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				return requiredRole != null;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				return providedRole != null;
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR___CONNECTED_ASSEMBLY_CONTEXTS_SHOULD_BE_ALLOCATED_TO_SAME_CONTAINER_OR_TO_LINKED_CONTAINERS__DIAGNOSTICCHAIN_MAP:
				return connectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssemblyConnectorImpl
