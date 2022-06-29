package core.basesyntax;

public class Ball extends ColorSupplier {

    private int number;
    private String color;

    public void getNumber() {
        this.number = (int)(Math.random() * 100);
    }

    public void getColor() {
        this.color = getRandomColor();
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color='" + color + '\''
                + '}';
    }
}


