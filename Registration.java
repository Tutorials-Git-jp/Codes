
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Registration implements HandleActions {
    Scanner input = new Scanner(System.in);
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Registration(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public int trueFalse() throws IOException {
        String check = this.name + " " + this.password;
        ArrayList<String> arr = new ArrayList<>();

        try {
            input = new Scanner(Database.UserInfo);
            while (true) {
                String information = input.next() + " " + input.next();
                arr.add(information);
            }

        } catch (Exception e) {
            System.out.println();
        }

        if (arr.contains(check)) {
            return 1;
        }
        FileWriter fw = new FileWriter(Database.UserInfo, true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n" + this.name + " " + this.password;
        b.write(addData);
        b.close();
        fw.close();

        return 1;
    }

    @Override
    public void doAction() {
        System.out.println("Nothing is here");

    }

}