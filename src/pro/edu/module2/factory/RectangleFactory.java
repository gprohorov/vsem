package pro.edu.module2.factory;
/*
  @author   george
  @project   vsem
  @class  RectangleFactory
  @version  1.0.0 
  @since 24.03.2021 - 18.48
*/

public class RectangleFactory {
    public static Rectangle3 create(int length, int width){
         //   put your logic here
        return new Rectangle3(length,width);
    }
}
