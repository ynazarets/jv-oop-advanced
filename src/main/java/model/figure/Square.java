package model.figure;

import model.Figure;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
        print();
    }

    @Override
    public int calculateArea() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println("Figure: Square, area:  " + calculateArea()
                + " sq. units, side: " + side + " units, color: " + color);
    }
}