package org.example.interfaceSegregation.bad;

public class Jane implements Teacher {

    public void english() {
        System.out.println("teach eng !");
    }

    public void biology() {
        //not needded
    }

    public void chemistry() {
        //not needded
    }

    public void mathematics() {
        //not needded
    }
}
