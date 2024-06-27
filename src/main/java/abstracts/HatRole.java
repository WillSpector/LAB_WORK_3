package abstracts;

public enum HatRole {
    // Список ролей шляпы
    HEADGEAR("a headgear"),
    TRAVEL_BAG("a travel bag"),
    WAREHOUSE_FOR_SCRAP_MATERIALS("warehouse for scrap materials");

    // Поле
    private final String value;

    // Конструктор
    HatRole(String value) {
        this.value = value;
    }

    // Метод "Получить имя"
    public String getHatRole() {
        return value;
    }

    // Переопределяем метод toString
    @Override
    public String toString() {
        return getHatRole();
    }
}