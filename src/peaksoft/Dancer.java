package peaksoft;

public class Dancer extends Person {
    public String groupName;

    public Dancer(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println("Ulan is dancing Kara jorgo dance");

    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                "} " + super.toString();
    }
}
