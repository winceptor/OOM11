public class BigDog implements Dog {

    @Override
    public void bark() {
        System.out.println("*A loud bark*");
    }

    @Override
    public void eat() {
        System.out.println("Big dog eats another dog.");
    }

    @Override
    public void walk() {
        System.out.println("Big dog is too lazy to walk.");
    }

    @Override
    public void sleep() {
        System.out.println("Big dog sleeps a lot.");
    }
}
