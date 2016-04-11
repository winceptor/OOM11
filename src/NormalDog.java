public class NormalDog implements Dog {

    @Override
    public void bark() {
        System.out.println("Burg!");
    }

    @Override
    public void eat() {
        System.out.println("Nom nom!");
    }

    @Override
    public void walk() {
        System.out.println("Normal dog walks normally.");
    }

    @Override
    public void sleep() {
        System.out.println("Normal dog sleeps normally.");
    }
}
