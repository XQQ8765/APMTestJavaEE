package com.quest.apm.testjavaee.ejb.ejb2.entitybean;

import javax.ejb.*;
import java.rmi.RemoteException;

public abstract class TextEJB2EntityBean  implements EntityBean {
    public abstract String getText();
    public abstract void setText(String text);

    public BookRemote ejbCreate(String text) throws CreateException {
        setText(text);
        return null;
    }

    public void ejbPostCreate(String text) throws CreateException {

    }
    public void setEntityContext(EntityContext entityContext) throws EJBException, RemoteException {

    }

    public void unsetEntityContext() throws EJBException, RemoteException {

    }

    public void ejbRemove() throws RemoveException, EJBException, RemoteException {

    }

    public void ejbActivate() throws EJBException, RemoteException {

    }

    public void ejbPassivate() throws EJBException, RemoteException {

    }

    public void ejbLoad() throws EJBException, RemoteException {

    }

    public void ejbStore() throws EJBException, RemoteException {

    }
}
