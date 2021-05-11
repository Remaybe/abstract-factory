public class BabyClothingFactory implements ClothesFactory {
    @Override
    public Jacket sewJacket() {
        return new BabyJacket();
    }

    @Override
    public Trousers sewTrousers() {
        return new BabyTrousers();
    }
}
