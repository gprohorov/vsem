package pro.edu.module2.inheritance;
/*
  @author   george
  @project   vsem
  @class  Person
  @version  1.0.0 
  @since 19.03.2021 - 18.33
*/

public class Person {
    private String firstName;
    private String lastName;
    private String patronynicName;
    private String Address;
    private MaritalStatus status;

    public Person(String firstName, String lastName, String patronynicName, String address, MaritalStatus status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronynicName = patronynicName;
        Address = address;
        this.status = status;
    }
}
