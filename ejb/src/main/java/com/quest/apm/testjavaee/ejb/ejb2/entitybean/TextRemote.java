package com.quest.apm.testjavaee.ejb.ejb2.entitybean;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

/**
 * Created by rxiao on 12/14/2016.
 */
public interface TextRemote  extends EJBObject {
    public String getText() throws RemoteException;
    public void setText(String text) throws RemoteException;
}
