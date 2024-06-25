package hat;

// imports

import locations.*;
import аbstract.HatRoles;

import java.util.Arrays;
import java.util.Objects;

public class Hat {
    //Переменная имя
    private final String name;
    // Местоимение шляпы
    private final String pronoun;
    // Массив роли шляпы
    private HatRoles[] hatRoles;
    // Массив предметов
    public Item[] itemsInHat = Item.values();

    // Метод выводит местоимение
    public String getPronoun() {
        return this.pronoun;
    }


    // Имя объекта
    public Hat(String name,String pronoun) {
        this.name = name;
        this.pronoun = pronoun;
    }

    // Сохранение массива
    public void setItemsInHat() {
        itemsInHat = Item.values();
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
            if (i != hatRoles.length - 1) {
                System.out.print(" as " + hatRoles[i] + ",");
            } else {
                System.out.print(" as " + hatRoles[i] + ".");
            }
        }
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