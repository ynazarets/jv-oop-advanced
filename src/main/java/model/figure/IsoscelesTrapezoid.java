package model.figure;

import model.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double downSide;
    private final double upperSide;
    private final double high;

    public IsoscelesTrapezoid(String color,
                              int downSide,
                              int upperSide,
                              int high) {
        super(color);
        this.downSide = downSide;
        this.upperSide = upperSide;
        this.high = high;
        print();

    }

    @Override
    public int calculateArea() {
        return (int) ((downSide + upperSide) * high) / 2;
    }

    @Override
    public void print() {
        System.out.println("Figure: Isosceles Trapezoid, area:  "
                + calculateArea() + " sq. units, down side: " + downSide
                + " units, upper side: " + downSide + " units, high: " + high
                + " units, color: " + color);
    }
}