import java.util.Scanner;
class Deli {
    public static void main(String[] args) {
        String Item;
        double ItemPrice, ExpressPR,  ShippingCost, addExpress, deliveryPR, TotalDelivery, TotalCost;
        int Choice;
        ExpressPR = 3.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter what you would like to order.");
        Item = sc.nextLine();
        System.out.println("Enter how much it costs.");
        ItemPrice = sc.nextDouble();
        System.out.println("If you would like express shipping press 1 if you would not press 2");
        Choice = sc.nextInt();
        
        if(ItemPrice <= 10){
            ShippingCost = 2.0;
        } else{
            ShippingCost = 0;
        }
        TotalCost = ShippingCost + ExpressPR;
        if(Choice == 1){
            System.out.println("Invoice");
            System.out.println(Item + ("        $" + ItemPrice));
            System.out.println("Delivery        $" + (ShippingCost + ExpressPR));
            System.out.println("Total        $" + (ItemPrice + TotalCost ));
        } else{
            System.out.println("Invoice");
            System.out.println(Item + ("        $" + ItemPrice));
            System.out.println("Delivery        " + (ShippingCost));
            System.out.println("Total        $" + (ItemPrice + ShippingCost));
        }
            }
        }
            
