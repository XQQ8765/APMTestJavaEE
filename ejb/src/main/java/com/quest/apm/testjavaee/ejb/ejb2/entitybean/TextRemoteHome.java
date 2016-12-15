package com.quest.apm.testjavaee.ejb.ejb2.entitybean;

import javax.ejb.CreateException;
import javax.ejb.FinderException;

/**
 * Created by rxiao on 12/14/2016.
 */
public interface TextRemoteHome {
    public TextRemote findByPrimaryKey(String text) throws FinderException;
    public TextRemote create(String text) throws CreateException;
}
