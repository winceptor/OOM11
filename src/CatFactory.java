public class CatFactory extends AbstractFactory {

    public Cat createCat(String type) {
        if (type=="wildcat")
        {
            return new WildCat();
        }
        else
        {
            return new HouseCat();
        }
    }
}
