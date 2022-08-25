public class Insect{

    // public static instance constants
    public static final float DEFAULT_WEIGHT = 15;
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;

    // private static instance constants
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

    // Overloaded constructor
    public Insect(){
        // Chaining with more specific constructor using this() to avoid repeating code
        this(DEFAULT_WEIGHT);
    }

    // Multiple chaining levels
    public Insect(double initWeight){
        this(initWeight, DEFAULT_X, DEFAULT_Y);
    }

    // constructor using this as reference
    public Insect(double weight, int x, int y){
        this.weight = weight;
        this.x = x;
        this.y = y;
        population++;
    }

    // constructor using init parameters
    /*
    public Insect(double initWeight, int initx, int inity){
        weight = initWeight;
        x = initx;
        y = inity;
        population++;
    }
    */
    
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

    public static int getPopulation(){
        return population;
    }


    // Setter or mutator methods
    public void setX(int x){
        if (isLegalX(x)){
            this.x = x;
        }
    }
    
    public void setY(int y){
        if (isLegalX(y)){
            this.y = y;
        }
    }

    // Check if new x value is legal
    public static boolean isLegalX(int newX){
        return (newX >= 0 ? true : false);
    }

    // Check if new y value is legal
    public static boolean isLegalY(int newY){
        return (newY >= 0 ? true : false);
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

    // Overriding default toString method
    public String toString(){
        return ("Weight: " + weight + ", (x, y): " + x + ", " + y);
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