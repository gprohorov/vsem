package pro.edu.module2.polymorphism;
/*
  @author   george
  @project   vsem
  @class  Rectangle
  @version  1.0.0 
  @since 17.03.2021 - 19.32
*/

import pro.edu.module2.polymorphism.interfaces.IGeometry;
import pro.edu.module2.polymorphism.interfaces.IPacking;

import java.util.Objects;

public class Rectangle2 implements IGeometry, IPacking {
    private int length;
    private int width;

    public Rectangle2() {
    }

    public Rectangle2(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        // logic
        return length;
    }

    public void setLength(int length) {
        // logic
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = (width >= 0) ? width : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle2 rectangle = (Rectangle2) o;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length = " + length +
                ", width = " + width +
                '}';
    }


    @Override
    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    @Override
    public double getArea() {
        return this.getWidth() * this.getLength();
    }

    @Override
    public String toJSON() {

        String json = "Reactangle" + "{" + "\"" + "length" + "\"" + ":" + this.getLength() +
                "," +
                "\"" + "width" + "\"" + ":" + this.getWidth() +
                "}";

        return json;
    }

    @Override
    public String toXML() {
        String xml = "<Rectangle>" +
                " + <length> " + this.getLength() + "</length>" +
                " + <width> " + this.getWidth() + "</width>" +
                "</Rectangle>";
        return xml;
    }
}
