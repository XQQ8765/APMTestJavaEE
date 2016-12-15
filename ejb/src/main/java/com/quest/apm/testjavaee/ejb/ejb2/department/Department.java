package com.quest.apm.testjavaee.ejb.ejb2.department;

/**
 * See: http://www.ibm.com/developerworks/websphere/library/techarticles/0511_alcorn/0511_alcorn.html
 * Remote interface for Enterprise Bean: Department
 */
public interface Department extends javax.ejb.EJBObject {
    /**
     * Get accessor for persistent attribute: id
     */
    public java.lang.Integer getId() throws java.rmi.RemoteException;

    /**
     * Get accessor for persistent attribute: description
     */
    public java.lang.String getDescription() throws java.rmi.RemoteException;
    /**
     * Set accessor for persistent attribute: description
     */
    public void setDescription(java.lang.String newDescription)
            throws java.rmi.RemoteException;
}
