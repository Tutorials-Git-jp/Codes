
import java.io.IOException;

import java.util.Scanner;

public class DeleteMed implements HandleActions {

    private String name;

    public String getName() {
        return name;
    }

    public DeleteMed(String name) {
        this.name = name;
    }

    @Override
    public void doAction() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("--------------------------------------");
            System.out.println("--------------YOUR CART---------------");
            for (int i = 1; i < Database.medicine.size(); i++) {
                System.out.println(i + " " + Database.medicine.get(i));
            }
            System.out.println("--------------------------------------");

            System.out.println("Which Medicine your want to delete?");
            System.out.println("Enter the number of the medicine :");
            int arr = input.nextInt();
            System.out
                    .println("Succesfully removed " + Database.medicine.get(arr) + " Price " + Database.bill.get(arr));
            Database.medicine.remove(arr);
            Database.bill.remove(arr);

            System.out.println("You want to remove more medicine?");
            System.out.println("1 . Yes");
            System.out.println("2. NO");
            System.out.println("Enter your Choice : ");
            int choice2 = input.nextInt();

            if (choice2 == 1) {
                System.out.println();
            } else if (choice2 == 2) {
                break;
            }

        }

    }

    @Override
    public int trueFalse() throws IOException {

        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

}