package stock.adults;

import clothes.ClothesFactory;
import clothes.assortment.Jacket;
import clothes.assortment.Trousers;
import stock.adults.assortment.AdultTrousers;
import stock.adults.assortment.AdultJacket;

public class AdultClothingFactory implements ClothesFactory {
    @Override
    public Jacket sewJacket() {
        return new AdultJacket();
    }

    @Override
    public Trousers sewTrousers() {
        return new AdultTrousers();
    }
}
