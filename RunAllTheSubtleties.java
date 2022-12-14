import Shape.Point;
import Shape.Triangle;

import java.util.ArrayList;
import java.util.List;

public class RunAllTheSubtleties {
    public RunAllTheSubtleties() {
        List<Triangle> triangles = createTriangles();
//        System.out.println(TriangleUtil.getSquare(triangles.get(6)));
//        System.out.println(TriangleUtil.getSquare(triangles.get(4)));
//        System.out.println(TriangleUtil.getSquare(triangles.get(5)));
//        System.out.println(TriangleUtil.getPerimetr(triangles.get(0)));
//        System.out.println(triangles.get(0).toString());

        //колличество треугольников каждого вида
        int equilateral = Utility.getQuantityEquilateral(triangles);
        System.out.println("Равносторонних треугольников: " + equilateral);

        int isosceles = Utility.getQuantityIsosceles(triangles);
        System.out.println("Равнобедренных треугольников: " + isosceles);

        int rectangular = Utility.getQuantityRectangular(triangles);
        System.out.println("Прямоугольных треугольников: " + rectangular);

        int arbitrary = Utility.intgetQuantityArbitrary(triangles);
        System.out.println("Произвольных треугольников: " + arbitrary);

        //наибольшие и наименьшие треугольники среди равносторонних
        List<Triangle> equil = Utility.findEquilateral(triangles);
        List<Triangle> equilMax = Utility.findTrianglWithMaxSquare(equil);
        double equilMaxS = Utility.getSquare(equilMax.get(0));
        System.out.print("Максимальная площадь у равносторонних треугольников: ");
        System.out.format("%-10.2f", equilMaxS);
        System.out.println(" в треугольнике(ках): " + equilMax);
        List<Triangle> equilMin = Utility.findTriangWithMinSquare(equil);
        double equilMinS = Utility.getSquare(equilMin.get(0));
        System.out.print("Минимальная площадь у равносторонних треугольников: ");
        System.out.format("%-10.2f", equilMinS);
        System.out.println(" в треугольнике(ках): " + equilMin);

        //наибольшие и наименьшие треугольники среди равнобедренных
        List<Triangle> isos = Utility.findIsosceles(triangles);
        List<Triangle> isosMax = Utility.findTrianglWithMaxSquare(isos);
        double isosMaxS = Utility.getSquare(isosMax.get(0));
        System.out.print("Максимальная площадь у равнобедренных треугольников: ");
        System.out.format("%-10.2f", isosMaxS);
        System.out.println(" в треугольнике(ках): " + isosMax);
        List<Triangle> isosMin = Utility.findTriangWithMinSquare(isos);
        double isosMinS = Utility.getSquare(isosMin.get(0));
        System.out.print("Минимальная площадь у равнобедренных треугольников: ");
        System.out.format("%-10.2f", isosMinS);
        System.out.println(" в труегольнике(ках): " + isosMax);

        //наибольшие и наименьшие треугольники среди прямоугольных
        List<Triangle> rectang = Utility.findRectangular(triangles);
        List<Triangle> rectangMax = Utility.findTrianglWithMaxSquare(rectang);
        double rectangMaxS = Utility.getSquare(rectangMax.get(0));
        System.out.print("Максимальная площадь у прямоугольных треугольников: ");
        System.out.format("%-10.2f", rectangMaxS);
        System.out.println(" в треугольнике(ках): " + rectangMax);
        List<Triangle> rectangMin = Utility.findTriangWithMinSquare(rectang);
        double rectangMinS = Utility.getSquare(rectangMin.get(0));
        System.out.print("Минимальная площадь у прямоугольных треугольников: ");
        System.out.format("%-10.2f", rectangMinS);
        System.out.println(" в треугольнике(ках): " + rectangMin);

        //наибольшие и наименьшие треугольники среди произвольных
        List<Triangle> arbitr = Utility.findArbitrary(triangles);
        List<Triangle> arbitrMax = Utility.findTrianglWithMaxSquare(arbitr);
        double arbitrMaxS = Utility.getSquare(arbitrMax.get(0));
        System.out.print("Максимальная площадь у произвольных треугольников: ");
        System.out.format("%-10.2f", arbitrMaxS);
        System.out.println(" в треугольнике(ках): " + arbitrMax);
        List<Triangle> arbitrMin = Utility.findTriangWithMinSquare(arbitr);
        double arbitrMinS = Utility.getSquare(arbitrMin.get(0));
        System.out.print("Минимальная площадь у произвольных треугольников: ");
        System.out.format("%-10.2f", arbitrMinS);
        System.out.println(" в треугольнике (ках): " + arbitrMin);
    }

    public static List<Triangle> createTriangles(){
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(new Point(250.,90.) ,new Point(180., 90.), new Point(215., 29.38), "равносторонний"));
        triangles.add(new Triangle(new Point(270.,230.) ,new Point(197.25, 272.), new Point(197.25, 188.), "равносторонний"));
        triangles.add(new Triangle(new Point(260.93,317.5) ,new Point(260.93, 422.5), new Point(170.0, 370.), "равносторонний"));
        triangles.add(new Triangle(new Point(140.,80.) ,new Point(50., 120.), new Point(50., 40.), "равнобедренный"));
        triangles.add(new Triangle(new Point(140.,230.) ,new Point(50., 310.), new Point(50., 150.), "равнобедренный"));
        triangles.add(new Triangle(new Point(50.,350.) ,new Point(140., 370.), new Point(50., 390.), "равнобедренный"));
        triangles.add(new Triangle(new Point(270.,510.) ,new Point(160., 580.), new Point(160., 510.), "прямоугольный"));
        triangles.add(new Triangle(new Point(160.,640.) ,new Point(240., 640.), new Point(240., 710.), "прямоугольный"));
        triangles.add(new Triangle(new Point(260.,820.) ,new Point(160., 820.), new Point(160., 770.), "прямоугольный"));
        triangles.add(new Triangle(new Point(32.56,542.38) ,new Point(97.51, 495.85), new Point(115.22, 554.19), "произвольный"));
        triangles.add(new Triangle(new Point(39.2,631.72) ,new Point(129.98, 704.83), new Point(54.7, 727.72), "произвольный"));
        return triangles;
    }
}
