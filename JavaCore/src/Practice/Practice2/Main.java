package Practice.Practice2;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws ParseException {
        List<Product> productList = new ArrayList<>();
        DSHHManagement dshhManagement = new DSHHManagement(productList);
        Input input = new Input();
        input.inputScanner(dshhManagement);
    }
}