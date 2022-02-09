package peaksoft;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Aibek","Manager");
        System.out.println(person);
        person.walk();
        person.eat();
        person.learn();
        System.out.println("=========================================================");


        Programmer JavaProgrammer = new Programmer("Ariet","Backend Programmer","Peaksoft");
        System.out.println(JavaProgrammer);
        JavaProgrammer.coding();
        JavaProgrammer.walk();
        JavaProgrammer.learn();
        JavaProgrammer.eat();
        System.out.println("=============================================================");


        Dancer hiphopDancer = new Dancer("Ulan","Hip-Hop Dancer","Adem");
        System.out.println(hiphopDancer);
        hiphopDancer.dancing();
        hiphopDancer.eat();
        hiphopDancer.walk();
        hiphopDancer.learn();
        System.out.println("==============================================================");


        Singer guitarSinger = new Singer("Bakyt","Guitar singer","Eles");
        System.out.println(guitarSinger);
        guitarSinger.walk();
        guitarSinger.eat();
        guitarSinger.learn();
        guitarSinger.singing();
        guitarSinger.playGuitar();




    }
}
