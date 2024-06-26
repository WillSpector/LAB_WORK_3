package actors;

// imports

import interfaces.Communication;
import locations.*;

import java.util.Objects;

public class Mister extends Character implements Communication {

    public Mister(String name, String pronoun) {
        super("Mr." + name, pronoun);
    }

    // Метод "Переместиться в выбранную локацию c кем-то"
    public void moveToLocationWith(Character character, Location location) {
        character.location = location;
        this.location = location;
        System.out.print(" went to " + this.location + " with " + character + ". ");
    }

    // Метод "Переместиться в выбранную локацию в одиночку"
    public void moveToLocationAlone(Location location) {
        this.location = location;
        System.out.print("went to " + this.location + ". ");
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mister mister = (Mister) o;
        return Objects.equals(location, mister.location);
    }

    // Переопределение метода hasCode
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), location);
    }
}
