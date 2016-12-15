package com.quest.apm.testjavaee.ejb.ejb2.department;

/**
 * Home interface for Enterprise Bean: Department
 */
public interface DepartmentHome extends javax.ejb.EJBHome {
    /**
     * Creates an instance from a key for Entity Bean: Department
     */
    public Department create(java.lang.Integer id)
            throws javax.ejb.CreateException,
            java.rmi.RemoteException;
    /**
     * Finds an instance using a key for Entity Bean: Department
     */
    public Department findByPrimaryKey(
            java.lang.Integer primaryKey)
            throws javax.ejb.FinderException,
            java.rmi.RemoteException;
}
