/**
 */
package iotModel.impl;

import iotModel.BrokerConf;
import iotModel.Device;
import iotModel.Instrument;
import iotModel.IotModelPackage;
import iotModel.Measurand;
import iotModel.Measure;
import iotModel.Network;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iotModel.impl.NetworkImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link iotModel.impl.NetworkImpl#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link iotModel.impl.NetworkImpl#getMeasurand <em>Measurand</em>}</li>
 *   <li>{@link iotModel.impl.NetworkImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link iotModel.impl.NetworkImpl#getBrokerconf <em>Brokerconf</em>}</li>
 *   <li>{@link iotModel.impl.NetworkImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measure;

	/**
	 * The cached value of the '{@link #getInstrument() <em>Instrument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrument()
	 * @generated
	 * @ordered
	 */
	protected EList<Instrument> instrument;

	/**
	 * The cached value of the '{@link #getMeasurand() <em>Measurand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurand()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurand> measurand;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> device;

	/**
	 * The cached value of the '{@link #getBrokerconf() <em>Brokerconf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerconf()
	 * @generated
	 * @ordered
	 */
	protected BrokerConf brokerconf;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotModelPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasure() {
		if (measure == null) {
			measure = new EObjectContainmentEList<Measure>(Measure.class, this, IotModelPackage.NETWORK__MEASURE);
		}
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instrument> getInstrument() {
		if (instrument == null) {
			instrument = new EObjectContainmentEList<Instrument>(Instrument.class, this, IotModelPackage.NETWORK__INSTRUMENT);
		}
		return instrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurand> getMeasurand() {
		if (measurand == null) {
			measurand = new EObjectContainmentEList<Measurand>(Measurand.class, this, IotModelPackage.NETWORK__MEASURAND);
		}
		return measurand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Device>(Device.class, this, IotModelPackage.NETWORK__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerConf getBrokerconf() {
		return brokerconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrokerconf(BrokerConf newBrokerconf, NotificationChain msgs) {
		BrokerConf oldBrokerconf = brokerconf;
		brokerconf = newBrokerconf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotModelPackage.NETWORK__BROKERCONF, oldBrokerconf, newBrokerconf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrokerconf(BrokerConf newBrokerconf) {
		if (newBrokerconf != brokerconf) {
			NotificationChain msgs = null;
			if (brokerconf != null)
				msgs = ((InternalEObject)brokerconf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IotModelPackage.NETWORK__BROKERCONF, null, msgs);
			if (newBrokerconf != null)
				msgs = ((InternalEObject)newBrokerconf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IotModelPackage.NETWORK__BROKERCONF, null, msgs);
			msgs = basicSetBrokerconf(newBrokerconf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotModelPackage.NETWORK__BROKERCONF, newBrokerconf, newBrokerconf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotModelPackage.NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotModelPackage.NETWORK__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case IotModelPackage.NETWORK__INSTRUMENT:
				return ((InternalEList<?>)getInstrument()).basicRemove(otherEnd, msgs);
			case IotModelPackage.NETWORK__MEASURAND:
				return ((InternalEList<?>)getMeasurand()).basicRemove(otherEnd, msgs);
			case IotModelPackage.NETWORK__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case IotModelPackage.NETWORK__BROKERCONF:
				return basicSetBrokerconf(null, msgs);
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
			case IotModelPackage.NETWORK__MEASURE:
				return getMeasure();
			case IotModelPackage.NETWORK__INSTRUMENT:
				return getInstrument();
			case IotModelPackage.NETWORK__MEASURAND:
				return getMeasurand();
			case IotModelPackage.NETWORK__DEVICE:
				return getDevice();
			case IotModelPackage.NETWORK__BROKERCONF:
				return getBrokerconf();
			case IotModelPackage.NETWORK__NAME:
				return getName();
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
			case IotModelPackage.NETWORK__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends Measure>)newValue);
				return;
			case IotModelPackage.NETWORK__INSTRUMENT:
				getInstrument().clear();
				getInstrument().addAll((Collection<? extends Instrument>)newValue);
				return;
			case IotModelPackage.NETWORK__MEASURAND:
				getMeasurand().clear();
				getMeasurand().addAll((Collection<? extends Measurand>)newValue);
				return;
			case IotModelPackage.NETWORK__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends Device>)newValue);
				return;
			case IotModelPackage.NETWORK__BROKERCONF:
				setBrokerconf((BrokerConf)newValue);
				return;
			case IotModelPackage.NETWORK__NAME:
				setName((String)newValue);
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
			case IotModelPackage.NETWORK__MEASURE:
				getMeasure().clear();
				return;
			case IotModelPackage.NETWORK__INSTRUMENT:
				getInstrument().clear();
				return;
			case IotModelPackage.NETWORK__MEASURAND:
				getMeasurand().clear();
				return;
			case IotModelPackage.NETWORK__DEVICE:
				getDevice().clear();
				return;
			case IotModelPackage.NETWORK__BROKERCONF:
				setBrokerconf((BrokerConf)null);
				return;
			case IotModelPackage.NETWORK__NAME:
				setName(NAME_EDEFAULT);
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
			case IotModelPackage.NETWORK__MEASURE:
				return measure != null && !measure.isEmpty();
			case IotModelPackage.NETWORK__INSTRUMENT:
				return instrument != null && !instrument.isEmpty();
			case IotModelPackage.NETWORK__MEASURAND:
				return measurand != null && !measurand.isEmpty();
			case IotModelPackage.NETWORK__DEVICE:
				return device != null && !device.isEmpty();
			case IotModelPackage.NETWORK__BROKERCONF:
				return brokerconf != null;
			case IotModelPackage.NETWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
