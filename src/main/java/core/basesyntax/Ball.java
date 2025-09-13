package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball()
    {
        this.color = "";
        this.number = -1;
    }
    public Ball(String col, int num)
    {
        this.color = col;
        this.number = num;
    }

    @Override
    public String toString() {
        return number + " " + color;
    }
}
