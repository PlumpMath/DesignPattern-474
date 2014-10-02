package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private HashMap database = new HashMap();
    private int serial = 0;

    protected synchronized Product createProduct(String owner) {
        Product idcard = new IDCard(serial, owner);
        serial++;
        return idcard;
    }
    protected void registerProduct(Product p) {
        IDCard card = (IDCard)p;
        database.put(card.getSerial(), card.getOwner());
    }

    public HashMap getDatabase() {
        return database;
    }
}