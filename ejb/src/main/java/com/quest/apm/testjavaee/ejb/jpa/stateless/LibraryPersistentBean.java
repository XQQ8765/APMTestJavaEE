package com.quest.apm.testjavaee.ejb.jpa.stateless;

import com.quest.apm.testjavaee.ejb.jpa.entity.Book;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 * Stateless Bean
 */
@Stateless
public class LibraryPersistentBean implements LibraryPersistentBeanRemote {
    @PersistenceUnit(unitName="APMTestJavaEEDataSource")
    private EntityManager entityManager;

    public LibraryPersistentBean(){
    }

    public void addBook(Book book) {
        entityManager.persist(book);
    }

    public List<Book> getBooks() {
        return entityManager.createQuery("From Book").getResultList();
    }
}
