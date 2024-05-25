package Locations;

import java.security.PublicKey;

public enum Location {
    HOTEL_ROOM ("the hotel room"),
    BATHROOM ("the bathroom"),
    STREET ("the street");


    private final String location;

    Location (String location) {this.location = location;}

    public String getLocation() {return location;}

    @Override
    public String toString() {
        return  location;}
}
