package pro.edu;

import pro.edu.module2.design.Rectangle;

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


    }
}
