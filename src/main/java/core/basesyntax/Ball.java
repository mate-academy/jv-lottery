package core.basesyntax;

public enum Colors{
    RED,
    GREEN,
    BLACK,
    WHITE,
    ORANGE,
    YELLOW,
    PURPLE,
    PINK
}

public class Ball{
    public String color;
    public int number;

    public String getColor(){
        return this.color;
    }
    public int getNumber(){
        return this.number;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String toString(){
        //System.out.println(color + String.valueOf(number));
        return color + String.valueOf(number);
    }


}