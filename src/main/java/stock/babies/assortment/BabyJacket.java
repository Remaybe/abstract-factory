package stock.babies.assortment;

import clothes.assortment.Jacket;

public class BabyJacket implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Baby has put on jacket");
    }
}
