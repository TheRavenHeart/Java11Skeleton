 import java.util.Scanner;
 class InfoPrinted   {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String name, Address, city, province, postal_code;
        System.out.println("Please enter your name.");
        name = sc.nextLine(); // take your name
        System.out.println("Please enter your address.");
        Address = sc.nextLine(); // takes your address
        System.out.println("Please enter what city you live in.");
        city = sc.nextLine(); // take what city you live in
        System.out.println("Please enter what province you live in.");
        province = sc.nextLine(); // takes what province you live in
        System.out.println("Please enter your postal code.");
        postal_code = sc.nextLine(); // takes your postal code
        System.out.println(name + ", " + city + ", " + Address + ", " + city + ", " + province + ", " + postal_code + "."); // prints it all out
    }
}