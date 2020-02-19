/**
 */
package Ceffective.impl;

import Ceffective.CeffectivePackage;
import Ceffective.MecanismoSeguridad;
import Ceffective.Recurso;
import Ceffective.VPC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.impl.VPCImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Ceffective.impl.VPCImpl#getMecanismoseguridad <em>Mecanismoseguridad</em>}</li>
 *   <li>{@link Ceffective.impl.VPCImpl#getRecurso <em>Recurso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VPCImpl extends MinimalEObjectImpl.Container implements VPC {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMecanismoseguridad() <em>Mecanismoseguridad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMecanismoseguridad()
	 * @generated
	 * @ordered
	 */
	protected EList<MecanismoSeguridad> mecanismoseguridad;

	/**
	 * The cached value of the '{@link #getRecurso() <em>Recurso</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurso()
	 * @generated
	 * @ordered
	 */
	protected EList<Recurso> recurso;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.VPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.VPC__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MecanismoSeguridad> getMecanismoseguridad() {
		if (mecanismoseguridad == null) {
			mecanismoseguridad = new EObjectContainmentEList<MecanismoSeguridad>(MecanismoSeguridad.class, this, CeffectivePackage.VPC__MECANISMOSEGURIDAD);
		}
		return mecanismoseguridad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Recurso> getRecurso() {
		if (recurso == null) {
			recurso = new EObjectWithInverseResolvingEList<Recurso>(Recurso.class, this, CeffectivePackage.VPC__RECURSO, CeffectivePackage.RECURSO__VPC);
		}
		return recurso;
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
			case CeffectivePackage.VPC__RECURSO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecurso()).basicAdd(otherEnd, msgs);
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
			case CeffectivePackage.VPC__MECANISMOSEGURIDAD:
				return ((InternalEList<?>)getMecanismoseguridad()).basicRemove(otherEnd, msgs);
			case CeffectivePackage.VPC__RECURSO:
				return ((InternalEList<?>)getRecurso()).basicRemove(otherEnd, msgs);
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
			case CeffectivePackage.VPC__NOMBRE:
				return getNombre();
			case CeffectivePackage.VPC__MECANISMOSEGURIDAD:
				return getMecanismoseguridad();
			case CeffectivePackage.VPC__RECURSO:
				return getRecurso();
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
			case CeffectivePackage.VPC__NOMBRE:
				setNombre((String)newValue);
				return;
			case CeffectivePackage.VPC__MECANISMOSEGURIDAD:
				getMecanismoseguridad().clear();
				getMecanismoseguridad().addAll((Collection<? extends MecanismoSeguridad>)newValue);
				return;
			case CeffectivePackage.VPC__RECURSO:
				getRecurso().clear();
				getRecurso().addAll((Collection<? extends Recurso>)newValue);
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
			case CeffectivePackage.VPC__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CeffectivePackage.VPC__MECANISMOSEGURIDAD:
				getMecanismoseguridad().clear();
				return;
			case CeffectivePackage.VPC__RECURSO:
				getRecurso().clear();
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
			case CeffectivePackage.VPC__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CeffectivePackage.VPC__MECANISMOSEGURIDAD:
				return mecanismoseguridad != null && !mecanismoseguridad.isEmpty();
			case CeffectivePackage.VPC__RECURSO:
				return recurso != null && !recurso.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //VPCImpl
