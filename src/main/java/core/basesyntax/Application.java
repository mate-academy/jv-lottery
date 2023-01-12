package core.basesyntax;

import core.colors.ColorSupplier;
import java.util.Random;
    
public class Application {

    class Ball {
        private String namecolor;
        private int number;

        public Ball(int bound, String namecolor) {
            Random random = new Random();
            this.number = bound >= 1 && bound <= 100 ? random.nextInt(bound) : random.nextInt(100);
            this.namecolor = namecolor;
        }

        @Override
        public String toString() {
            Integer num = this.number;
            return "Ball with number " + num.toString() + " witn " + this.namecolor + " color";
        }
        
    }

    class Lottery {
        private ColorSupplier cs;
 
        public Lottery() {
            cs = new ColorSupplier();
        }
        
        public Ball getRandomBall() {
            return new Ball(100, cs.getRandomColor());
        }
        
    }

    public static void main(String[] args) {

        Application ap = new Application();
        Application.Lottery lot = ap.new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println("Got " + lot.getRandomBall().toString());
        }
    }

}
