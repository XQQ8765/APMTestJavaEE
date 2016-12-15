package com.quest.apm.testjavaee.ejb.ejb2.entitybean;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.EJBLocalHome;
import javax.ejb.FinderException;

public interface BookRemoteHome extends EJBHome {
    public BookRemote findByPrimaryKey(Integer id) throws FinderException;
    public BookRemote create(Integer id, String name) throws CreateException;
    //public Collection findAll() throws FinderException;
}
