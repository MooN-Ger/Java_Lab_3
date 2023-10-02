import java.util.Objects;

public class Package {

    private String name;
    private double weight;

    public Package(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name of package can't be null");
        if (name.equals("")) throw new IllegalArgumentException("Name of package can't be empty");
        this.name = name;
    }

    public void setWeight(double weight) {
        if (weight < 0) throw new IllegalArgumentException("Package weight can't be below zero");
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return Double.compare(aPackage.weight, weight) == 0 && Objects.equals(name, aPackage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "Package{" +
                "name='" + name + '\'' +
                ", weight=" + weight + " kg" +
                '}';
    }
}
