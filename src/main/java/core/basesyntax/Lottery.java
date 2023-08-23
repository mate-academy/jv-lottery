package core.basesyntax;

public class Lottery extends ColorSupplier{
    public Ball getRandomBall(){
        Ball euro = new Ball();
        euro.color = getRandomColor();
        euro.numOfColor = getRandomINum();
        return euro;

    }
}
