public class Prime {
    public static void decimaltobinary(int decimal){
        int binary=0;
        int pow=0;
        while(decimal>0){
            int rem =decimal%2;
            binary=binary+(rem*((int)Math.pow(10,pow)));  // type casting as it convert double to int
            pow++;
            decimal=decimal/2;
        }
        System.out.print(binary);
    }
    public static void main(String args[]){
        decimaltobinary(9);

    } 
}