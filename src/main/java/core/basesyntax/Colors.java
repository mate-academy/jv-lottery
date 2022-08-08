package core.basesyntax;

public enum Colors {
    BLUE("Голубой"),
    WHITE("Белый"),
    RED("Красный"),
    YELLOW("Желтый"),
    GREEN("Зелёный"),
    PINK("Розовый"),
    BLACK("Черный"),
    ORANGE("Оранжевый"),
    GREY("Серый"),
    VIOLET("Фиолетовый");

    private final String title;

    Colors(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }

}
