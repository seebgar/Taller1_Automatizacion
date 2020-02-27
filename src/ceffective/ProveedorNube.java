/**
 */
package ceffective;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proveedor Nube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ceffective.ProveedorNube#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ceffective.ProveedorNube#getAutenticacionUsuario <em>Autenticacion Usuario</em>}</li>
 *   <li>{@link ceffective.ProveedorNube#getAmbientedespliegue <em>Ambientedespliegue</em>}</li>
 *   <li>{@link ceffective.ProveedorNube#getMecanismoseguridad <em>Mecanismoseguridad</em>}</li>
 *   <li>{@link ceffective.ProveedorNube#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @see ceffective.CeffectivePackage#getProveedorNube()
 * @model
 * @generated
 */
public interface ProveedorNube extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see ceffective.CeffectivePackage#getProveedorNube_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ceffective.ProveedorNube#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Autenticacion Usuario</b></em>' containment reference list.
	 * The list contents are of type {@link ceffective.AutenticacionUsuario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autenticacion Usuario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autenticacion Usuario</em>' containment reference list.
	 * @see ceffective.CeffectivePackage#getProveedorNube_AutenticacionUsuario()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AutenticacionUsuario> getAutenticacionUsuario();

	/**
	 * Returns the value of the '<em><b>Ambientedespliegue</b></em>' containment reference list.
	 * The list contents are of type {@link ceffective.AmbienteDespliegue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambientedespliegue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambientedespliegue</em>' containment reference list.
	 * @see ceffective.CeffectivePackage#getProveedorNube_Ambientedespliegue()
	 * @model containment="true"
	 * @generated
	 */
	EList<AmbienteDespliegue> getAmbientedespliegue();

	/**
	 * Returns the value of the '<em><b>Mecanismoseguridad</b></em>' containment reference list.
	 * The list contents are of type {@link ceffective.MecanismoSeguridad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mecanismoseguridad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mecanismoseguridad</em>' containment reference list.
	 * @see ceffective.CeffectivePackage#getProveedorNube_Mecanismoseguridad()
	 * @model containment="true"
	 * @generated
	 */
	EList<MecanismoSeguridad> getMecanismoseguridad();

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' reference.
	 * @see #setVpc(VPC)
	 * @see ceffective.CeffectivePackage#getProveedorNube_Vpc()
	 * @model
	 * @generated
	 */
	VPC getVpc();

	/**
	 * Sets the value of the '{@link ceffective.ProveedorNube#getVpc <em>Vpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc</em>' reference.
	 * @see #getVpc()
	 * @generated
	 */
	void setVpc(VPC value);

} // ProveedorNube