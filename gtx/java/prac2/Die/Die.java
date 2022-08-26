import java.util.Random;

public class Die{

    public static final int SIDES = 6;
    private int faceValue;
    private Random rand;

    // constructor. Initializes values of the die
    public Die(){
        faceValue = 1;
        rand = new Random();
    }

    // method - roll die and return facevalue
    public int roll(){
        faceValue = rand.nextInt(SIDES) + 1;
        return faceValue;
    }

    // Getter / accessor method
    public int getFaceValue(){
        return faceValue;
    }

    // Overriding toString to format representation
    public String toString(){
        return ("Die has face value of: " + faceValue);
    }
}