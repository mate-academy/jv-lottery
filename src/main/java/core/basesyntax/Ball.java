package core.basesyntax;

public class Ball {
    private String color;
    private int number;
    
    @Override
    public String toString() {
        return "";
    }
    
    public Ball(String color, int num) {
        this.number = num;
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
}
