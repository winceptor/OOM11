public class HouseCat implements Cat {

    @Override
    public void meow() {
        System.out.println("Meow meow meow");
    }

    @Override
    public void eat() {
        System.out.println("Housecat eats again.");
    }

    @Override
    public void sleep() {
        System.out.println("Housecat sleeps all day.");
    }

    @Override
    public void walk() {
        System.out.println("Housecat walks around the house.");
    }
}
