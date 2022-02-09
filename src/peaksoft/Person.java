package peaksoft;

public class Person {
    public String name;
    public String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public void learn() {
        System.out.println(name + " is learning " + designation);
    }
    public void walk() {
        System.out.printf("%s is walking in the park\n", name);

    }
    public void eat() {
        System.out.println(name + " is eating healthy food ");

    }

    @Override
    public String toString() {
        return "Person's : " +
                "name : " + name  +
                ", designation : " + designation ;
    }
}


