package com.quest.apm.testjavaee.ejb.ejb2.department;

/**
 * Local Home interface for Enterprise Bean: Department
 */
public interface DepartmentLocalHome extends javax.ejb.EJBLocalHome {
    /**
     * Creates an instance from a key for Entity Bean: Department
     */
    public DepartmentLocal create(java.lang.Integer id)
            throws javax.ejb.CreateException;
    /**
     * Finds an instance using a key for Entity Bean: Department
     */
    public DepartmentLocal findByPrimaryKey(
            java.lang.Integer primaryKey) throws javax.ejb.FinderException;
}
