public class GroomEverything {
    public static void main(String[] args) {
        Canine[] groomer = {
            new Wolf(17.01, 3),
            new Poodle("richie", 9, "lux brand", "Rich brand"),
            new Wolf(16, 5),
            new Poodle("pixy", 4, "top shelf", "Only the best"),
        };

        for (Canine c : groomer) {
            c.groom();
        }
    }
}