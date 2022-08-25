public class Averager{
    public static void main(String[] args){
        int[] weekHighs = {80, 70, 75, 69, 54, 23, 96};
        int highsSum = 0;

        for (double dayHighs : weekHighs){
            highsSum += dayHighs;
        }
        double averageHighs = highsSum / weekHighs.length;

        System.out.println("Average is " + averageHighs);
        System.out.println(ArraySearch.Search(69, weekHighs));
        System.out.println(ArraySearch.Search(34, weekHighs));
    }
}