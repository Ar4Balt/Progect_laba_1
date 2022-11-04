package Shape;

import org.jetbrains.annotations.Contract;

import java.util.Objects;

public class Point {
    private double X = 0.0;
    private double Y = 0.0;
    private boolean XorY = false;

    public Point(double number_x, double number_y) {
        this.X = number_x;
        this.Y = number_y;
    }
    public Point(double number_x) {
        this.X = number_x;
    }
    public Point(double number_for_x_or_y, boolean event) {
        if (event != true) {
            this.X = number_for_x_or_y;
        } else {
            this.Y = number_for_x_or_y;
        }

    }
    public Point(Point point){
        this.X = point.X;
        this.Y = point.Y;
    }
    public Point() {
    }

    public double getX() {
        return X;
    }
    public double getY() {
        return Y;
    }
    public void setX(double x) {
        this.X = x;
    }
    public void setY(double y) {
        this.Y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Double.compare(point.getX(), getX()) == 0 && Double.compare(point.getY(), getY()) == 0 && XorY == point.XorY;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), XorY);
    }

    @Override
    public String toString() {
        return "Point{ " +
                "X = " + X +
                ", Y = " + Y +
                " }";
    }
}