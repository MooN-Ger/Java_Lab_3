import java.util.Objects;

public class PackagedWeightProduct extends PackagedProduct {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) throw new IllegalArgumentException("PackagedWeightProduct can't be below zero");
        this.weight = weight;
    }

    public PackagedWeightProduct (Product product, Package _package, double weight) {
        super(product, _package);
        this.weight = weight;
    }

    public double getNetWeight() {
        return weight;
    }

    public double getGrossWeight() {
        return weight + _Package.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackagedWeightProduct that = (PackagedWeightProduct) o;
        return Double.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return super.toString() + " " + "netWeight=" + weight + " kg";
    }

}
