package locations;

import interfaces.Locations;

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

        @Override
        public String toString() {
            return location;
        }
    }
}

