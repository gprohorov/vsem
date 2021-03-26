package pro.edu.module2.factory;
/*
  @author   george
  @project   vsem
  @class  FigureFactory
  @version  1.0.0 
  @since 24.03.2021 - 19.54
*/

import pro.edu.module2.design.Cube;
import pro.edu.module2.design.Quadrat;
import pro.edu.module2.design.Triangle;
import pro.edu.module2.polymorphism.interfaces.IGeometry;

public class FigureFactory {


    public static IGeometry create(int length, int width){
        if (length == width) {
            return new Quadrat(length);
        }

        return new Rectangle3(length, width);
    }

    public static IGeometry create(double a, double b, double c){
        return new Triangle(a,b,c);
    }

    public static IGeometry create(double a, double b){
        double c = Math.sqrt(a*a + b*b);
        return new Triangle(a,b,c);
    }

    public static IGeometry create(double a, double b, Figures figure){
        if (figure.equals(Figures.TRIANGLE)) return new Triangle(a,b, Math.sqrt(a*a + b * b));
        if (figure.equals(Figures.RECTANGLE)) return new Rectangle3( (int) a, (int) b   );
        return null;
    }
    public static IGeometry create(double a, Figures figure){
        if (figure.equals(Figures.TRIANGLE)) return new Triangle(a,a,a);
        if (figure.equals(Figures.QUADRAT)) return  new Quadrat((int) a);
        if (figure.equals(Figures.CUBE)) return  new Cube(a);
        return null;
    }


}
