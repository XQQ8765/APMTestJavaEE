package com.quest.apm.testjavaee.ejb.ejb2.entitybean;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.EJBLocalHome;
import javax.ejb.FinderException;
import java.rmi.RemoteException;

public interface BookRemoteHome extends EJBHome {
    public BookRemote findByPrimaryKey(Integer id) throws FinderException, RemoteException;
    public BookRemote create(Integer id, String name) throws CreateException, RemoteException;
    //public Collection findAll() throws FinderException;
}
