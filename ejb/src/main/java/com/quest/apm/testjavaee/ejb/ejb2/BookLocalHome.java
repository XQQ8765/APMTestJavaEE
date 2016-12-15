package com.quest.apm.testjavaee.ejb.ejb2;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
import javax.ejb.FinderException;
import java.util.Collection;

public interface BookLocalHome extends EJBLocalHome {
    public BookLocal findByPrimaryKey(int bookId) throws FinderException;
    public BookLocal create(int bookId, String bookName) throws CreateException;
    //public Collection findAll() throws FinderException;
}
