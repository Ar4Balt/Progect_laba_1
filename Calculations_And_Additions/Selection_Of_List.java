package Calculations_And_Additions;

import Shape.Triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Selection_Of_List extends Calculations{
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
        double min = 1000000.0;
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
