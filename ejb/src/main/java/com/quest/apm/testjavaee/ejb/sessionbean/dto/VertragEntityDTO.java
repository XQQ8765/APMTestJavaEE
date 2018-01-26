package com.quest.apm.testjavaee.ejb.sessionbean.dto;

import javax.ejb.*;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;


public class VertragEntityDTO implements SessionBean {

    public VertragEntityDTO() {
        List<String> s = new ArrayList<String>();
        System.out.println(s);
    }

    public VertragEntityDTO(VertragDTO vertrag) {
        KontofondsDTO dto1 = new KontofondsDTO();
        KontofondsDTO dto2 = new KontofondsDTO();

        List<KontofondsEntityDTO> kfeList = new ArrayList<KontofondsEntityDTO>();
        kfeList.add(new KontofondsEntityDTO(dto1));
        kfeList.add(new KontofondsEntityDTO(dto2));
    }

    VertragEntityDTO(VertragEntityDTO vertrag) {
    }

    public String getContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("VertragEntityDTO this:" + this);
        return sb.toString();
    }

    public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException {

    }

    public void ejbCreate () throws CreateException {}

    public void ejbRemove() throws EJBException, RemoteException {

    }

    public void ejbActivate() throws EJBException, RemoteException {

    }

    public void ejbPassivate() throws EJBException, RemoteException {

    }
}
