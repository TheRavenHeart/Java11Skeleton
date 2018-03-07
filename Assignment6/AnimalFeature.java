import java.util.Scanner;
class AnimalFeature{
public static void main(String[] args) {
    String name, feature, animal;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the name of someone.");
    name = sc.nextLine();
    System.out.println("Please enter a feature.");
    feature = sc.nextLine();
    System.out.println("Please enter an animal.");
    animal = sc.nextLine();
    System.out.format("%s has %s like a %s.", name, feature, animal);
    // This seems unnessesary and somewhat clunky compared to the other method as well as confusing.
}
}

