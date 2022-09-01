public class Dog extends Canine {
    protected String name;

    public Dog(String name, double size) {
        super(size);
        this.name = name;
    }

    public void fetch() {
        System.out.println("Run catch return");
    }

    public String toString() {
        return ("Name: " + name + " Size: " + size);
    }

    public boolean equals(Object o) {
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog doggy = (Dog) o;
        return ((doggy.size == size) && (doggy.name.equals(name)));
    }

    public void groom() {}

    public static void main(String[] args) {
        Dog spot = new Dog("Spot", 9.6);
        Dog dog2 = new Dog("Spot", 9.43);
        System.out.println(spot.equals(dog2));
        spot.bark();
    }
}