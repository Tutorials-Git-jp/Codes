package Pharmacy;
import java.io.IOException;
import java.io.PrintStream;

public class ViewCart implements HandleActions {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ViewCart(String name) {
        this.name = name;
    }

    public int trueFalse() throws IOException {
        return 0;
    }

    public void doAction() {
        System.out.println("---------------------------------------------");
        System.out.println("--------------WELCOME " + this.name + "-------------");
        System.out.println("--------------YOUR CART AND BILL---------------------");

        int sum;
        for(sum = 1; sum < Database.medicine.size(); ++sum) {
            PrintStream var10000 = System.out;
            String var10001 = (String)Database.medicine.get(sum);
            var10000.println(var10001 + " " + String.valueOf(Database.bill.get(sum)));
        }

        System.out.println("---------------------------------------------");
        sum = 0;

        for(int i = 1; i < Database.bill.size(); ++i) {
            sum += (Integer)Database.bill.get(i);
        }

        System.out.println("Total Bill = " + sum);
    }
}

