package org.example.openClosed.good;

public class John implements Entity {
    int height;
    int weight;

    public John(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public double CalculateBMI() {
        return height / (double)weight;
    }
}