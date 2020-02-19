/**
 */
package Ceffective.impl;

import Ceffective.AutenticacionFirma;
import Ceffective.CeffectivePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autenticacion Firma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.impl.AutenticacionFirmaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Ceffective.impl.AutenticacionFirmaImpl#getCertificado <em>Certificado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutenticacionFirmaImpl extends AutenticacionUsuarioImpl implements AutenticacionFirma {
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
	 * The default value of the '{@link #getCertificado() <em>Certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificado()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificado() <em>Certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificado()
	 * @generated
	 * @ordered
	 */
	protected String certificado = CERTIFICADO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutenticacionFirmaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.AUTENTICACION_FIRMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.AUTENTICACION_FIRMA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertificado() {
		return certificado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificado(String newCertificado) {
		String oldCertificado = certificado;
		certificado = newCertificado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.AUTENTICACION_FIRMA__CERTIFICADO, oldCertificado, certificado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.AUTENTICACION_FIRMA__NOMBRE:
				return getNombre();
			case CeffectivePackage.AUTENTICACION_FIRMA__CERTIFICADO:
				return getCertificado();
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
			case CeffectivePackage.AUTENTICACION_FIRMA__NOMBRE:
				setNombre((String)newValue);
				return;
			case CeffectivePackage.AUTENTICACION_FIRMA__CERTIFICADO:
				setCertificado((String)newValue);
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
			case CeffectivePackage.AUTENTICACION_FIRMA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CeffectivePackage.AUTENTICACION_FIRMA__CERTIFICADO:
				setCertificado(CERTIFICADO_EDEFAULT);
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
			case CeffectivePackage.AUTENTICACION_FIRMA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CeffectivePackage.AUTENTICACION_FIRMA__CERTIFICADO:
				return CERTIFICADO_EDEFAULT == null ? certificado != null : !CERTIFICADO_EDEFAULT.equals(certificado);
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
		result.append(", certificado: ");
		result.append(certificado);
		result.append(')');
		return result.toString();
	}

} //AutenticacionFirmaImpl
