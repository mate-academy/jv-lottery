package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        // Ball potomy shto bydel brat ball i ego vozvrashat i
        // prisvaivat znacheniya kotorie tam inicializirovany
        Ball ball = new Ball(); // sozdaem novii Ball
        ColorSupplier colorSupplier = new ColorSupplier();
        // sozdaem noviy konstryktor kotorii generit cvet
        ball.setColor(colorSupplier.getRandomColor());
        // prisvaivaem cvet k ball istpolzya setter v
        // kotorom berem metod random color shtobi zarandomit color
        Random random = new Random(); // zovem konstryktor
        // kotoriy daet nam vozmojnost randomit chisla
        ball.setNumber(random.nextInt(100)); //prisvaivaem chislo
        // cherez setter i randomim ego s nextInt. 100 eto predel 0-100
        return ball; // retun ego
    }
}
