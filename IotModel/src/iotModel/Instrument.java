/**
 */
package iotModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instrument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotModel.Instrument#getInteret <em>Interet</em>}</li>
 *   <li>{@link iotModel.Instrument#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see iotModel.IotModelPackage#getInstrument()
 * @model
 * @generated
 */
public interface Instrument extends EObject {
	/**
	 * Returns the value of the '<em><b>Interet</b></em>' containment reference list.
	 * The list contents are of type {@link iotModel.Interest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interet</em>' containment reference list.
	 * @see iotModel.IotModelPackage#getInstrument_Interet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Interest> getInteret();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iotModel.IotModelPackage#getInstrument_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iotModel.Instrument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Instrument
