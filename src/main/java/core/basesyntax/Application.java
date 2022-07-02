package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Loterry one = new Loterry();
            Ball fin = new Ball();
            fin.setNumber(one.getRandomBall());
            fin.setColor(String.valueOf(one.getRandomColor()));
            System.out.print(fin.getColor() + " ");
            System.out.println(fin.getNumber());
        }
    }
}
