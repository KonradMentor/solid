package org.example.openClosed.good;

public class Dog implements Entity {
    int height;
    int weight;

    //some constructor

    public double CalculateBMI() {
        //make some other calculations
        return height / weight;
    }

    //some other code
}