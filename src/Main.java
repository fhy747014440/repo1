import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*System.out.println("Hello World!");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }*/
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.forEach((e)->{
            System.out.println(e);
        });

    }
}
