/**
 */
package iotModel;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broker Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotModel.BrokerConf#getServer <em>Server</em>}</li>
 *   <li>{@link iotModel.BrokerConf#getUser <em>User</em>}</li>
 *   <li>{@link iotModel.BrokerConf#getPort <em>Port</em>}</li>
 *   <li>{@link iotModel.BrokerConf#getPassword <em>Password</em>}</li>
 *   <li>{@link iotModel.BrokerConf#getSslPort <em>Ssl Port</em>}</li>
 *   <li>{@link iotModel.BrokerConf#getWebSocketsPort <em>Web Sockets Port</em>}</li>
 *   <li>{@link iotModel.BrokerConf#getConnectionLimit <em>Connection Limit</em>}</li>
 *   <li>{@link iotModel.BrokerConf#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see iotModel.IotModelPackage#getBrokerConf()
 * @model
 * @generated
 */
public interface BrokerConf extends EObject {
	/**
	 * Returns the value of the '<em><b>Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' attribute.
	 * @see #setServer(String)
	 * @see iotModel.IotModelPackage#getBrokerConf_Server()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getServer();

	/**
	 * Sets the value of the '{@link iotModel.BrokerConf#getServer <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' attribute.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see iotModel.IotModelPackage#getBrokerConf_User()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link iotModel.BrokerConf#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(BigInteger)
	 * @see iotModel.IotModelPackage#getBrokerConf_Port()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getPort();

	/**
	 * Sets the value of the '{@link iotModel.BrokerConf#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see iotModel.IotModelPackage#getBrokerConf_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link iotModel.BrokerConf#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Ssl Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssl Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssl Port</em>' attribute.
	 * @see #setSslPort(BigInteger)
	 * @see iotModel.IotModelPackage#getBrokerConf_SslPort()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getSslPort();

	/**
	 * Sets the value of the '{@link iotModel.BrokerConf#getSslPort <em>Ssl Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssl Port</em>' attribute.
	 * @see #getSslPort()
	 * @generated
	 */
	void setSslPort(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Web Sockets Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Sockets Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Sockets Port</em>' attribute.
	 * @see #setWebSocketsPort(BigInteger)
	 * @see iotModel.IotModelPackage#getBrokerConf_WebSocketsPort()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getWebSocketsPort();

	/**
	 * Sets the value of the '{@link iotModel.BrokerConf#getWebSocketsPort <em>Web Sockets Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Sockets Port</em>' attribute.
	 * @see #getWebSocketsPort()
	 * @generated
	 */
	void setWebSocketsPort(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Connection Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Limit</em>' attribute.
	 * @see #setConnectionLimit(BigInteger)
	 * @see iotModel.IotModelPackage#getBrokerConf_ConnectionLimit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getConnectionLimit();

	/**
	 * Sets the value of the '{@link iotModel.BrokerConf#getConnectionLimit <em>Connection Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Limit</em>' attribute.
	 * @see #getConnectionLimit()
	 * @generated
	 */
	void setConnectionLimit(BigInteger value);

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
	 * @see iotModel.IotModelPackage#getBrokerConf_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iotModel.BrokerConf#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BrokerConf
