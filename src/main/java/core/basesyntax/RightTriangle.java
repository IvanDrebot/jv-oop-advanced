package core.basesyntax;

public class RightTriangle extends Figure {
    private final int leg1;
    private final int leg2;

    public RightTriangle(String color, int leg1, int leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return (double) (leg1 * leg2) / 2;
    }

    @Override
    public String getInfo() {
        return "Figure : Right Triangle, Color : " + getColor()
                + ", Leg1 : " + leg1
                + ", Leg2 : " + leg2
                + ", Area : " + getArea();
    }
}