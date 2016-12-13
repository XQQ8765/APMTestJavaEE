package com.quest.apm.testjavaee.ejb.ejb2;

import javax.ejb.EJBLocalObject;

/**
 * Reference to page:
 * http://wenku.baidu.com/link?url=Fjp3ufEOhPR2UJYF-kL1jaSwB4EUlNLEoqAIhkDxKwTc-sgEJ4BBsTvzdLFM4PGtlgbWr7QGlrYx-rLBR7_JObxE4vY45l17CtEsPom3oCK
 * https://www.safaribooksonline.com/library/view/enterprise-javabeans-third/0596002262/ch04s02.html
 */
public interface BookLocal extends EJBLocalObject {
    public int getId();
    public void setId(int id);
    public String getName();
    public void setName(String name);
}
