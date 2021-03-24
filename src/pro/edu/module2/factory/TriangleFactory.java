package pro.edu.module2.factory;
/*
  @author   george
  @project   vsem
  @class  TriangleFactory
  @version  1.0.0 
  @since 24.03.2021 - 19.00
*/

import pro.edu.module2.design.Triangle;

public class TriangleFactory {
    public static Triangle create(int a, int b, int c){
        if (a + b <= c) {
            return  null;
        }
        return new Triangle(a,b,c);
    }
}
