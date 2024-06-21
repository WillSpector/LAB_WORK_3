package аbstract;

public enum HatRoles {
    HEADGEAR("a headgear"),
    TRAVEL_BAG("a travel bag"),
    WAREHOUSE_FOR_SCRAP_MATERIALS("warehouse for scrap materials");

    // Переменная для хранения предмета
    private final String hatRoles;

    HatRoles(String hatRoles) {
        this.hatRoles = hatRoles;
    }

    public String getHatRoles() {
        return hatRoles;
    }

    // Переопределяем метод toString
    @Override
    public String toString() {
        return getHatRoles();
    }
}
