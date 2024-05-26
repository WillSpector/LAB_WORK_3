package Actors;

// imports
import Locations.Location;
import java.util.Objects;


public class Mister extends Character{
    // Переменная location
    private Location location;
    // Имя
    public Mister(String name) {setName(name);}
    // Выбор локации
    public void setLocation(Location location) {this.location = location;}
    // Метод перемещения в выбранную локацию
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
    // Переопределение метода equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mister mister = (Mister) o;
        return location == mister.location;
    }
    // Переопределение метода hashCode
    public int hashCode() {
        return Objects.hash(super.hashCode(), location);
    }
}
