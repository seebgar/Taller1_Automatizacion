/**
 */
package ceffective;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mecanismo Seguridad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ceffective.MecanismoSeguridad#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ceffective.MecanismoSeguridad#getZonaNombre <em>Zona Nombre</em>}</li>
 *   <li>{@link ceffective.MecanismoSeguridad#getZonaDisponibilidad <em>Zona Disponibilidad</em>}</li>
 *   <li>{@link ceffective.MecanismoSeguridad#getVpc <em>Vpc</em>}</li>
 *   <li>{@link ceffective.MecanismoSeguridad#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see ceffective.CeffectivePackage#getMecanismoSeguridad()
 * @model abstract="true"
 * @generated
 */
public interface MecanismoSeguridad extends EObject {
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
	 * @see ceffective.CeffectivePackage#getMecanismoSeguridad_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ceffective.MecanismoSeguridad#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zona Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zona Nombre</em>' attribute.
	 * @see #setZonaNombre(String)
	 * @see ceffective.CeffectivePackage#getMecanismoSeguridad_ZonaNombre()
	 * @model
	 * @generated
	 */
	String getZonaNombre();

	/**
	 * Sets the value of the '{@link ceffective.MecanismoSeguridad#getZonaNombre <em>Zona Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zona Nombre</em>' attribute.
	 * @see #getZonaNombre()
	 * @generated
	 */
	void setZonaNombre(String value);

	/**
	 * Returns the value of the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zona Disponibilidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #setZonaDisponibilidad(String)
	 * @see ceffective.CeffectivePackage#getMecanismoSeguridad_ZonaDisponibilidad()
	 * @model
	 * @generated
	 */
	String getZonaDisponibilidad();

	/**
	 * Sets the value of the '{@link ceffective.MecanismoSeguridad#getZonaDisponibilidad <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #getZonaDisponibilidad()
	 * @generated
	 */
	void setZonaDisponibilidad(String value);

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
	 * @see ceffective.CeffectivePackage#getMecanismoSeguridad_Vpc()
	 * @model
	 * @generated
	 */
	VPC getVpc();

	/**
	 * Sets the value of the '{@link ceffective.MecanismoSeguridad#getVpc <em>Vpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc</em>' reference.
	 * @see #getVpc()
	 * @generated
	 */
	void setVpc(VPC value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ceffective.CeffectivePackage#getMecanismoSeguridad_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ceffective.MecanismoSeguridad#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MecanismoSeguridad
