package core.basesyntax;

public class Ball {
    private Color color;
    private int number;
    
    public Ball() {
    }
    
    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String toString() {
        return "Ball{"
                + "color=" + color
                + ", number=" + number + "}";
    }
}
