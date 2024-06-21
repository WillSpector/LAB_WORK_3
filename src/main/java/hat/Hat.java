package hat;

// imports

import locations.*;
import аbstract.HatRoles;

import java.util.Arrays;
import java.util.Objects;

public class Hat {
    //Переменная имя

    private final String name;
    // Массив роли шляпы
    private HatRoles[] hatRoles;
    // Массив предметов
    public Item[] itemsInHat;

    public void setItemsInHat() {
        itemsInHat = Item.values();
    }




    // Имя объекта
    public Hat(String name) {
        this.name = name;
    }

    // Метод, который выводит место подбора предметов
    public void pickUpLocationItem(Location location) {
        if (location instanceof Street) {
            System.out.println("which he got on " + location + ".");
        } else {
            System.out.println("which he got in " + location + ".");
        }
    }

    // Метод роли шляпы
    public void getRoles() {
        hatRoles = HatRoles.values();
        System.out.print("Obviously, Mr.Scooperfield's hat used");
        for (int i = 0; i < hatRoles.length; i++) {
            System.out.print(" as " + hatRoles[i]);
        }
        System.out.print(".");
    }

    @Override
    //  Переопределим метод toString
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hat hat = (Hat) o;
        return Objects.equals(name, hat.name) && Objects.deepEquals(hatRoles, hat.hatRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(hatRoles));
    }
}