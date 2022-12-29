import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your name : ");
            String name = input.nextLine();
            System.out.println("Enter your password : ");
            String password = input.nextLine();

            if (login(name, password)) {
                showMenu(name);
            }

            System.out.println();
        }
    }

    public static boolean login(String name, String password) throws IOException {

        Scanner input = new Scanner(System.in);
        if (new Login(name, password).trueFalse() == 1) {
            System.out.println("login Successfull");
            return true;
        } else {
            while (true) {
                System.out.println("User is not found ... ");
                System.out.println("Create an account ! ");

                System.out.println("Enter your name : ");
                String reg_name = input.nextLine();
                System.out.println("Enter your Password : ");
                String reg_pass = input.nextLine();

                if (new Registration(reg_name, reg_pass).trueFalse() == 1) {
                    System.out.println("Successfully Create an account.");
                    System.out.println("Try to login now");
                    break;
                }

            }

        }

        return false;

    }

    public static void showMenu(String name) {
        while (true) {
            System.out.println("---------------------------------------------------");
            System.out.println("-----------------------MENU------------------------");
            System.out.println("1. View Medicine");
            System.out.println("2. Add Medicine");
            System.out.println("3. Delete Medicine");
            System.out.println("4. Modify Medicine");
            System.out.println("5. View Cart and total bill ");
            System.out.println("6. Exit Program");
            System.out.println("---------------------------------------------------");

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your choice : ");
            int choice = input.nextInt();

            if (choice == 1) {
                new ViewMed().printMed();

            } else if (choice == 2) {
                new AddMed(name).doAction();
            }

            else if (choice == 3) {

                new DeleteMed(name).doAction();

            }

            else if (choice == 4) {
                new ModifyMed(name).doAction();

            }

            else if (choice == 5) {
                new ViewCart(name).doAction();

            } else if (choice == 6) {
                System.out.println("        Thanks For Shopping :)   ");

                System.exit(0);

            }

        }

    }

}
