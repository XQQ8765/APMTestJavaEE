package com.quest.apm.testjavaee.ejb.sessionbean;

import javax.ejb.*;

/**
 * Hello Stateful Session Bean
 * The example is in page: https://docs.oracle.com/cd/B14504_01/dl/web/B10321_01/jdbcejb.htm#1012583
 */
public class HelloBean implements SessionBean
{
    public String helloWorld ()   {
    return "Hello from com.quest.apm.testjavaee.ejb.sessionbean.HelloBean";
}

    public void ejbCreate () throws CreateException {}
    public void ejbRemove () {}
    public void setSessionContext (SessionContext ctx) {}
    public void ejbActivate () {}
    public void ejbPassivate () {}
}
