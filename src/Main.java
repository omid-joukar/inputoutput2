import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by KPS on 7/15/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\");
        String[] list = path.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".txt")) {
                    return true;
                }else {
                    return false;
                }}
        });
        for (String na : list){
            System.out.println(na);
        }
    }

}
