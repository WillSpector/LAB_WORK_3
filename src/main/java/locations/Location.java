package locations;

public enum Location {
//private static String location;
//
//
//    public static class HotelRoom{
//        @Override
//        public String toString() {
//            location = "hotel room";
//            return location;
//        }
//    }
    // Список локаций
    HOTEL_ROOM("the hotel room"),
    BATHROOM("the bathroom"),
    STREET("the street");

    // Переменная для хранения локации
    private final String location;

    Location(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    // Переопределяем метод toString
    public String toString() {
        return location;
    }
}
