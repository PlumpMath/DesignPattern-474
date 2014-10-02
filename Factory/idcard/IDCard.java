package idcard;
import framework.*;

public class IDCard extends Product{
    private String owner;
    private int serial;
    public IDCard(int serial, String owner) {
        System.out.println("Create " + owner + "(" + serial + ")'s card");
        this.owner = owner;
        this.serial = serial;
    }
    public void use() {
        System.out.println("Use " + owner + "(" + serial + ")'s card");
    }
    public String getOwner() {
        return owner;
    }
    public int getSerial() {
        return serial;
    }

}