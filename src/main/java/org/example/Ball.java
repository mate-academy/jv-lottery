package org.example;

public class Ball {
    final String color;
    final int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" +  color + '\''
                + ", number=" + number
                + '}';
    }
}

