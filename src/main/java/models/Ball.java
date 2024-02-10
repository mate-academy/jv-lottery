package models;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        String overridenString = super.toString();
        return "Overriden string method. "
                + "Ball color: " + this.color
                + ". Ball number: " + this.number + ".";
    }
}
