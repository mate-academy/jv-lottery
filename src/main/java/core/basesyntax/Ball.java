package core.basesyntax;

import java.awt.*;

public class Ball {
    private String color;
    private int number;




    //geter seter col
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //get set num
    public int getNumber() {
        return number;
    }
    public int setNumber(int number) {
        this.number = number;
    }
    // Override the toString() method
    @Override
    public String toString() {
        return "Ball[color=" + color + ", number=" + number + "]";
    }
}
