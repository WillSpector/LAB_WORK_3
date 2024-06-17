package locations;

import hat.Item;
import interfaces.Locations;

import java.util.Arrays;


public class Location {
    public static Locations Street;
    private static String location;


    public static class Street implements Locations {
        public Street() {
            location = "street";
        }

        @Override
        public String toString() {
            return location;
        }
    }

    public static class HotelRoom implements Locations {
        public HotelRoom() {
            location = "hotel room ";
        }

        @Override
        public String toString() {
            return location;
        }
    }

    public static class Bathroom implements Locations {
        public Bathroom() {
            location = "bathroom";
        }

        public static class Locker {
            private boolean isEmpty;

            public String toString() {
                String name = "locker";
                return name;
            }

            public void putThingsInsideLocker(Item[] thingsInsideLocker) {
                System.out.println("Спяртав все вещи в шкаф " + Arrays.toString(thingsInsideLocker).replaceAll("\\[|\\]$", "") + ".");
            }
        }

        public static class Shelf {
            public String toString() {
                String name = "shelf";
                return name;
            }

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

