package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;
    
    public Ball() {
    }
    
    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }
    
    public void setColor(Colors color) {
        this.color = color;
    }
    
    public Colors getColor() {
        return color;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void toString(Ball ball) {
        System.out.println("Color - " + ball.color + ", number - " + ball.number);
    }
}
