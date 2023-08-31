public class Main {
    public static void main(String[] args) {

        for (Months element : Months.values()) {
            if (element.toString().endsWith("Y")) {
                System.out.println(element + " ends with y");
            } else System.out.println(element + " doesn't end with y");
        }
    }
}
