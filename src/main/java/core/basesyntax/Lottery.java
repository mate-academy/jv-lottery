package core.basesyntax;

public class Lottery {
    private int number;
    private String color;

    public Lottery(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Lottery Ball:");
        System.out.println("Number: " + number);
        System.out.println("Color: " + color);
        System.out.println();
    }
}
