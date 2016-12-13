package com.quest.apm.testjavaee.ejb.sessionbean;

import javax.ejb.EJBLocalHome;
import javax.ejb.CreateException;

public interface HelloLocalHome extends EJBLocalHome
{
    public HelloLocal create () throws CreateException;
}
