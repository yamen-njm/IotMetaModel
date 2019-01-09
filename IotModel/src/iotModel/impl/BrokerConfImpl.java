/**
 */
package iotModel.impl;

import iotModel.BrokerConf;
import iotModel.IotModelPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broker Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iotModel.impl.BrokerConfImpl#getServer <em>Server</em>}</li>
 *   <li>{@link iotModel.impl.BrokerConfImpl#getUser <em>User</em>}</li>
 *   <li>{@link iotModel.impl.BrokerConfImpl#getPort <em>Port</em>}</li>
 *   <li>{@link iotModel.impl.BrokerConfImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link iotModel.impl.BrokerConfImpl#getSslPort <em>Ssl Port</em>}</li>
 *   <li>{@link iotModel.impl.BrokerConfImpl#getWebSocketsPort <em>Web Sockets Port</em>}</li>
 *   <li>{@link iotModel.impl.BrokerConfImpl#getConnectionLimit <em>Connection Limit</em>}</li>
 *   <li>{@link iotModel.impl.BrokerConfImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrokerConfImpl extends MinimalEObjectImpl.Container implements BrokerConf {
	/**
	 * The default value of the '{@link #getServer() <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected String server = SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected BigInteger port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSslPort() <em>Ssl Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSslPort()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SSL_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSslPort() <em>Ssl Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSslPort()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sslPort = SSL_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebSocketsPort() <em>Web Sockets Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSocketsPort()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WEB_SOCKETS_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebSocketsPort() <em>Web Sockets Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSocketsPort()
	 * @generated
	 * @ordered
	 */
	protected BigInteger webSocketsPort = WEB_SOCKETS_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionLimit() <em>Connection Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CONNECTION_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionLimit() <em>Connection Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionLimit()
	 * @generated
	 * @ordered
	 */
	protected BigInteger connectionLimit = CONNECTION_LIMIT_EDEFAULT;

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
	protected BrokerConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotModelPackage.Literals.BROKER_CONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(String newServer) {
		String oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotModelPackage.BROKER_CONF__SERVER, oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotModelPackage.BROKER_CONF__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(BigInteger newPort) {
		BigInteger oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotModelPackage.BROKER_CONF__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotModelPackage.BROKER_CONF__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSslPort() {
		return sslPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSslPort(BigInteger newSslPort) {
		BigInteger oldSslPort = sslPort;
		sslPort = newSslPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotModelPackage.BROKER_CONF__SSL_PORT, oldSslPort, sslPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWebSocketsPort() {
		return webSocketsPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebSocketsPort(BigInteger newWebSocketsPort) {
		BigInteger oldWebSocketsPort = webSocketsPort;
		webSocketsPort = newWebSocketsPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotModelPackage.BROKER_CONF__WEB_SOCKETS_PORT, oldWebSocketsPort, webSocketsPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getConnectionLimit() {
		return connectionLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionLimit(BigInteger newConnectionLimit) {
		BigInteger oldConnectionLimit = connectionLimit;
		connectionLimit = newConnectionLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotModelPackage.BROKER_CONF__CONNECTION_LIMIT, oldConnectionLimit, connectionLimit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotModelPackage.BROKER_CONF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotModelPackage.BROKER_CONF__SERVER:
				return getServer();
			case IotModelPackage.BROKER_CONF__USER:
				return getUser();
			case IotModelPackage.BROKER_CONF__PORT:
				return getPort();
			case IotModelPackage.BROKER_CONF__PASSWORD:
				return getPassword();
			case IotModelPackage.BROKER_CONF__SSL_PORT:
				return getSslPort();
			case IotModelPackage.BROKER_CONF__WEB_SOCKETS_PORT:
				return getWebSocketsPort();
			case IotModelPackage.BROKER_CONF__CONNECTION_LIMIT:
				return getConnectionLimit();
			case IotModelPackage.BROKER_CONF__NAME:
				return getName();
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
			case IotModelPackage.BROKER_CONF__SERVER:
				setServer((String)newValue);
				return;
			case IotModelPackage.BROKER_CONF__USER:
				setUser((String)newValue);
				return;
			case IotModelPackage.BROKER_CONF__PORT:
				setPort((BigInteger)newValue);
				return;
			case IotModelPackage.BROKER_CONF__PASSWORD:
				setPassword((String)newValue);
				return;
			case IotModelPackage.BROKER_CONF__SSL_PORT:
				setSslPort((BigInteger)newValue);
				return;
			case IotModelPackage.BROKER_CONF__WEB_SOCKETS_PORT:
				setWebSocketsPort((BigInteger)newValue);
				return;
			case IotModelPackage.BROKER_CONF__CONNECTION_LIMIT:
				setConnectionLimit((BigInteger)newValue);
				return;
			case IotModelPackage.BROKER_CONF__NAME:
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
			case IotModelPackage.BROKER_CONF__SERVER:
				setServer(SERVER_EDEFAULT);
				return;
			case IotModelPackage.BROKER_CONF__USER:
				setUser(USER_EDEFAULT);
				return;
			case IotModelPackage.BROKER_CONF__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case IotModelPackage.BROKER_CONF__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case IotModelPackage.BROKER_CONF__SSL_PORT:
				setSslPort(SSL_PORT_EDEFAULT);
				return;
			case IotModelPackage.BROKER_CONF__WEB_SOCKETS_PORT:
				setWebSocketsPort(WEB_SOCKETS_PORT_EDEFAULT);
				return;
			case IotModelPackage.BROKER_CONF__CONNECTION_LIMIT:
				setConnectionLimit(CONNECTION_LIMIT_EDEFAULT);
				return;
			case IotModelPackage.BROKER_CONF__NAME:
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
			case IotModelPackage.BROKER_CONF__SERVER:
				return SERVER_EDEFAULT == null ? server != null : !SERVER_EDEFAULT.equals(server);
			case IotModelPackage.BROKER_CONF__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case IotModelPackage.BROKER_CONF__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case IotModelPackage.BROKER_CONF__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case IotModelPackage.BROKER_CONF__SSL_PORT:
				return SSL_PORT_EDEFAULT == null ? sslPort != null : !SSL_PORT_EDEFAULT.equals(sslPort);
			case IotModelPackage.BROKER_CONF__WEB_SOCKETS_PORT:
				return WEB_SOCKETS_PORT_EDEFAULT == null ? webSocketsPort != null : !WEB_SOCKETS_PORT_EDEFAULT.equals(webSocketsPort);
			case IotModelPackage.BROKER_CONF__CONNECTION_LIMIT:
				return CONNECTION_LIMIT_EDEFAULT == null ? connectionLimit != null : !CONNECTION_LIMIT_EDEFAULT.equals(connectionLimit);
			case IotModelPackage.BROKER_CONF__NAME:
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
		result.append(" (server: ");
		result.append(server);
		result.append(", user: ");
		result.append(user);
		result.append(", port: ");
		result.append(port);
		result.append(", password: ");
		result.append(password);
		result.append(", sslPort: ");
		result.append(sslPort);
		result.append(", webSocketsPort: ");
		result.append(webSocketsPort);
		result.append(", connectionLimit: ");
		result.append(connectionLimit);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BrokerConfImpl
