import java.io.File;
import java.util.ArrayList;

public class Database {
    public final static File UserInfo = new File("C:\\Users\\User\\Documents\\Pharmacy management\\src\\Datafile.txt");
    public static ArrayList<String> medicine = new ArrayList<>();
    public static ArrayList<Integer> bill = new ArrayList<>();
    public static ArrayList<String> forModify = new ArrayList<>();
    public static ArrayList<Integer> forModify2 = new ArrayList<>();

    public static int total_med = 0;

}
