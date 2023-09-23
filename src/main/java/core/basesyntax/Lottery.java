package core.basesyntax;

class Lottery {
    public static Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        int randomNumber = (int) (Math.random() * 100) + 1;
        return new Ball(randomColor,randomNumber);
    }
}