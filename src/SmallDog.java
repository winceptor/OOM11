public class SmallDog implements Dog {

    @Override
    public void bark() {
        System.out.println("[muffled bark in distance]");
    }

    @Override
    public void eat() {
        System.out.println("Small dog doesn't eat much.");
    }

    @Override
    public void walk() {
        System.out.println("Small dog runs wildly!");
    }

    @Override
    public void sleep() {
        System.out.println("Small dog never sleeps!");
    }
}
