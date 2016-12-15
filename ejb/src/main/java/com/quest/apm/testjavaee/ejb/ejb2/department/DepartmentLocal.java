package com.quest.apm.testjavaee.ejb.ejb2.department;

/**
 * Local interface for Enterprise Bean: Department
 */
public interface DepartmentLocal extends javax.ejb.EJBLocalObject {
    /**
     * Get accessor for persistent attribute: id
     */
    public java.lang.Integer getId();

    /**
     * Get accessor for persistent attribute: description
     */
    public java.lang.String getDescription();
    /**
     * Set accessor for persistent attribute: description
     */
    public void setDescription(java.lang.String newDescription);
}
