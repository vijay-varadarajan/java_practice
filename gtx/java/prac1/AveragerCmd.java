public class AveragerCmd{
    public static void main(String[] args) {
        double sum = 0;
        for (String num : args) {
            sum += Double.parseDouble(num);
        }
        double average = (args.length > 0) ? (sum / args.length) : 0;
        System.out.println("average=" + average);
    }
}