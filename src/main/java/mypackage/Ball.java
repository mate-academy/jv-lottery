package mypackage;

public class Ball {
    private String color;
    private int number;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        if (number < 0 || number > 100) {
            System.out.println("Number should be more 0 and less 100.");
        } else {
            this.number = number;
        }
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
