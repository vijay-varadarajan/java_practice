public class Poodle extends Dog {
    private String favouriteShampoo;
    private String favouriteConditioner;
    
    public Poodle(String name, double size, String favouriteShampoo, String favouriteConditioner) {
        super(name, size);
        this.favouriteShampoo = favouriteShampoo;
        this.favouriteConditioner = favouriteConditioner;
    }

    public void groom() {
        System.out.println( favouriteShampoo + " rinse " + favouriteConditioner + " wait 10 mins, dry and massage.");
    }
}