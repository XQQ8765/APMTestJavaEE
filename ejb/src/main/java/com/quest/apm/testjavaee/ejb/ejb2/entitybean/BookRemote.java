package com.quest.apm.testjavaee.ejb.ejb2.entitybean;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

/**
 * Reference to page:
 * http://wenku.baidu.com/link?url=Fjp3ufEOhPR2UJYF-kL1jaSwB4EUlNLEoqAIhkDxKwTc-sgEJ4BBsTvzdLFM4PGtlgbWr7QGlrYx-rLBR7_JObxE4vY45l17CtEsPom3oCK
 * https://www.safaribooksonline.com/library/view/enterprise-javabeans-third/0596002262/ch04s02.html
 */
public interface BookRemote extends EJBObject {
    public Integer getId() throws RemoteException;
    public void setId(Integer id) throws RemoteException;
    /*
    public String getName() throws RemoteException;
    public void setName(String name) throws RemoteException;
    */
    public String getText() throws RemoteException;
    public void setText(String text) throws RemoteException;
}
