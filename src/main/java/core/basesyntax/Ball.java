package core.basesyntax;

public class Ball {
    private Colors colors;
    private int number;

    public Ball() {
    }

    public Ball(Colors colors, int number) {
        this.colors = colors;
        this.number = number;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    enum Colors {
        RED("red"), ORANGE("orange"), YELLOW("yellow"),
        GREEN("green"), BLUE("blue"), VIOLET("violet");
        private String color;

        Colors(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "color: " + color + " ";
        }
    }

    @Override
    public String toString() {
        return colors + "& number: " + number + " ";
    }
}
