public class Main {
    public static void main(String[] args) {
        Person baby = new Person(10, "Jack");
        Person adult = new Person(20, "Lauren");

        ClothesFactory factory = FactoryConfigurator.getFactory(baby.getAge());
        factory.sewJacket().putOn();
        ClothesFactory anotherFactory = FactoryConfigurator.getFactory(adult.getAge());
        anotherFactory.sewTrousers().putOn();
    }
}
