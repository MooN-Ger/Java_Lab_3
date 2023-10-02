import java.util.Objects;

public class PackagedPieceProduct extends PackagedProduct {

    private int quantity;
    private PieceProduct pieceProduct;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("quantity of PieceProduct can't be below zero");
        this.quantity = quantity;
    }

    public PackagedPieceProduct(PieceProduct pieceProduct, Package _package, int quantity) {
        super(pieceProduct, _package);
        this.quantity= quantity;
        this.pieceProduct = pieceProduct;
    }

    public double getNetWeight() {
        return quantity * pieceProduct.getWeight();
    }

    public double getGrossWeight() {
        return (_Package.getWeight() + (quantity * pieceProduct.getWeight()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackagedPieceProduct that = (PackagedPieceProduct) o;
        return quantity == that.quantity && Objects.equals(pieceProduct, that.pieceProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity, pieceProduct);
    }

    @Override
    public String toString() {
        return pieceProduct.toString() + " "+ _Package.toString() + " " + "quantity of PieceProduct=" + quantity;
    }
}
