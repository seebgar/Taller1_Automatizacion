/**
 */
package Ceffective;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proveedor Nube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.ProveedorNube#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Ceffective.ProveedorNube#getAmbientedespliegue <em>Ambientedespliegue</em>}</li>
 *   <li>{@link Ceffective.ProveedorNube#getAutenticacionUsuario <em>Autenticacion Usuario</em>}</li>
 *   <li>{@link Ceffective.ProveedorNube#getVpc <em>Vpc</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getProveedorNube()
 * @model
 * @generated
 */
public interface ProveedorNube extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see Ceffective.CeffectivePackage#getProveedorNube_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Ceffective.ProveedorNube#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ambientedespliegue</b></em>' containment reference list.
	 * The list contents are of type {@link Ceffective.AmbienteDespliegue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambientedespliegue</em>' containment reference list.
	 * @see Ceffective.CeffectivePackage#getProveedorNube_Ambientedespliegue()
	 * @model containment="true"
	 * @generated
	 */
	EList<AmbienteDespliegue> getAmbientedespliegue();

	/**
	 * Returns the value of the '<em><b>Autenticacion Usuario</b></em>' containment reference list.
	 * The list contents are of type {@link Ceffective.AutenticacionUsuario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autenticacion Usuario</em>' containment reference list.
	 * @see Ceffective.CeffectivePackage#getProveedorNube_AutenticacionUsuario()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AutenticacionUsuario> getAutenticacionUsuario();

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' containment reference list.
	 * The list contents are of type {@link Ceffective.VPC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' containment reference list.
	 * @see Ceffective.CeffectivePackage#getProveedorNube_Vpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<VPC> getVpc();

} // ProveedorNube
