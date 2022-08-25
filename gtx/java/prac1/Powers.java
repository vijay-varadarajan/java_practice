public class Powers{
    public static void main(String[] args) {
        for (int base = 2; base < 5; base++) {
            System.out.println("Powers of: " + base);
            for (int i = 1; i < 100; i *= base) {
                System.out.println(i);
            }
            System.out.println();
        }
    }
}