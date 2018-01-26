package com.quest.apm.testjavaee.ejb.ejb3.sessionbean;

import javax.ejb.LocalBean;
import javax.ejb.Local;
import javax.ejb.Stateless;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Session Bean implementation class TestStatelessSessionBeanWithLocal
 */
@Stateless(mappedName = "TestStatelessSessionBeanWithLocal")
@LocalBean
@Local(TestStatelessSessionBeanLocal.class)
public class TestStatelessSessionBeanWithLocal extends BaseSessionBean implements TestStatelessSessionBeanLocal, Serializable {
	private static final long serialVersionUID = 1L;
	private List<String> kontoFonds;

	/**
	 * Default constructor.
	 */
	public TestStatelessSessionBeanWithLocal() {
		List<String> testsTRING = new ArrayList<String>();
		testsTRING.add("AA");
		testsTRING.add("BB");
		Iterator<String> iterator = testsTRING.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println("TestStatelessSessionBeanWithLocal(): s:" + s);
		}
		this.kontoFonds = testsTRING;
		// TODO Auto-generated constructor stub
	}

	public TestStatelessSessionBeanWithLocal(int i) {
		List<String> testsTRING = new ArrayList<String>();
		testsTRING.add("AA");
		testsTRING.add("BB");
		Iterator<String> iterator = testsTRING.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println("TestStatelessSessionBeanWithLocal(int i): s:" + s);
		}
		this.kontoFonds = testsTRING;
		System.out.println("TestStatelessSessionBeanWithLocal(int i):" + i);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getStr(String s) {
		TestStatelessSessionBeanWithLocal t = new TestStatelessSessionBeanWithLocal(3);
		System.out.println("getStr(String s) TestStatelessSessionBeanWithLocal t=" + t);
		// TODO Auto-generated method stub
		List<String> testsTRING = new ArrayList<String>();
		testsTRING.add("AA");
		testsTRING.add("BB");
		Iterator<String> iterator = testsTRING.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println("getStr(String s): str:" + str);
		}
		return "getStr(String s) TestStatelessSessionBeanWithLocal t=" + this;
	}
}
