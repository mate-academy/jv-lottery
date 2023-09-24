package core.basesyntax;

class Lottery {
    public Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        int randomNumber = (int) (Math.random() * 100) + 1;
        return new Ball(randomColor,randomNumber);
    }
}