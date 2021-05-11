import clothes.ClothesFactory;
import clothes.utils.FactoryConfigurator;

public class Main {
    public static void main(String[] args) {
        // creating persons, whom our factory will be based on
        Person baby = new Person(10, "Jack");
        Person adult = new Person(20, "Lauren");

        // creating factories due to person's age
        ClothesFactory factory = FactoryConfigurator.getFactory(baby.getAge());
        factory.sewJacket().putOn();

        ClothesFactory anotherFactory = FactoryConfigurator.getFactory(adult.getAge());
        anotherFactory.sewTrousers().putOn();
    }
}
