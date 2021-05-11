package stock.adults.assortment;

import clothes.assortment.Trousers;

public class AdultTrousers implements Trousers {
    @Override
    public void putOn() {
        System.out.println("Adult has put on trousers");
    }
}
