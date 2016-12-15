package com.quest.apm.testjavaee.ejb.ejb2.entitybean;

import javax.ejb.*;
import java.rmi.RemoteException;

/**
 * EJB2 entity bean
 */
public abstract class BookEJB2EntityBean implements EntityBean {
    public abstract Integer getId();
    public abstract void setId(Integer id);
    public abstract String getText();
    public abstract void setText(String text);
    /*
    public abstract String getName();
    public abstract void setName(String name);
*/
    public Integer ejbCreate(Integer id, String text) throws CreateException {
        setId(id);
        setText(text);
        return null;
    }

    public void ejbPostCreate(Integer id, String text) throws CreateException {

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
