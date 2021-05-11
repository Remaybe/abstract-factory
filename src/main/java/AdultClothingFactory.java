public class AdultClothingFactory implements ClothesFactory{
    @Override
    public Jacket sewJacket() {
        return new AdultJacket();
    }

    @Override
    public Trousers sewTrousers() {
        return new AdultTrousers();
    }
}
