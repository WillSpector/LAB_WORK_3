package locations;

import hat.Item;

import java.util.Arrays;

public class Bathroom extends Location {
    public Bathroom(String name) {
        super(name);
    }

    // Создаем класс Locker
    public static class Locker {
        private String name;

        public Locker(String name) {
            this.name = name;
        }

        // Создаем метод "спрятать вещи в шкафчик"
        public void putThingsInsideLocker(Item[] thingsInsideLocker) {
            System.out.println("\n" +
                    "Hid all things in the locker: " + Arrays.toString(thingsInsideLocker).replaceAll("\\[|\\]$", "") + ".");
        }
    }

    // Создаем класс Shelf
    public static class Shelf {
        private String name;
        private Item placeOnShelf;

        public Shelf(String name) {
            this.name = name;
        }

        // Метод положить предмет рядом на полку
        public void toPutItemOnShelf(Item item) {
            placeOnShelf = item;
            System.out.print("Put his " + item + " near, ");
        }

        // Создаем класс StrawberrySoapOfCrabs
        public static class StrawberrySoapOfCrabs {
            private String name;

            public StrawberrySoapOfCrabs(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return name;
            }
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
