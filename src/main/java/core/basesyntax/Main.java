package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[]{
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure()};
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
