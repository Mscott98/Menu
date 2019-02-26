package com.company;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {

            System.out.println("choose a Food Option Below::");
            System.out.println("1. ShackBurger");
            System.out.println("2. Shack Stack");
            System.out.println("3. HotDog");
            System.out.println("4.Fries");
            System.out.println("5.Shakes");
            System.out.println("6. Exit")
            System.out.println("7.")
            choice = in.nextInt();
        } while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7);
        switch (choice) {
            case 1:
                System.out.println("You Picked a ShackBurger");
                break;
            System.out.println("You picked a Shack Stack");
            break;
            System.out.println("You picked a HotDog");
            break;
            System.out.println("You picked fries");
            break;
            System.out.println("You picked a shake");
            break;
            default:
                System.out.println("Have a good day");
                break;

    }

}
}

