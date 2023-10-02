import java.util.Objects;

public class Product {

    private String name;
    private String description;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Product(Product product) {
        setDescription(product.getDescription());
        setName(product.getName());
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name of package can't be null");
        if (name.equals("")) throw new IllegalArgumentException("Name of package can't be empty");
        this.name = name;
    }

    public void setDescription(String description) {
        if (description == null) throw new IllegalArgumentException("Name of package can't be null");
        if (description.equals("")) throw new IllegalArgumentException("Name of package can't be empty");
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
