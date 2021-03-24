package pro.edu;

import pro.edu.module2.design.Person;
import pro.edu.module2.design.Rectangle;
import pro.edu.module2.inheritance.Wall;
import pro.edu.module2.polymorphism.Rectangle2;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static int getArea(int length, int width){
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println(" Hello vsem!");
        int length = 3;
        Integer length2 = 3;
        String str = "12345";
        length2 = Integer.valueOf(str);
        int width = 4;
        int area = length * width;
        System.out.println(area);
        System.out.println("-------------------------------");
        System.out.println(getArea(3, 4));

        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle();
        int l1 = r1.getLength();
        System.out.println(l1);
        r2.setLength(16);
        r2.setWidth(-7);
        System.out.println(r2);

        Rectangle r3 = new Rectangle(15,7);
        System.out.println(r2.equals(r3));
        System.out.println(r2.hashCode());
        System.out.println(r3.hashCode());
        System.out.println(r1.getArea());
        r1.setWidth(-9);
        System.out.println(r1);

        Wall w1 = new Wall(4,3,"Green", true, true);
        w1.setWidth(4);

        Person britneySpears = new Person("Britney",
                " Ivanovna",
                "Spears",
                LocalDate.of(1985, Month.FEBRUARY, 12)
                );
        System.out.println(britneySpears.getAge());
        System.out.println(britneySpears.isAdult());
        Rectangle2 rec2 = new Rectangle2(3,4);
        System.out.println(rec2.toJSON());
        System.out.println(rec2.toXML());


    }
}
