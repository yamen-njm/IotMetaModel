/**
 */
package iotModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotModel.Network#getMeasure <em>Measure</em>}</li>
 *   <li>{@link iotModel.Network#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link iotModel.Network#getMeasurand <em>Measurand</em>}</li>
 *   <li>{@link iotModel.Network#getDevice <em>Device</em>}</li>
 *   <li>{@link iotModel.Network#getBrokerconf <em>Brokerconf</em>}</li>
 *   <li>{@link iotModel.Network#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see iotModel.IotModelPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference list.
	 * The list contents are of type {@link iotModel.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference list.
	 * @see iotModel.IotModelPackage#getNetwork_Measure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measure> getMeasure();

	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' containment reference list.
	 * The list contents are of type {@link iotModel.Instrument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instrument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrument</em>' containment reference list.
	 * @see iotModel.IotModelPackage#getNetwork_Instrument()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instrument> getInstrument();

	/**
	 * Returns the value of the '<em><b>Measurand</b></em>' containment reference list.
	 * The list contents are of type {@link iotModel.Measurand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurand</em>' containment reference list.
	 * @see iotModel.IotModelPackage#getNetwork_Measurand()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measurand> getMeasurand();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link iotModel.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see iotModel.IotModelPackage#getNetwork_Device()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevice();

	/**
	 * Returns the value of the '<em><b>Brokerconf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brokerconf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brokerconf</em>' containment reference.
	 * @see #setBrokerconf(BrokerConf)
	 * @see iotModel.IotModelPackage#getNetwork_Brokerconf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BrokerConf getBrokerconf();

	/**
	 * Sets the value of the '{@link iotModel.Network#getBrokerconf <em>Brokerconf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brokerconf</em>' containment reference.
	 * @see #getBrokerconf()
	 * @generated
	 */
	void setBrokerconf(BrokerConf value);

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
	 * @see iotModel.IotModelPackage#getNetwork_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iotModel.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Network
