package locations;

public abstract class Location {
    // Имя
    private final String name;

    // Конструктор
    protected Location(String name) {
        this.name = name;
    }

    // Переопределим метод toString
    @Override
    public String toString() {
        return name;
    }
}

