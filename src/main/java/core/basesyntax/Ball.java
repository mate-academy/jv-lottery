package core.basesyntax;

public class Ball {
    public Ball(){
    }

    public Ball(Color color, int number){
    }

    @Override
    public String toString() {
        return "Ball color: " + Lottery.getColor() + ". Ball number: " + Lottery.getNumber();
    }
}
