/**
 * MessageService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.mldn.MySpring.service.impl;

public interface MessageService extends javax.xml.rpc.Service {
    public java.lang.String getMessageServiceImplPortAddress();

    public cn.mldn.MySpring.service.IMessageService getMessageServiceImplPort() throws javax.xml.rpc.ServiceException;

    public cn.mldn.MySpring.service.IMessageService getMessageServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
