package locations;

import actors.Scooperfield;
import hat.Item;

import java.util.Arrays;

public class Bathroom extends Location {
    public Bathroom(String name) {
        super(name);
    }

    // Создаем класс Locker
    public static class Locker {
        private final String name;
        private Item[] listOfThings;
        private boolean isEmpty;

        public Locker(String name) {
            this.name = name;
            isEmpty = true;
        }

        // Создаем метод "спрятать вещи в шкафчик"
        public void putThingsInsideLocker(Item[] thingsInsideLocker, Scooperfield scooperfield) {
            isEmpty = false;
            listOfThings = thingsInsideLocker;
            scooperfield.listOfThings = new Item[0];
            System.out.println("\n" +
                    "Hid all things in the locker: "
                    + Arrays.toString(thingsInsideLocker).replaceAll("\\[|]$", "") + ".");
        }
    }

    // Создаем класс Shelf
    public static class Shelf {
        private final String name;
        private final int numberOfPlacesOnTheShelf = 0;
        public Item[] itemsOnShelf = new Item[numberOfPlacesOnTheShelf];

        public Shelf(String name) {
            this.name = name;
        }

        // Метод положить предмет рядом на полку
        public void putItemOnShelf(Item item, Scooperfield scooperfield) {
            scooperfield.listOfThings = new Item[0];
            Item[] newItemsOnShelf = new Item[itemsOnShelf.length + 1];
            System.arraycopy(itemsOnShelf, 0, newItemsOnShelf, 0, itemsOnShelf.length);
            newItemsOnShelf[newItemsOnShelf.length - 1] = item;
            itemsOnShelf = newItemsOnShelf;
            System.out.print("Put his " + item + " near, ");
        }

        // Создаем класс StrawberrySoapOfCrabs
        public static class StrawberrySoapOfCrabs {
            private final String name;

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
