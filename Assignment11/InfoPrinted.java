 import java.util.Scanner;
 class InfoPrinted   {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String name, Address, city, province, postal_code;
        System.out.println("Please enter your name.");
        name = sc.nextLine();
        System.out.println("Please enter your address.");
        Address = sc.nextLine();
        System.out.println("Please enter what city you live in.");
        city = sc.nextLine();
        System.out.println("Please enter what province you live in.");
        province = sc.nextLine();
        System.out.println("Please enter your postal code.");
        postal_code = sc.nextLine();
        System.out.println(name + ", " + city + ", " + Address + ", " + city + ", " + province + ", " + postal_code + ".");
    }
}