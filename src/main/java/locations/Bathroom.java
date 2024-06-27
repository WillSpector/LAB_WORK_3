package locations;

import actors.Scooperfield;
import hat.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class Bathroom extends Location {
    // Конструктор
    public Bathroom(String name) {
        super(name);
    }

    // Класс Locker
    public static class Locker {
        // Имя
        private final String name;
        // Массив предметов в шкафчике
        private Item[] listOfThings;
        // Шкафчик пустой?
        private boolean isEmpty;

        // Конструктор
        public Locker(String name) {
            this.name = name;
            isEmpty = true;
        }

        // Метод "Спрятать вещи в шкафчик"
        public void putThingsInsideLocker(Item[] thingsInsideLocker, Scooperfield scooperfield) {
            isEmpty = false;
            listOfThings = thingsInsideLocker;
            scooperfield.listOfThings = new Item[0];
            System.out.println("\n" +
                    "Hid all things in the locker: "
                    + Arrays.toString(thingsInsideLocker).replaceAll("\\[|]$", "") + ".");
        }
    }

    // Класс Shelf
    public static class Shelf {
        // Имя
        private final String name;
        // Массив для хранения предметов на полке
        private final ArrayList<Object> itemsOnShelf = new ArrayList<>();

        // Конструктор
        public Shelf(String name) {
            this.name = name;
        }

        // Метод "Положить предмет рядом на полку"
        public void putItemOnShelf(Item item, Scooperfield scooperfield) {
            scooperfield.listOfThings = new Item[0];
            itemsOnShelf.add(item);
            System.out.print("Put his " + item + " near, ");
        }

        // Метод "Задать предмет Мыло на полке"
        public void setSoapOnShelf(StrawberrySoapOfCrabs soap) {
            itemsOnShelf.add(soap);
        }

        // Класс StrawberrySoapOfCrabs
        public static class StrawberrySoapOfCrabs {
            // Имя
            private final String name;

            // Конструктор
            public StrawberrySoapOfCrabs(String name) {
                this.name = name;
            }

            // Переопределим метод toString
            @Override
            public String toString() {
                return name;
            }
        }

        // Переопределим метод toString
        @Override
        public String toString() {
            return name;
        }
    }
}