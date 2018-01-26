package com.quest.apm.testjavaee.ejb.sessionbean.dto;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

public interface VertragEntityDTOHome extends EJBLocalHome
{
    public VertragEntityDTOLocal create() throws CreateException;
}
