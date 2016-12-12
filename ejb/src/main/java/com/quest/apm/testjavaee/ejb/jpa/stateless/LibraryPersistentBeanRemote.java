package com.quest.apm.testjavaee.ejb.jpa.stateless;


import com.quest.apm.testjavaee.ejb.jpa.entity.Book;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface LibraryPersistentBeanRemote {

    void addBook(Book bookName);

    List<Book> getBooks();

}
