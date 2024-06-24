package locations;

public abstract class Location {
    private final String name;

    protected Location(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

