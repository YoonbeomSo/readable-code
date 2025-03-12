package cleancode.homework;

import java.util.Collection;

public class Order {

    private Collection<String> items;
    private int totalPrice = 0;
    private Long memberSeq;

    public boolean isItemEmpty() {
        return items == null || items.isEmpty();
    }

    public boolean isInvalidPrice() {
        return totalPrice <= 0;
    }

    public boolean isCustomerInfoEmpty() {
        return memberSeq == null;
    }

    @Deprecated
    public Collection<String> getItems() {
        return items;
    }

    @Deprecated
    public int getTotalPrice() {
        return totalPrice;
    }

    @Deprecated
    public boolean isCustomerInfo() {
        return memberSeq == null;
    }
}
