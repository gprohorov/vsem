package pro.edu.module2.inheritance;
/*
  @author   george
  @project   vsem
  @class  Wall
  @version  1.0.0 
  @since 19.03.2021 - 18.09
*/

import pro.edu.module2.design.Rectangle;

public class Wall extends Rectangle {
    private String color;
    private boolean isInner;
    private boolean isWarmed;

    public Wall() {
    }

    public Wall(String color, boolean isInner, boolean isWarmed) {
        this.color = color;
        this.isInner = isInner;
        this.isWarmed = isWarmed;
    }

    public Wall(int length, int width, String color, boolean isInner, boolean isWarmed) {
        super(length, width);
        this.color = color;
        this.isInner = isInner;
        this.isWarmed = isWarmed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isInner() {
        return isInner;
    }

    public void setInner(boolean inner) {
        isInner = inner;
    }

    public boolean isWarmed() {
        return isWarmed;
    }

    public void setWarmed(boolean warmed) {
        isWarmed = warmed;
    }

    public int getPrice(){
        return 0;
    }

    @Override
    public String toString() {
        return "Wall{" +
                 super.toString() +
                "color='" + this.getColor() + '\'' +
                ", isInner=" + isInner +
                ", isWarmed=" + isWarmed +
                '}';
    }

    public void toConsole(){
        System.out.println(super.toString());
        System.out.println(this.toString());
    }
}
