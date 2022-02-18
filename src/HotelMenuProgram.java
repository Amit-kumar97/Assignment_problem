import java.util.Scanner;


public class HotelMenuProgram {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Indianfoodie.com");

        //-----------------Creating Menu
        while(true){
            System.out.println();
            System.out.println("Enter your Order Number:");
            System.out.println("1- To order South Indian Dish.");
            System.out.println("2- To order North Indian Dish.");
            System.out.println("3- To order Rajasthani Dish.");
            System.out.println("4- To order Gujrati Dish.");
            System.out.println("5- To order Bengali Dish.");
            System.out.println("6- To order Desserts.");
            System.out.println("9- To Exit.");

            System.out.println();
            System.out.println("Enter your choice::");
            int choice = scan.nextInt();

            switch(choice){
                case 1: System.out.println("Welcome to South Indian Food Court");
                    southIndianFood();
                    break;
                case 2: System.out.println("Welcome to North Indian Food Court");
                    northIndianFood();
                    break;
                case 3: System.out.println("Welcome to Rajasthani Food Court");
                    rajasthaniFood();
                    break;
                case 4: System.out.println("Welcome to Gujrati Food Court");
                    gujratiFood();
                    break;
                case 5: System.out.println("Welcome to Bengali Food Court");
                    bengaliFood();
                    break;
                case 6: System.out.println("Welcome to Desserts Food Court");
                    desserts();
                    break;
                case 9: System.out.println("Thanks for ordering from our App. Visit again");
                    System.exit(0);
                    break;
                default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
            }
        }

    }

    public static void southIndianFood(){
        System.out.println("You get:");
        System.out.println("Idli : 2 Pieces:");
        System.out.println("Butter Cheese Dosa : 1 Pieces:");
        System.out.println("Vada : 2 Pieces:");
        System.out.println("===========================================================");

    }

    public static void northIndianFood(){
        System.out.println("You get:");
        System.out.println("Chole Bhature : 2 Pieces:");
        System.out.println("Litti Chokha : 4 Pieces:");
        System.out.println("===========================================================");
    }

    public static void rajasthaniFood(){
        System.out.println("You get:");
        System.out.println("Dal Baati Churma");
        System.out.println("Laal maas");
        System.out.println("Methi Bajra puri");
        System.out.println("===========================================================");

    }

    public static void gujratiFood(){
        System.out.println("You get:");
        System.out.println("Dhokla : 2 pieces");
        System.out.println("Khandvi");
        System.out.println("Methi ka Thepla");
        System.out.println("===========================================================");
    }

    public static void bengaliFood(){
        System.out.println("You get:");
        System.out.println("Maach Bhaat");
        System.out.println("Aalu Luchi");
        System.out.println("===========================================================");
    }

    public static void desserts(){
        System.out.println("You get:");
        System.out.println("Rasmalai");
        System.out.println("Rasgulla : 2 Pieces");
        System.out.println("Emarti : 2 Pieces");
        System.out.println("Gajar ka halwa");
        System.out.println("===========================================================");

    }

}
