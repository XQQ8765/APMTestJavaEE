package com.quest.apm.testjavaee.ejb.sessionbean;

import javax.ejb.EJBLocalObject;

public interface HelloLocal extends EJBLocalObject
{
    public String helloWorld ();
}
