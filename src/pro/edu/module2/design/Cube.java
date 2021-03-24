package pro.edu.module2.design;
/*
  @author   george
  @project   vsem
  @class  Cube
  @version  1.0.0 
  @since 24.03.2021 - 20.31
*/

import pro.edu.module2.polymorphism.interfaces.IGeometry;

public class Cube implements IGeometry {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
