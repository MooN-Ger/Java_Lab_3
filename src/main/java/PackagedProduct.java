import java.util.Objects;

public class PackagedProduct extends Product {
    public Package _Package;

    public Package get_Package() {
        return _Package;
    }

    public void set_Package(Package _Package) {
        if (_Package == null) throw new IllegalArgumentException("_Package can't be null");
        this._Package = _Package;
    }

    public PackagedProduct(String name, String description, Package _Package) {
        super(name, description);
        this._Package = _Package;
    }

    public PackagedProduct() {
        super("PackagedProduct", "PackagedProduct description");
        this._Package = new Package("Package", 0);
    }

    public PackagedProduct(PackagedProduct packagedProduct) {
        super(packagedProduct.getName(), packagedProduct.getDescription());
        set_Package(packagedProduct.get_Package());
    }

    public PackagedProduct(Product product, Package _Package) {
        super(product);
        set_Package(_Package);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackagedProduct that = (PackagedProduct) o;
        return Objects.equals(_Package, that._Package);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), _Package);
    }

    @Override
    public String toString() {
        return super.toString() + " " + _Package.toString();
    }
}
