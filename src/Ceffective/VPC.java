/**
 */
package ceffective;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ceffective.VPC#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ceffective.VPC#getMecanismoseguridad <em>Mecanismoseguridad</em>}</li>
 *   <li>{@link ceffective.VPC#getRecurso <em>Recurso</em>}</li>
 * </ul>
 * </p>
 *
 * @see ceffective.CeffectivePackage#getVPC()
 * @model
 * @generated
 */
public interface VPC extends EObject {
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
	 * @see ceffective.CeffectivePackage#getVPC_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ceffective.VPC#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Mecanismoseguridad</b></em>' reference list.
	 * The list contents are of type {@link ceffective.MecanismoSeguridad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mecanismoseguridad</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mecanismoseguridad</em>' reference list.
	 * @see ceffective.CeffectivePackage#getVPC_Mecanismoseguridad()
	 * @model
	 * @generated
	 */
	EList<MecanismoSeguridad> getMecanismoseguridad();

	/**
	 * Returns the value of the '<em><b>Recurso</b></em>' reference list.
	 * The list contents are of type {@link ceffective.Recurso}.
	 * It is bidirectional and its opposite is '{@link ceffective.Recurso#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurso</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurso</em>' reference list.
	 * @see ceffective.CeffectivePackage#getVPC_Recurso()
	 * @see ceffective.Recurso#getVpc
	 * @model opposite="vpc"
	 * @generated
	 */
	EList<Recurso> getRecurso();

} // VPC