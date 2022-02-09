package peaksoft;

public class Singer extends Person {
    public String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println("Bakyt is singing a song ");

    }
    public void playGuitar() {
        System.out.println("Bakyt is singing a song while playing a guitar");

    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                "} " + super.toString();
    }
}

