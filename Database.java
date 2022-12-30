package Pharmacy;
import java.io.File;
import java.util.ArrayList;

public class Database {
    public static final File UserInfo = new File("/Users/naimazamanroshni/java/Pharmacy/src/File/DataFile.txt");
    public static ArrayList<String> medicine = new ArrayList();
    public static ArrayList<Integer> bill = new ArrayList();
    public static ArrayList<String> forModify = new ArrayList();
    public static ArrayList<Integer> forModify2 = new ArrayList();
    public static int total_med = 0;

    public Database() {
    }
}
