package Filter;

public class ContainsStringFilter implements Filter {

    private String pattern;

    public ContainsStringFilter(String pattern) {
        if (pattern == null) throw new IllegalArgumentException("Argument can't be null");
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        if (str == null) throw new IllegalArgumentException("Argument can't be null");
        return str.contains(pattern);
    }
}
