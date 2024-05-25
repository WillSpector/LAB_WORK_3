package Actors;

// imports
import Interfaces.Communication;
import Locations.Location;


public class Mister extends Character implements Communication {
    // Переменная location
    private Location location;

    // Имя
    public Mister(String name) {
        setName(name);
    }
    // Выбор локации
    public void setLocation(Location location) {
        this.location = location;
    }
    // Перемещение в выбранную локацию
    public void moveTo(Object object) {
        if (object ==""){
            if (this.location == Location.STREET) {System.out.print(" went on " + this.location + ". ");}
            else {System.out.print(" went to " + this.location + ". ");}
        }
        else {
            if (this.location == Location.STREET) {
                System.out.print(" went on " + this.location + " with " + object + ". ");
            } else {
                System.out.print(" went to " + this.location + " with " + object + ". ");
            }
        }
    }


    @Override
    public void communication(Object... v) {

    }
}
