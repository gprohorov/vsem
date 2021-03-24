package pro.edu.module2.inheritance;
/*
  @author   george
  @project   vsem
  @class  Student
  @version  1.0.0 
  @since 19.03.2021 - 18.34
*/

public class Student extends Person{
    private String group;
    private String chair;
    private String department;
    private boolean isStipendiat;  //  has a scolarship

    public Student(String firstName, String lastName, String patronynicName, String address, MaritalStatus status) {
        super(firstName, lastName, patronynicName, address, status);
    }
}
