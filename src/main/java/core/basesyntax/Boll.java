package core.basesyntax;

public class Boll {
    private String color;
    private int number;

    public Boll(int number, String color) {
        this.setNumber(number);
        this.setColor(color);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Boll{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
