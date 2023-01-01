
import java.io.IOException;

public class ViewCart implements HandleActions {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ViewCart(String name) {
        this.name = name;
    }

    @Override
    public int trueFalse() throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void doAction() {
        System.out.println("---------------------------------------------");
        System.out.println("--------------WELCOME " + name + "-------------");
        System.out.println("--------------YOUR CART AND BILL---------------------");
        for (int i = 1; i < Database.medicine.size(); i++) {
            System.out.println(Database.medicine.get(i) + " " + Database.bill.get(i));
        }
        System.out.println("---------------------------------------------");
        int sum = 0;
        for (int i = 1; i < Database.bill.size(); i++) {
            sum = sum + Database.bill.get(i);

        }
        System.out.println("Total Bill = " + sum);
    }

}
