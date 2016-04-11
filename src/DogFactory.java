public class DogFactory extends AbstractFactory {

    public Dog createDog(String type) {
        if (type=="smalldog")
        {
            return new SmallDog();
        }
        else if(type=="bigdog")
        {
            return new BigDog();
        }
        else
        {
            return new NormalDog();
        }
    }
}
