package framework;

public abstract class Factory {
    public final Product create(String name) {
        Product p = createProduct(name);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}