package com.quest.apm.testjavaee.ejb.ejb2;

import javax.ejb.*;
import java.rmi.RemoteException;

/**
 * EJB2 entity bean
 */
public abstract class BookEJB2Bean implements EntityBean {
    public abstract int getId();
    public abstract void setId(int id);
    public abstract String getName();
    public abstract void setName(String name);

    public BookLocal ejbCreate(Integer bookId, String bookName) throws CreateException {
        setId(bookId);
        setName(bookName);
        return null;
    }

    public void ejbPostCreate(Integer bookId, String bookName) throws CreateException {

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
