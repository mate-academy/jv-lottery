package fch.models;

public class Ball {

    /*
    Ball class

    Ball has a color (Enum) and number (int).

    Overrides toString method.
     */


    public Color color;

    public int number;

    public Ball(Color color, int number) {

        this.color = color;

        this.number = number;

    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
