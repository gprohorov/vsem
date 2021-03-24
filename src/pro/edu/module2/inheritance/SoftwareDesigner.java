package pro.edu.module2.inheritance;
/*
  @author   george
  @project   vsem
  @class  SoftwareDesigner
  @version  1.0.0 
  @since 24.03.2021 - 18.20
*/

import java.time.LocalDate;

public class SoftwareDesigner extends Employee{

    private int rate;
    private int hours;

    public SoftwareDesigner() {
    }

    public SoftwareDesigner(int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public SoftwareDesigner(int rate) {
        this.rate = rate;
    }

    public SoftwareDesigner(String name, LocalDate entranceDay, String speciality, String qualification, int rate) {
        super(name, entranceDay, speciality, qualification);
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int getSalary() {
        return this.getRate() * this.getHours();
    }
}
