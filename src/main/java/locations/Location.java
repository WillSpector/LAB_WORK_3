package locations;

import hat.Item;
import interfaces.Locations;

import java.util.Arrays;


public class Location {
    public static Locations Street;
    private static String location;

    // Создаем класс Street
    public static class Street implements Locations {
        public Street() {
            location = "street";
        }

        @Override
        public String toString() {
            return location;
        }
    }
    // Создаем класс HotelRoom
    public static class HotelRoom implements Locations {
        public HotelRoom() {
            location = "hotel room ";
        }

        @Override
        public String toString() {
            return location;
        }
    }
    // Создаем класс Bathroom
    public static class Bathroom implements Locations {
        public Bathroom() {
            location = "bathroom";
        }
        // Создаем класс Locker
        public static class Locker {
            private boolean isEmpty;

            public String toString() {
                String name = "locker";
                return name;
            }
            // Создаем метод "спрятать вещи в шкафчик"
            public void putThingsInsideLocker(Item[] thingsInsideLocker) {
                System.out.println("Спяртав все вещи в шкаф " + Arrays.toString(thingsInsideLocker).replaceAll("\\[|\\]$", "") + ".");
            }
        }
        // Создаем класс Shelf
        public static class Shelf {
            public String toString() {
                String name = "shelf";
                return name;
            }
            // Создаем класс StrawberrySoapOfCrabs
            public static class StrawberrySoapOfCrabs {
                String name = " strawberry soap of Crabs";

                public String toString() {
                    return name;
                }
            }

        }

        @Override
        public String toString() {
            return location;
        }
    }
}

