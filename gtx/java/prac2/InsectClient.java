public class InsectClient{
    public static void main(String[] args){
        System.out.print(Insect.randomFact());
        Insect bug1 = new Insect(13, 31, 0);
        System.out.println();
        System.out.println("Bug1 weight: " + bug1.getWeight());
        System.out.println("Bug1 Original x: " + bug1.getX());
        System.out.println("Bug1 Original y: " + bug1.getY());
        
        bug1.setX(-314);
        System.out.println("Bug1 x coord. after -ve setx: "+bug1.getX());
        bug1.setX(300);
        System.out.println("Bug1 x coord. after +ve setx: "+bug1.getX());
        System.out.println(Insect.getPopulation());

        Insect bug2 = new Insect(31);
        System.out.println("Bug 2: " + bug2.toString());
        System.out.println(Insect.getPopulation());


        Insect bug3 = new Insect();
        System.out.println("Bug 3: " + bug3);
        System.out.println(Insect.getPopulation());
    }
}