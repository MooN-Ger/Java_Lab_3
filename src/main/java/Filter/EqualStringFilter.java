package Filter;

public class EqualStringFilter implements Filter {

    private String pattern;

    public EqualStringFilter(String pattern) {
        if (pattern == null) throw new IllegalArgumentException("Argument can't be null");
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        if (str == null) throw new IllegalArgumentException("Argument can't be null");
        return str.equals(pattern);
    }
}
