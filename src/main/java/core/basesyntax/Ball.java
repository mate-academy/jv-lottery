package core.basesyntax;

public class Ball {
    String colour;
    int number;

    public Ball(Color randomColor, int randomNumber) {
    }

    @Override
    public String toString(){
        return colour + number;
    }
}
