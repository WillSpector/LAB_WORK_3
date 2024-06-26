package abstracts;

public enum HatRoles {
    HEADGEAR("a headgear"),
    TRAVEL_BAG("a travel bag"),
    WAREHOUSE_FOR_SCRAP_MATERIALS("warehouse for scrap materials");

    // Имя
    private final String hatRoles;

    // Конструктор
    HatRoles(String hatRoles) {
        this.hatRoles = hatRoles;
    }

    // Метод "Получить имя"
    public String getHatRoles() {
        return hatRoles;
    }

    // Переопределяем метод toString
    @Override
    public String toString() {
        return getHatRoles();
    }
}
