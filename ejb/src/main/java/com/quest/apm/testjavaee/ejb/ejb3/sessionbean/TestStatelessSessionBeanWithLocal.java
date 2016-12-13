package com.quest.apm.testjavaee.ejb.ejb3.sessionbean;

import javax.ejb.LocalBean;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestStatelessSessionBeanWithLocal
 */
@Stateless(mappedName = "TestStatelessSessionBeanWithLocal")
@LocalBean
@Local(TestStatelessSessionBeanLocal.class)
public class TestStatelessSessionBeanWithLocal extends BaseSessionBean implements TestStatelessSessionBeanLocal {
    /**
     * Default constructor.
     */
    public TestStatelessSessionBeanWithLocal() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String getStr(String s) {
		// TODO Auto-generated method stub
		return "Local:" + s;
	}
}
