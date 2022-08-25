public class Insect{

    // static instance constants
    private static final double DIST_WEIGHT_LOSS_FACTOR = .0001;
    private static final String[] FACTS = {
        "The two main types of insects are winged and wingless",
        "There are more than 1 million insect species",
        "Insects are cold-blooded",
        "Spiders are not considered insects"
    };

    // static instance variables
    private static int population = 0;

    // instance variables
    private double weight;
    private int x;
    private int y;

    // constructor
    public Insect(double initWeight, int initx, int inity){
        weight = initWeight;
        x = initx;
        y = inity;
        population++;
    }

    // Getter or accessor methods 
    public double getWeight(){
        return weight;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    // Setter or mutator methods
    public void setX(int newX){
        if (isLegalX(newX)){
            x = newX;
        }
    }
    
    public void setY(int newX){
        if (isLegalX(newY)){
            y = newY;
        }
    }

    // Check if new x value is legal
    public static boolean isLegalX(int newX){
        return (newX >= 0 ? true : false)
    }

    // Check if new y value is legal
    public static boolean isLegalY(int newY){
        return (newY >= 0 ? true : false)
    }

    // method - eat
    public void eat(double amount){
        System.out.println("Nibble nibble");
        weight += amount;
    }

    // method - move
    public void move(int newX, int newY){
        double distance = calculateDistance(x, y, newX, newY);
        if (distance > 0) {
            x = newX;
            y = newY;
            weight *=  DIST_WEIGHT_LOSS_FACTOR * distance;
            System.out.printf("Moved %.2f units.\n", distance);
        }
        else{
            System.out.println("Staying put");
        }
    }

    private double calculateDistance(double x1, double x2, double y1, double y2){
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static String randomFact(){
        int index = (int)(Math.random() * ((FACTS.length - 1) + 1));
        return FACTS[index];
    }

    // main
    public static void main(String[] args){
        //Insect buzz1 = new Insect();
        //Insect buzz2 = new Insect();
        Insect bug1 = new Insect(10, 100, 90);
        Insect bug2 = new Insect(12, -30, 85);
        
        System.out.println("Population: " + population);

        bug1.move(1, 10);
        bug2.move(30, -99);

        System.out.println("Did you know? " + randomFact());
    }
}