public class HelloWorldLoop{
    public static void main(String[] args){
        int counter = 0;
        while (counter < 10){
            System.out.printf("%d HelloWorld\n", counter + 1);
            counter ++;
        }
        for (int n = 0; n < 10; n++){
            System.out.printf("%d HelloWorld\n", n + 1);
        }
    }
}