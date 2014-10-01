import framework.*;
import idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Yuki Hiroshi");
        Product card2 = factory.create("Tomura");
        Product card3 = factory.create("Mikan");
/*        Product card1 = factory.create("結城ひろし");
        Product card2 = factory.create("とむら");
        Product card3 = factory.create("みかん");*/
        card1.use();
        card2.use();
        card3.use();
    }
}