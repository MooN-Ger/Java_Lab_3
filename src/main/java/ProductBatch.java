import java.util.Arrays;
import java.util.Objects;

public class ProductBatch {
    private String description;
    private PackagedProduct[] products;

    public ProductBatch(String description, PackagedProduct... products) {
        if (description == null) throw new IllegalArgumentException("description of ProductBatch can't be null");
        this.description = description;
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public PackagedProduct[] getProducts() {
        return products;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProducts(PackagedProduct[] products) {
        this.products = products;
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (PackagedProduct product : products) {
            if (product instanceof PackagedWeightProduct packagedWeightProduct) {
                totalWeight += packagedWeightProduct.getGrossWeight();
            }
            if (product instanceof PackagedPieceProduct packagedPieceProduct) {
                totalWeight += packagedPieceProduct.getGrossWeight();
            }
        }
        return totalWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductBatch that = (ProductBatch) o;
        return Objects.equals(description, that.description) && Arrays.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(description);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        return "ProductBatch{" +
                "description='" + description + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
