public class WildCat implements Cat {

    @Override
    public void meow() {
        System.out.println("A wild cat meows.");
    }

    @Override
    public void eat() {
        System.out.println("Wild cat eats a bird.");
    }

    @Override
    public void sleep() {
        System.out.println("Wild cat sleeps on a tree.");
    }

    @Override
    public void walk() {
        System.out.println("Wild cat goes hunting.");
    }
}
