package Calculations_And_Additions;

import Shape.Triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calculations {
    //площадь
    public static double getSquare(Triangle triangle) {
        double square = ((triangle.getA().getX() - triangle.getC().getX()) *
                (triangle.getB().getY() - triangle.getC().getY()) - (triangle.getB().getX() - triangle.getC().getX()) *
                (triangle.getA().getY() - triangle.getC().getY())) / 2;

        return square;
    }
    //периметр
    public static double getPerimetr(Triangle triangle) {
        double ab = Math.sqrt(Math.pow((triangle.getB().getX() - triangle.getA().getX()), 2) +
                Math.pow((triangle.getB().getY() - triangle.getA().getY()), 2));
        double bc = Math.sqrt(Math.pow((triangle.getC().getX() - triangle.getB().getX()), 2) +
                Math.pow((triangle.getC().getY() - triangle.getB().getY()), 2));
        double ca = Math.sqrt(Math.pow((triangle.getC().getX() - triangle.getA().getX()), 2) +
                Math.pow((triangle.getC().getY() - triangle.getA().getY()), 2));
        double perimetr = ab + bc + ca;
        return perimetr;
    }

    //колличество равносторонних
    public static int getQuantityEquilateral(List<Triangle> triangles) {
        int equilateral = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "равносторонний")) {
                equilateral++;
            }
        }
        return equilateral;
    }
    //колличество равнобедренных
    public static int getQuantityIsosceles(List<Triangle> triangles) {
        int isosceles = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "равнобедренный")) {
                isosceles++;
            }
        }
        return isosceles;
    }
    //колличество прямоугольных
    public static int getQuantityRectangular(List<Triangle> triangles) {
        int rectangular = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "прямоугольный")) {
                rectangular++;
            }
        }
        return rectangular;
    }
    //колличество произвольных
    public static int intgetQuantityArbitrary(List<Triangle> triangles) {
        int arbitrary = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "произвольный")) {
                arbitrary++;
            }
        }
        return arbitrary;
    }
}
