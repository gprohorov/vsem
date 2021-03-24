package pro.edu.module2.factory;
/*
  @author   george
  @project   vsem
  @class  Rectangle3
  @version  1.0.0 
  @since 24.03.2021 - 18.45
*/

import pro.edu.module2.polymorphism.interfaces.IGeometry;

public class Rectangle3 implements IGeometry {
    private int length;
    private int width;

    public Rectangle3() {
    }

    public Rectangle3(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle3{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getArea(){
        return this.getLength() * this.getWidth();
    }
    public static int  getArea(int length, int width){
        return length * width;
    }


}
