public class Main {
    public static void main(String[] args) {
        enum months {January, February, March, April, May, June, July, August, September, October, November, December}
        for (months element : months.values()) {
            if (element.toString().endsWith("y")) {
                System.out.println(element + " ends with y");
            } else System.out.println(element + " doesn't end with y");
        }
    }
}
