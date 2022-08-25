public class Craps{

    private Die die1, die2;
    private int point;

    public Craps(){
        die1 = new Die();
        die2 = new Die();
    }

    private int toss(){
        int total = die1.roll() + die2.roll();
        System.out.println("Die 1: " + die1.getFaceValue() + "   Die 2: " + die2.getFaceValue());
        return total;
    }

    public void go(){
        
        System.out.println("Stage 1: ");

        point = toss();
        System.out.println("   Point: " + point);

        if (point == 7 || point == 11){
            System.out.println("Winner!");
        } else if (point == 2 || point == 3 || point == 12){
            System.out.println("Lost!");
        } else {
            System.out.println("Stage 2:");
            stage2();
        }
    }

    private void stage2(){
        boolean endGame = false;

        while(!endGame){
            
            int total = toss();
            System.out.println("   Point: " + total);

            if (total == point){
                System.out.println("Winner!");
                endGame = true;
            }
            else if (total == 7){
                System.out.println("Lost!");
                endGame = true;
            }
        }
    }
}