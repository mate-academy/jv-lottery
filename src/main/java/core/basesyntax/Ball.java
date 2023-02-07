package core.balls;

public class Ball {
    private String namecolor;
    private int number;

    public Ball(int number, String namecolor) {
        this.number = number;
        this.namecolor = namecolor;
    }

    @Override
    public String toString() {
        Integer num = this.number;
        return "Ball with number " + num.toString() + " witn " + this.namecolor + " color";
    }
  
}
