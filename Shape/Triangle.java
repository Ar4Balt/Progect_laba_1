package Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Triangle {
    private Point A;
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
        setTypeOfTriangle();
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
    public void setTypeOfTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice triangles: equilateral, isosceles, rectangular and arbitrary (1/2/3/0): ");
        int event = scanner.nextInt();
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
}
