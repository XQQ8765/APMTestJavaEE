package com.quest.apm.testjavaee;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Calculate {
    boolean addOperate;
    public Calculate() {
        addOperate = true;
    }

    public Calculate(boolean addOperate) {
        this.addOperate = false;
    }

    public int calculate(int i, int j) {
        if (addOperate) {
            return i + j;
        } else {
            return i - j;
        }
    }

    @Override
    public String toString() {
        return "Add:" + addOperate;
    }

    public static void main(String[] args) {
        int i = 3;
        int j = 2;
        Calculate calculate1 = new Calculate();
        int result1 = calculate1.calculate(i, j);
        System.out.println("######################Calculate result1:" + result1);

        Calculate calculate2 = new Calculate(false);
        int result2 = calculate2.calculate(i, j);
        System.out.println("######################Calculate result2:" + result2);
    }

}
