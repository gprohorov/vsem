package pro.edu.module2.design;
/*
  @author   george
  @project   vsem
  @class  Triangle
  @version  1.0.0 
  @since 17.03.2021 - 20.02
*/

import pro.edu.module2.polymorphism.interfaces.IGeometry;

public class Triangle implements IGeometry {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
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
