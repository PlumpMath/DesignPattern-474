package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    protected Product createProduct(String owner) {
        Product idcard = new IDCard(owner);
        return idcard;
    }
    protected void registerProduct(Product p) {
        owners.add(p);
    }

    public List getOwners() {
        return owners;
    }
}