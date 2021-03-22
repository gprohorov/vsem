package pro.edu.module2.design;
/*
  @author   george
  @project   vsem
  @class  Person
  @version  1.0.0 
  @since 17.03.2021 - 20.56
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public int getAge(){
        int years = (int) ChronoUnit.YEARS.between(this.getDateOfBirth(), LocalDate.now());
        return years;
    }
    public boolean isAdult(){
        boolean result = true;

        if (this.getAge() >= 18) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }


}
