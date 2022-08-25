public class InsectClient{
    public static void main(String[] args){
        System.out.print(Insect.randomFact());
        Insect bug1 = new Insect(13, 31, 0);
        System.out.println();
        System.out.println(bug1.getWeight());
        System.out.println(bug1.getX());
        System.out.println(bug1.getY());
    }
}