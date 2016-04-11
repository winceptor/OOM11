public class Mainclass {

    public static void main(String[] args) {
        AbstractFactory dogf = new DogFactory();
        
        Dog small = dogf.createDog("smalldog");
        small.bark();
        small.eat();
        small.sleep();
        small.walk();
        System.out.println();
        
        Dog big = dogf.createDog("bigdog");
        big.bark();
        big.eat();
        big.sleep();
        big.walk();
        System.out.println();
        
        Dog normal = dogf.createDog("normaldog");
        normal.bark();
        normal.eat();
        normal.sleep();
        normal.walk();
        System.out.println();
        
        AbstractFactory catf = new CatFactory();
        
        Cat house = catf.createCat("housecat");
        house.meow();
        house.eat();
        house.walk();
        house.sleep();        
        System.out.println();
        
        Cat wild = catf.createCat("wildcat");
        wild.meow();
        wild.eat();
        wild.walk();
        wild.sleep();
        System.out.println();
    }
}
