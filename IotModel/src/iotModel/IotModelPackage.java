/**
 */
package iotModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iotModel.IotModelFactory
 * @model kind="package"
 * @generated
 */
public interface IotModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iotModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/iotModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iotModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IotModelPackage eINSTANCE = iotModel.impl.IotModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link iotModel.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotModel.impl.NetworkImpl
	 * @see iotModel.impl.IotModelPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__MEASURE = 0;

	/**
	 * The feature id for the '<em><b>Instrument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__INSTRUMENT = 1;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__MEASURAND = 2;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DEVICE = 3;

	/**
	 * The feature id for the '<em><b>Brokerconf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__BROKERCONF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = 5;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotModel.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotModel.impl.DeviceImpl
	 * @see iotModel.impl.IotModelPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__BINDING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Instrument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__INSTRUMENT = 2;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotModel.impl.InstrumentImpl <em>Instrument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotModel.impl.InstrumentImpl
	 * @see iotModel.impl.IotModelPackageImpl#getInstrument()
	 * @generated
	 */
	int INSTRUMENT = 2;

	/**
	 * The feature id for the '<em><b>Interet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT__INTERET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotModel.impl.MeasurandImpl <em>Measurand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotModel.impl.MeasurandImpl
	 * @see iotModel.impl.IotModelPackageImpl#getMeasurand()
	 * @generated
	 */
	int MEASURAND = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND__NAME = 0;

	/**
	 * The number of structural features of the '<em>Measurand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Measurand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotModel.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotModel.impl.MeasureImpl
	 * @see iotModel.impl.IotModelPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotModel.impl.InterestImpl <em>Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotModel.impl.InterestImpl
	 * @see iotModel.impl.IotModelPackageImpl#getInterest()
	 * @generated
	 */
	int INTEREST = 5;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST__NAME = 1;

	/**
	 * The number of structural features of the '<em>Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotModel.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotModel.impl.BindingImpl
	 * @see iotModel.impl.IotModelPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 6;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__MEASURAND = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAME = 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__FEATURES = 2;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotModel.impl.FeaturesImpl <em>Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotModel.impl.FeaturesImpl
	 * @see iotModel.impl.IotModelPackageImpl#getFeatures()
	 * @generated
	 */
	int FEATURES = 7;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES__MODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES__MEASURE = 2;

	/**
	 * The number of structural features of the '<em>Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotModel.impl.BrokerConfImpl <em>Broker Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotModel.impl.BrokerConfImpl
	 * @see iotModel.impl.IotModelPackageImpl#getBrokerConf()
	 * @generated
	 */
	int BROKER_CONF = 8;

	/**
	 * The feature id for the '<em><b>Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CONF__SERVER = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CONF__USER = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CONF__PORT = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CONF__PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Ssl Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CONF__SSL_PORT = 4;

	/**
	 * The feature id for the '<em><b>Web Sockets Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CONF__WEB_SOCKETS_PORT = 5;

	/**
	 * The feature id for the '<em><b>Connection Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CONF__CONNECTION_LIMIT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CONF__NAME = 7;

	/**
	 * The number of structural features of the '<em>Broker Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CONF_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Broker Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CONF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotModel.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotModel.Mode
	 * @see iotModel.impl.IotModelPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 9;

	/**
	 * The meta object id for the '{@link iotModel.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotModel.DataType
	 * @see iotModel.impl.IotModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link iotModel.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see iotModel.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link iotModel.Network#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see iotModel.Network#getMeasure()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link iotModel.Network#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instrument</em>'.
	 * @see iotModel.Network#getInstrument()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Instrument();

	/**
	 * Returns the meta object for the containment reference list '{@link iotModel.Network#getMeasurand <em>Measurand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurand</em>'.
	 * @see iotModel.Network#getMeasurand()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Measurand();

	/**
	 * Returns the meta object for the containment reference list '{@link iotModel.Network#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device</em>'.
	 * @see iotModel.Network#getDevice()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Device();

	/**
	 * Returns the meta object for the containment reference '{@link iotModel.Network#getBrokerconf <em>Brokerconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Brokerconf</em>'.
	 * @see iotModel.Network#getBrokerconf()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Brokerconf();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotModel.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for class '{@link iotModel.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see iotModel.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link iotModel.Device#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see iotModel.Device#getBinding()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Binding();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotModel.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the reference list '{@link iotModel.Device#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instrument</em>'.
	 * @see iotModel.Device#getInstrument()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Instrument();

	/**
	 * Returns the meta object for class '{@link iotModel.Instrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrument</em>'.
	 * @see iotModel.Instrument
	 * @generated
	 */
	EClass getInstrument();

	/**
	 * Returns the meta object for the containment reference list '{@link iotModel.Instrument#getInteret <em>Interet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interet</em>'.
	 * @see iotModel.Instrument#getInteret()
	 * @see #getInstrument()
	 * @generated
	 */
	EReference getInstrument_Interet();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.Instrument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotModel.Instrument#getName()
	 * @see #getInstrument()
	 * @generated
	 */
	EAttribute getInstrument_Name();

	/**
	 * Returns the meta object for class '{@link iotModel.Measurand <em>Measurand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurand</em>'.
	 * @see iotModel.Measurand
	 * @generated
	 */
	EClass getMeasurand();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.Measurand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotModel.Measurand#getName()
	 * @see #getMeasurand()
	 * @generated
	 */
	EAttribute getMeasurand_Name();

	/**
	 * Returns the meta object for class '{@link iotModel.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see iotModel.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.Measure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotModel.Measure#getName()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Name();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.Measure#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iotModel.Measure#getType()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Type();

	/**
	 * Returns the meta object for class '{@link iotModel.Interest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interest</em>'.
	 * @see iotModel.Interest
	 * @generated
	 */
	EClass getInterest();

	/**
	 * Returns the meta object for the containment reference list '{@link iotModel.Interest#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see iotModel.Interest#getFeatures()
	 * @see #getInterest()
	 * @generated
	 */
	EReference getInterest_Features();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.Interest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotModel.Interest#getName()
	 * @see #getInterest()
	 * @generated
	 */
	EAttribute getInterest_Name();

	/**
	 * Returns the meta object for class '{@link iotModel.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see iotModel.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link iotModel.Binding#getMeasurand <em>Measurand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurand</em>'.
	 * @see iotModel.Binding#getMeasurand()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Measurand();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.Binding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotModel.Binding#getName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Name();

	/**
	 * Returns the meta object for the reference '{@link iotModel.Binding#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Features</em>'.
	 * @see iotModel.Binding#getFeatures()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Features();

	/**
	 * Returns the meta object for class '{@link iotModel.Features <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features</em>'.
	 * @see iotModel.Features
	 * @generated
	 */
	EClass getFeatures();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.Features#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see iotModel.Features#getMode()
	 * @see #getFeatures()
	 * @generated
	 */
	EAttribute getFeatures_Mode();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.Features#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotModel.Features#getName()
	 * @see #getFeatures()
	 * @generated
	 */
	EAttribute getFeatures_Name();

	/**
	 * Returns the meta object for the reference '{@link iotModel.Features#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measure</em>'.
	 * @see iotModel.Features#getMeasure()
	 * @see #getFeatures()
	 * @generated
	 */
	EReference getFeatures_Measure();

	/**
	 * Returns the meta object for class '{@link iotModel.BrokerConf <em>Broker Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broker Conf</em>'.
	 * @see iotModel.BrokerConf
	 * @generated
	 */
	EClass getBrokerConf();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.BrokerConf#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server</em>'.
	 * @see iotModel.BrokerConf#getServer()
	 * @see #getBrokerConf()
	 * @generated
	 */
	EAttribute getBrokerConf_Server();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.BrokerConf#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see iotModel.BrokerConf#getUser()
	 * @see #getBrokerConf()
	 * @generated
	 */
	EAttribute getBrokerConf_User();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.BrokerConf#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see iotModel.BrokerConf#getPort()
	 * @see #getBrokerConf()
	 * @generated
	 */
	EAttribute getBrokerConf_Port();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.BrokerConf#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see iotModel.BrokerConf#getPassword()
	 * @see #getBrokerConf()
	 * @generated
	 */
	EAttribute getBrokerConf_Password();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.BrokerConf#getSslPort <em>Ssl Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssl Port</em>'.
	 * @see iotModel.BrokerConf#getSslPort()
	 * @see #getBrokerConf()
	 * @generated
	 */
	EAttribute getBrokerConf_SslPort();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.BrokerConf#getWebSocketsPort <em>Web Sockets Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Sockets Port</em>'.
	 * @see iotModel.BrokerConf#getWebSocketsPort()
	 * @see #getBrokerConf()
	 * @generated
	 */
	EAttribute getBrokerConf_WebSocketsPort();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.BrokerConf#getConnectionLimit <em>Connection Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Limit</em>'.
	 * @see iotModel.BrokerConf#getConnectionLimit()
	 * @see #getBrokerConf()
	 * @generated
	 */
	EAttribute getBrokerConf_ConnectionLimit();

	/**
	 * Returns the meta object for the attribute '{@link iotModel.BrokerConf#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotModel.BrokerConf#getName()
	 * @see #getBrokerConf()
	 * @generated
	 */
	EAttribute getBrokerConf_Name();

	/**
	 * Returns the meta object for enum '{@link iotModel.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see iotModel.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the meta object for enum '{@link iotModel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see iotModel.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IotModelFactory getIotModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iotModel.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotModel.impl.NetworkImpl
		 * @see iotModel.impl.IotModelPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__MEASURE = eINSTANCE.getNetwork_Measure();

		/**
		 * The meta object literal for the '<em><b>Instrument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__INSTRUMENT = eINSTANCE.getNetwork_Instrument();

		/**
		 * The meta object literal for the '<em><b>Measurand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__MEASURAND = eINSTANCE.getNetwork_Measurand();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__DEVICE = eINSTANCE.getNetwork_Device();

		/**
		 * The meta object literal for the '<em><b>Brokerconf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__BROKERCONF = eINSTANCE.getNetwork_Brokerconf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '{@link iotModel.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotModel.impl.DeviceImpl
		 * @see iotModel.impl.IotModelPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__BINDING = eINSTANCE.getDevice_Binding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Instrument</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__INSTRUMENT = eINSTANCE.getDevice_Instrument();

		/**
		 * The meta object literal for the '{@link iotModel.impl.InstrumentImpl <em>Instrument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotModel.impl.InstrumentImpl
		 * @see iotModel.impl.IotModelPackageImpl#getInstrument()
		 * @generated
		 */
		EClass INSTRUMENT = eINSTANCE.getInstrument();

		/**
		 * The meta object literal for the '<em><b>Interet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUMENT__INTERET = eINSTANCE.getInstrument_Interet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUMENT__NAME = eINSTANCE.getInstrument_Name();

		/**
		 * The meta object literal for the '{@link iotModel.impl.MeasurandImpl <em>Measurand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotModel.impl.MeasurandImpl
		 * @see iotModel.impl.IotModelPackageImpl#getMeasurand()
		 * @generated
		 */
		EClass MEASURAND = eINSTANCE.getMeasurand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURAND__NAME = eINSTANCE.getMeasurand_Name();

		/**
		 * The meta object literal for the '{@link iotModel.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotModel.impl.MeasureImpl
		 * @see iotModel.impl.IotModelPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__NAME = eINSTANCE.getMeasure_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__TYPE = eINSTANCE.getMeasure_Type();

		/**
		 * The meta object literal for the '{@link iotModel.impl.InterestImpl <em>Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotModel.impl.InterestImpl
		 * @see iotModel.impl.IotModelPackageImpl#getInterest()
		 * @generated
		 */
		EClass INTEREST = eINSTANCE.getInterest();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEREST__FEATURES = eINSTANCE.getInterest_Features();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEREST__NAME = eINSTANCE.getInterest_Name();

		/**
		 * The meta object literal for the '{@link iotModel.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotModel.impl.BindingImpl
		 * @see iotModel.impl.IotModelPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Measurand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__MEASURAND = eINSTANCE.getBinding_Measurand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__NAME = eINSTANCE.getBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__FEATURES = eINSTANCE.getBinding_Features();

		/**
		 * The meta object literal for the '{@link iotModel.impl.FeaturesImpl <em>Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotModel.impl.FeaturesImpl
		 * @see iotModel.impl.IotModelPackageImpl#getFeatures()
		 * @generated
		 */
		EClass FEATURES = eINSTANCE.getFeatures();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES__MODE = eINSTANCE.getFeatures_Mode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES__NAME = eINSTANCE.getFeatures_Name();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES__MEASURE = eINSTANCE.getFeatures_Measure();

		/**
		 * The meta object literal for the '{@link iotModel.impl.BrokerConfImpl <em>Broker Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotModel.impl.BrokerConfImpl
		 * @see iotModel.impl.IotModelPackageImpl#getBrokerConf()
		 * @generated
		 */
		EClass BROKER_CONF = eINSTANCE.getBrokerConf();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER_CONF__SERVER = eINSTANCE.getBrokerConf_Server();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER_CONF__USER = eINSTANCE.getBrokerConf_User();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER_CONF__PORT = eINSTANCE.getBrokerConf_Port();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER_CONF__PASSWORD = eINSTANCE.getBrokerConf_Password();

		/**
		 * The meta object literal for the '<em><b>Ssl Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER_CONF__SSL_PORT = eINSTANCE.getBrokerConf_SslPort();

		/**
		 * The meta object literal for the '<em><b>Web Sockets Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER_CONF__WEB_SOCKETS_PORT = eINSTANCE.getBrokerConf_WebSocketsPort();

		/**
		 * The meta object literal for the '<em><b>Connection Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER_CONF__CONNECTION_LIMIT = eINSTANCE.getBrokerConf_ConnectionLimit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER_CONF__NAME = eINSTANCE.getBrokerConf_Name();

		/**
		 * The meta object literal for the '{@link iotModel.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotModel.Mode
		 * @see iotModel.impl.IotModelPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link iotModel.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotModel.DataType
		 * @see iotModel.impl.IotModelPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //IotModelPackage
