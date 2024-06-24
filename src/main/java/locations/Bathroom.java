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
        private Item[] listOfThings;
        private boolean isEmpty;

        public Locker(String name) {
            this.name = name;
            isEmpty = true;
        }

        // Создаем метод "спрятать вещи в шкафчик"
        public void putThingsInsideLocker(Item[] thingsInsideLocker) {
            isEmpty = false;
            listOfThings = thingsInsideLocker;
            System.out.println("\n" +
                    "Hid all things in the locker: "
                    + Arrays.toString(thingsInsideLocker).replaceAll("\\[|\\]$", "") + ".");
        }
    }

    // Создаем класс Shelf
    public static class Shelf {
        private String name;
        private final int numberOfPlacesOnTheShelf = 0;
        private Item[] itemsOnShelf = new Item[numberOfPlacesOnTheShelf];

        public Shelf(String name) {
            this.name = name;
        }

        // Метод положить предмет рядом на полку
        public void putItemOnShelf(Item item) {
            Item[] newItemsOnShelf = new Item[itemsOnShelf.length + 1];
            for (int i = 0; i < itemsOnShelf.length; i++) {
                newItemsOnShelf[i] = itemsOnShelf[i];
            }
            newItemsOnShelf[newItemsOnShelf.length - 1] = item;
            itemsOnShelf = newItemsOnShelf;
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
