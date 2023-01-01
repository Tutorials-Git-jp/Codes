import java.io.IOException;
import java.util.*;

public class Login implements HandleActions {

    private String name;
    private String password;

    public Login(String name, String password) {
        this.name = name;
        this.password = password;

    }

    @Override
    public void doAction() {

    }

    @Override
    public int trueFalse() throws IOException {

        String forCheck = this.name + " " + this.password;

        ArrayList<String> arr = new ArrayList<>();

        try {
            Scanner input = new Scanner(Database.UserInfo);
            while (input.hasNext()) {
                String info = input.next() + " " + input.next();
                arr.add(info);
            }
        } catch (Exception e) {
            System.out.println();
        }

        if (arr.contains(forCheck)) {
            return 1;

        }

        return 0;

    }

}
