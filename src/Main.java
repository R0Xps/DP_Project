import features.FeatureFactory;
import shirts.TShirt;

import java.util.Scanner;

public class Main {
    static TShirtShop shop;
    static ShopOwner owner;
    static Scanner scanner;

    public static void main(String[] args) {
        shop = TShirtShop.getInstance();
        owner = new ShopOwner(shop);
        scanner = new Scanner(System.in);

        System.out.println("How many orders do you want to make?");
        int orders = scanner.nextInt();
        for (int i = 0; i < orders; i++) {
            simulateOrder();
        }

        System.out.println("Sales:");
        owner.printSales();
    }

    static void simulateOrder() {
        String region = "none";
        String size = "none";
        int choice = -1;

        while (choice < 1 || choice > 3) {
            System.out.println("What region are you in?\n[1] Asia\n[2] China\n[3] Middle East");
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1 -> region = "asia";
            case 2 -> region = "china";
            case 3 -> region = "middle_east";
        }

        choice = -1;
        while (choice < 1 || choice > 3) {
            System.out.println("What size do you want your t-shirt?\n[1] Small\n[2] Medium\n[3] Large");
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1 -> size = "small";
            case 2 -> size = "medium";
            case 3 -> size = "large";
        }

        TShirt tShirt = shop.order(region, size);
        FeatureFactory featureFactory = new FeatureFactory();
        choice = -1;
        while (choice != 2) {
            System.out.println("Would you like to add any more features to your t-shirt?\n[1] Yes\n[2] No");
            choice = scanner.nextInt();
            if (choice == 1) {
                int choice2 = -1;
                while (choice2 < 1 || choice2 > 4) {
                    System.out.println("What feature would you like to add?\n[1] Logo\n[2] Text\n[3] Red Color\n[4] Blue Color");
                    choice2 = scanner.nextInt();
                }
                String feature = "none";
                switch (choice2) {
                    case 1 -> feature = "logo";
                    case 2 -> feature = "text";
                    case 3 -> feature = "color_red";
                    case 4 -> feature = "color_blue";
                }
                tShirt = featureFactory.createFeature(feature, tShirt);
            }
        }
        System.out.println(tShirt.getDescription());
        tShirt.formSize();
    }
}