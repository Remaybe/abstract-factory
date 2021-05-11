public class FactoryConfigurator {
    public static ClothesFactory getFactory(int personAge){

        ClothesFactory factory = null;

        if (personAge > 0 && personAge < 18) {
            factory = new BabyClothingFactory();
        } else if (personAge > 18) {
            factory = new  AdultClothingFactory();
        }

        return factory;
    }
}
