package com.quest.apm.testjavaee.ejb.jpa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The example see https://www.tutorialspoint.com/ejb/ejb_persistence.htm
 */
@Entity
@Table(name="book")
public class Book implements Serializable{
    private Book book;

    public Book(Book book) {
        this(2, "1");
        List<String> testsTRING = new ArrayList<String>();
        testsTRING.add("AA");
        testsTRING.add("BB");
        System.out.println("Book: testsTRING:" + testsTRING);
    }

    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
        List<String> testsTRING = new ArrayList<String>();
        testsTRING.add("AA");
        testsTRING.add("BB");
        System.out.println("Book: testsTRING:" + testsTRING);
    }

    public Book(){
        this(new Book(1, "1"));
        int i = 0;
        int j = 1;
        int k = 2;

        List<String> testsTRING = new ArrayList<String>();
        testsTRING.add("AA");
        testsTRING.add("BB");
        System.out.println("Book: testsTRING:" + testsTRING);
        Iterator<String> iterator = testsTRING.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println("Book: s:" + s);
        }

        try {
            i++;
            j++;
            k++;
            i--;
            j--;
            k--;
            System.out.println("Book:i=" + i);
            System.out.println("Book:j=" + j);
            System.out.println("Book:k=" + k);
            i = 2;
            j = 0;
            k = 1;
            i = j + k;
            i--;
        } catch (Exception e) {
            String astring = "AAAAAAAAAAAAAAAAAAAAA";
            String bstring = "BBBBBBBBBBBBBBB";
            astring = astring.toLowerCase();
            bstring = bstring.toLowerCase();
            String cstring = astring + bstring;
            throw new RuntimeException("Exception happens: cstring:" + cstring, e);
        }
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
