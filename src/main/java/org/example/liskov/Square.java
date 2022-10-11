package org.example.liskov;

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }

    /*TODO  What do we expect after running
    *  rectangle.setWith(4)
    * rectangle.setHeight(5)
    * assert(rectangle.calculateArea(), 20) */
}
