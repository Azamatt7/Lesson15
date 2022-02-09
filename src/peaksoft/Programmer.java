package peaksoft;

public class Programmer extends Person {
    public String companyName;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println("Ariet is coding Java programming");

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                "} " + super.toString();
    }
}

