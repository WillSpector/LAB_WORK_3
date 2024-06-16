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
    STRAWBERRY_SOAP(" strawberry soap");
    // Переменная для хранения предмета
    private final String item;

    Item(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    @Override
    // Переопределяем метод toString
    public String toString() {
        return getItem();
    }
}
