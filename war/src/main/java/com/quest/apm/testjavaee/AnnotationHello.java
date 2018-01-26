package com.quest.apm.testjavaee;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;

/**
 * For testing issue https://jira.labs.quest.com/browse/FAPM-2280
 * Annotation usage refer to page: http://www.jb51.net/article/55371.htm
 */
public class AnnotationHello extends Hello {

    @Deprecated//In method attribute "RuntimeVisibleAnnotations"
    @Override
    @SuppressWarnings({"warn1", "warn2"})
    @Test_Retention (doTestRetention="Test Retention message1.")//In method attribute "RuntimeVisibleAnnotations"
    @Test_Documented (doTestDocument = "Test Documented message1.")//In method attribute "RuntimeInvisibleAnnotations"
    @Test_Retention2(index=2, content="Test Retention message2.")//In method attribute "RuntimeVisibleAnnotations"
    @Test_Documented2(index=2, content="Test Documented message2.")//In method attribute "RuntimeInvisibleAnnotations"
    public String hello() {
        return "hello annotaion, time:" + new Date();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    public @interface Test_Retention {
        String doTestRetention();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    public @interface Test_Retention2 {
        int index();
        String content();
    }

    @Documented
    public @interface Test_Documented {
        String doTestDocument();
    }

    @Documented
    public @interface Test_Documented2 {
        int index();
        String content();
    }

    public static void main(String[] args) {
        String s = new AnnotationHello().hello();
        System.out.println(s);
    }

}

abstract class Hello {
    public abstract String hello();
}
