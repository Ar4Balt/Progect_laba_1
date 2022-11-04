package Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Triangle {
    private Point A = new Point();
    private Point B;
    private Point C;
    //equilateral, isosceles, rectangular, arbitrary
    private String TypeOfTriangle = "";

    public Triangle(Point a, Point b, Point c, String typeOfTriangle) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.TypeOfTriangle = typeOfTriangle;
    }
    public Triangle(Point a, Point b, Point c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }
    public Triangle(String typeOfTriangle) {
        TypeOfTriangle = typeOfTriangle;
    }
    public Triangle() {
    }

    public Point getA() {
        return A;
    }
    public Point getB() {
        return B;
    }
    public Point getC() {
        return C;
    }
    public void setB(Point b) {
        B = b;
    }
    public void setA(Point a) {
        A = a;
    }
    public void setC(Point c) {
        C = c;
    }
    public String getTypeOfTriangle() {
        return TypeOfTriangle;
    }

    public void setTypeOfTriangle(String typeOfTriangle) {
        TypeOfTriangle = typeOfTriangle;
    }

    public void setTypeOfTriangle(int event) {
        switch (event){
            case 0:
                this.TypeOfTriangle = "arbitrary";
                break;
            case 1:
                this.TypeOfTriangle = "equilateral";
                break;
            case 2:
                this.TypeOfTriangle = "isosceles";
                break;
            case 3:
                this.TypeOfTriangle = "rectangular";
                break;
            default:
                this.TypeOfTriangle = "arbitrary";
        }

    }

    @Override
    public String toString() {
        return "Triangle{ " +
                "\n A = " + A +
                ",\n B = " + B +
                ",\n C = " + C +
                ",\n TypeOfTriangle = '" + TypeOfTriangle + '\'' +
                "\n}";
    }

    public static double getSquare(Triangle triangle) {
        double square = ((triangle.getA().getX() - triangle.getC().getX()) *
                (triangle.getB().getY() - triangle.getC().getY()) - (triangle.getB().getX() - triangle.getC().getX()) *
                (triangle.getA().getY() - triangle.getC().getY())) / 2;

        return square;
    }

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

    //выборка равносторонних треугольников
    public static List<Triangle> findEquilateral(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        for (Triangle triangle: triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(),"равносторонний")){
                results.add(triangle);
            }
        }
        return results;
    }

    //выборка равнобедренных треугольников
    public static List<Triangle> findIsosceles(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        for (Triangle triangle: triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(),"равнобедренный")){
                results.add(triangle);
            }
        }
        return results;
    }

    //выборка прямоугольных треугольников
    public static List<Triangle> findRectangular(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        for (Triangle triangle: triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(),"прямоугольный")){
                results.add(triangle);
            }
        }
        return results;
    }

    //выборка произвольных треугольников
    public static List<Triangle> findArbitrary(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        for (Triangle triangle: triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(),"произвольный")){
                results.add(triangle);
            }
        }
        return results;
    }

    //выборка наибольшего по площади треугольника
    public static List<Triangle> findTrianglWithMaxSquare(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        double max = 0.0;
        for (int i = 0; i < triangles.size(); i++) {
            if (getSquare(triangles.get(i)) > max){
                max = getSquare(triangles.get(i));
            }
        }

        for (int i = 0; i < triangles.size(); i++) {
            if (getSquare(triangles.get(i)) == max){
                results.add(triangles.get(i));
            }
        }
        return results;
    }

    //выборка наименьшего по площади треугольника
    public static List<Triangle> findTriangWithMinSquare(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        double min = 2000000.0;
        for (int i = 0; i < triangles.size(); i++) {
            if (getSquare(triangles.get(i)) < min){
                min = getSquare(triangles.get(i));
            }
        }
        for (int i = 0; i < triangles.size(); i++) {
            if (getSquare(triangles.get(i)) == min){
                results.add(triangles.get(i));
            }
        }
        return results;
    }
}
