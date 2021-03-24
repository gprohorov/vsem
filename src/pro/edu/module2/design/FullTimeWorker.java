package pro.edu.module2.design;
/*
  @author   george
  @project   vsem
  @class  FullTimeWorker
  @version  1.0.0 
  @since 24.03.2021 - 18.35
*/

import pro.edu.module2.polymorphism.interfaces.IAccounting;

public class FullTimeWorker implements IAccounting {
    private String name;

    public FullTimeWorker() {
    }

    public FullTimeWorker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FullTimeWorker{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int getSalary() {
        return 5000;
    }
}
