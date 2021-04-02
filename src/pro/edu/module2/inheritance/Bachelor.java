package pro.edu.module2.inheritance;
/*
  @author   george
  @project   vsem
  @class  Bachelor
  @version  1.0.0 
  @since 02.04.2021 - 19.24
*/

public class Bachelor {
    private Person person;
    private String group;
    private String chair;
    private String department;
    private boolean isStipendiat;

    public Bachelor(Person person, String group, String chair, String department, boolean isStipendiat) {
        this.person = person;
        this.group = group;
        this.chair = chair;
        this.department = department;
        this.isStipendiat = isStipendiat;
    }
}
