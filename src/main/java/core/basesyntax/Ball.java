package core.basesyntax;
import java.util.Random;

public class Ball {

    private int numberBall;
    private String colorBall;

    public int getNumberBall() {
        return numberBall;
    }

    public void setNumberBall(int numberBall) {
        this.numberBall = numberBall;
    }

    public String getColorBall() {
        return colorBall;
    }

    public void setColorBall(String colorBall) {
        this.colorBall = colorBall;
    }

    public Ball(String colorBall, int numberBall){
        this.colorBall = colorBall;
        this.numberBall = numberBall;
    }
}
