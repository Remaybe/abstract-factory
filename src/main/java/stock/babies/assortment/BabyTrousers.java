package stock.babies.assortment;

import clothes.assortment.Trousers;

public class BabyTrousers implements Trousers {
    @Override
    public void putOn() {
        System.out.println("Baby has put on trousers");
    }
}
