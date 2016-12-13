package com.quest.apm.testjavaee.ejb.ejb3.sessionbean;

import javax.ejb.*;

/**
 * Session Bean implementation class TestStatelessSessionBeanWithRemote
 */
@Stateless(mappedName = "TestStatelessSessionBeanWithRemote")
@LocalBean
@Remote(TestStatelessSessionBeanRemote.class)
public class TestStatelessSessionBeanWithRemote extends BaseSessionBean implements TestStatelessSessionBeanRemote {
    /**
     * Default constructor.
     */
    public TestStatelessSessionBeanWithRemote() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String getStr(String s) {
		// TODO Auto-generated method stub
		return "Remote:" + s;
	}
}
