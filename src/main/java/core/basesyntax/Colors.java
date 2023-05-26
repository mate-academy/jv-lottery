package core.basesyntax;

public enum Colors {
    BLUE("Blue"),
    WHITE("White"),
    RED("Red"),
    YELLOW("Yellow"),
    GREEN("Green"),
    PINK("Pink"),
    BLACK("Black"),
    ORANGE("Orange"),
    GREY("Grey"),
    VIOLET("Violet");

    private final String title;

    Colors(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
