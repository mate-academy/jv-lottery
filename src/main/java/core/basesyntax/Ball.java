package core.basesyntax;

public class Ball {
    private SetOfColors color;
    private int number;

    Ball(SetOfColors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball " + this.color + " number " + this.number;
    }

}

