//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FigSupplier figSupplier = new FigSupplier();
        Shape[] shapes = new Shape[6];

        // Заполняем первую половину случайными фигурами
        for (int i = 0; i < shapes.length / 2; i++) {
            shapes[i] = figSupplier.getRandomFigure();
        }

        // Заполняем вторую половину фигурами по умолчанию
        for (int i = shapes.length / 2; i < shapes.length; i++) {
            shapes[i] = figSupplier.getDefaultFigure();
        }

        // Выводим информацию о фигурах
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}