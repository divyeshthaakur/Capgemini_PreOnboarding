package Level1_16_01_26;

public class Person {
    private String company;
    private int salary;

    Person(Person otherPerson)
    {
        this.company=otherPerson.company;
        this.salary=otherPerson.salary;
    }

}
