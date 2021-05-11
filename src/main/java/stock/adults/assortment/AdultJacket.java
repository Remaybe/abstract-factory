package stock.adults.assortment;

import clothes.assortment.Jacket;

public class AdultJacket implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Adult has put on jacket");
    }
}
