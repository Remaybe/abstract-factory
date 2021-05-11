package clothes;

import clothes.assortment.Jacket;
import clothes.assortment.Trousers;

public interface ClothesFactory {
    Jacket sewJacket();
    Trousers sewTrousers();
}
