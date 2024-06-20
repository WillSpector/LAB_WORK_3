package locations;

public abstract class Location {
    private final String name;

    public Location(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

