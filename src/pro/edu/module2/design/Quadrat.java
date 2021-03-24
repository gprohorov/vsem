package pro.edu.module2.design;
/*
  @author   george
  @project   vsem
  @class  Quadrat
  @version  1.0.0 
  @since 24.03.2021 - 19.21
*/

import pro.edu.module2.polymorphism.interfaces.IGeometry;

public class Quadrat implements IGeometry {
    private int side;

    public Quadrat() {

    }

    public Quadrat(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "side=" + side +
                '}';
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
