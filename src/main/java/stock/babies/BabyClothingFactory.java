package stock.babies;

import clothes.ClothesFactory;
import clothes.assortment.Jacket;
import clothes.assortment.Trousers;
import stock.babies.assortment.BabyJacket;
import stock.babies.assortment.BabyTrousers;

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
