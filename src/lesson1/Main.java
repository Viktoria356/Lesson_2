package lesson1;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(new Cross(60), new Water(2), new Wall(4));
        Team team = new Team("Fire", new Human("Sam"), new Cat("Moris"), new Dog("Toby"));
        c.doIt(team);

        System.out.println("\nWinners:");
        team.passedTheDistance();

        System.out.println("\nResult:");
        team.showResults();
    }
}
