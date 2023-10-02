import java.util.Objects;

public class PieceProduct extends Product {

    private double weight;

    public PieceProduct (String name, String description, double weight) {
        super(name, description);
        this.weight = weight;
    }

    public PieceProduct () {
        super("PieceProduct", "Description");
        setWeight(0);
    }

    public PieceProduct (PieceProduct pieceProduct) {
        super(pieceProduct.getName(), pieceProduct.getDescription());
        setWeight(pieceProduct.getWeight());
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) throw new IllegalArgumentException("PieceProduct weight can't be below zero");
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PieceProduct that = (PieceProduct) o;
        return Double.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return super.toString() + " " + "PieceProductWeight=" + weight + " kg";
    }

}
