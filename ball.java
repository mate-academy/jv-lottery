public class ball {
    int number;
    Colors color;
    public ball(int number, Colors color){
        this.number = number;
        this.color = color;
    }

    public String toString(){
        return "ball" + "color" + number;
    }
}
