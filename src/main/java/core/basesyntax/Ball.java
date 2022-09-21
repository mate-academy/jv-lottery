package core.basesyntax;

public class Ball {
    private SetOfColors color;
    private int number;

    @Override
    public String toString() {
        return "Ball " + this.color+ " number " + this.number;
    }

    Ball(SetOfColors color, int number){
        this.color = color;
        this.number = number;
    }

}

