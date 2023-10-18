import java.util.Scanner;

public class DiscreteMath {
    public static void main(String [] args){
        boolean browsing = false;
        Scanner userOption  = new Scanner(System.in);

        System.out.println("Hello! Welcome to our app that will recommend something to eat." + 
        "\n *******************************************************************************");
        System.out.println(" Please select the one option " 
        +"\n1. American Food"
        +"\n2. Mexican Food"
        +"\n3. Chinese Food"
        +"\n4. EXIT");

        int userChoice = userOption.nextInt();
        if(userChoice ==1){
            AmericanFood(userOption);
        }
        else if(userChoice ==2){
            mexicanFood(userOption);
        }
    }
    public static void AmericanFood(Scanner sc){
        System.out.println("You selected Anerican Food!"
        +"\n -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Please select one of the folowing options"
        +"\n1. Hmaburger Meals"
        +"\n2. Pizza and Wings"
        +"\n3. Hot Dogs"
        +"\n4. Barbicue");
        int choice = sc.nextInt();
        if(choice ==1){
            System.out.println("You chose Hamburger Meals" 
            +"\n You might like these options "
            +"\n McDonnalds"
            +"\n Burger King"
            +"\n Jack in the Box");
        }
    }
    public static void mexicanFood(Scanner sc){
        System.out.println("You selected Mexican food!"
        +"\n ##############################");
        System.out.println("I found a couble of Mexican food resturants that you might enjoy"
        +"\n La choza Menudazo y Tamalotes"
        +"\n 1155 N Zaragoza Rd #105");
        System.out.println(" ");
        System.out.println("El Cometa "
        +"\n 9529 Viscount Blvd, El Paso, TX, 79925");
        System.out.println(" ");
        System.out.println("Don Jose Grill"
        +"\n 12130 Montwood Dr, El Paso, TX, 79936");
    }
    public static void ChineseFood(Scanner sc){
        System.out.println("you chose chinese food!!" 
        +"\n ========================================");
        System.out.println(" I found a couple of Chinese food buffet you might enjoy.");
    }
    
}
