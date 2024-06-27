package hat;

public enum Item {
    // Список предметов
    TOOTHBRUSH("toothbrush"),
    HANDKERCHIEFS("handkerchiefs"),
    DENTIFRICE("dentifrice"),
    SPARE_SOCKS("spare socks"),
    OLD_NAIL("two old nails"),
    TOWEL("towel"),
    PIECE_OF_COPPER_WIRE("piece of copper wire"),
    STRAWBERRY_SOAP("strawberry soap");

    // Имя
    private final String value;

    // Конструктор
    Item(String value) {
        this.value = value;
    }

    // Метод "Получить имя"
    public String getItem() {
        return value;
    }

    // Переопределяем метод toString
    @Override
    public String toString() {
        return getItem();
    }
}