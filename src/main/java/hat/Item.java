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
    private final String item;

    // Конструктор
    Item(String item) {
        this.item = item;
    }
    // Метод "Получить имя"
    public String getItem() {
        return item;
    }

    // Переопределяем метод toString
    @Override
    public String toString() {
        return getItem();
    }
}
