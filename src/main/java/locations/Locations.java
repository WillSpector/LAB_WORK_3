package locations;

public abstract class Locations {
    private final String name;

    public Locations(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

