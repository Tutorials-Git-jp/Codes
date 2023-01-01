import java.io.IOException;
import java.util.Scanner;

public class AddMed implements HandleActions {

    private String name;

    public AddMed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doAction() {
        new ViewMed().printMed();
        Database.medicine.add(0, name);
        Database.bill.add(0);
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Your Choice : ");
            System.out.println("1. Add Medicine 2. For Exit");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {

                System.out.println("Enter Your Choice to Buy medicine : ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    Database.medicine.add("NAPA");
                    Database.bill.add(50);
                    System.out.println("Successfully Added : Medicine = NAPA Price = 50");

                } else if (choice == 2) {
                    Database.medicine.add("ALATROL");
                    Database.bill.add(100);
                    System.out.println("Successfully Added : Medicine = ALATRON Price = 100");

                } else if (choice == 3) {
                    Database.medicine.add("AMIDON");
                    Database.bill.add(150);
                    System.out.println("Successfully Added : Medicine = AMIDON Price = 150");

                }

                else if (choice == 4) {
                    Database.medicine.add("SERGEL");
                    Database.bill.add(200);
                    System.out.println("Successfully Added : Medicine = SERGEL Price =200");

                } else if (choice == 5) {
                    Database.medicine.add("FEXO");
                    Database.bill.add(250);
                    System.out.println("Successfully Added : Medicine = FEXO Price = 250");

                } else if (choice == 6) {
                    Database.medicine.add("MAXPRO");
                    Database.bill.add(300);
                    System.out.println("Successfully Added : Medicine = MAXPRO Price = 300");

                } else if (choice == 7) {
                    Database.medicine.add("ACE");
                    Database.bill.add(350);
                    System.out.println("Successfully Added : Medicine = ACE Price = 350");

                } else if (choice == 8) {
                    Database.medicine.add("XEMI");
                    Database.bill.add(400);
                    System.out.println("Successfully Added : Medicine = XEMI Price = 400");

                } else if (choice == 9) {
                    Database.medicine.add("ASIPIRIN");
                    Database.bill.add(450);
                    System.out.println("Successfully Added : Medicine = ASIPIRIN Price = 450");
                } else if (choice == 10) {
                    Database.medicine.add("ACETAMINOPHEN");
                    Database.bill.add(500);
                    System.out.println("Successfully Added : Medicine = ACETAMINOPHEN Price = 500");
                }

            } else {
                break;
            }

        }

    }

    @Override
    public int trueFalse() throws IOException {

        return 0;
    }

}

