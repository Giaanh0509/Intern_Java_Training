package controlstatements;

public class SwitchExample {
    public static void main(String[] args) {
        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Hôm nay là thứ Hai.");
                break;
            case "Tuesday":
                System.out.println("Hôm nay là thứ Ba.");
                break;
            case "Wednesday":
                System.out.println("Hôm nay là thứ Tư.");
                break;
            default:
                System.out.println("Hôm nay không phải là thứ Hai, Ba, hoặc Tư.");
        }
    }
}
