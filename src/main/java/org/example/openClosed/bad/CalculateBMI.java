package org.example.openClosed.bad;

public class CalculateBMI {

    public int calculateJohnBmi(Human john) {
        //some John specific code
        return john.getHeight()/john.getWeight();
    }

    public int calculateJaneBmi(Human jane) {
        //some Jane specific code
        return jane.getHeight()/jane.getWeight();
    }



}