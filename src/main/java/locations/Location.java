package locations;

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
            private final String name;
            private final String[] thingsInsideLocker;
            private boolean isEmpty;
            public Locker(String[] thingsInsideLocker ){
                name = "Locker";
                this.thingsInsideLocker = thingsInsideLocker;
            }
            public void putThingsInsideLocker(){
                System.out.println("Спяртав все вещи в шкаф" + Arrays.toString(thingsInsideLocker));
            }


        }

        @Override
        public String toString() {
            return location;
        }
    }
}

