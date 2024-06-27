package hat;

// imports

import locations.*;
import abstracts.HatRole;

import java.util.Arrays;
import java.util.Objects;

public class Hat {
    // Имя
    private final String name;
    // Местоимение
    private final String pronoun;
    // Роль шялпы
    private HatRole[] hatRoles;
    // Предметы в шляпе
    public Item[] itemsInHat = Item.values();

    // Конструктор
    public Hat(String name, String pronoun) {
        this.name = name;
        this.pronoun = pronoun;
    }

    // Метод "Получить местоимение"
    public String getPronoun() {
        return this.pronoun;
    }

    // Метод "Задать предметы в шялпе"
    public void setItemsInHat() {
        itemsInHat = Item.values();
    }

    // Метод "Выводим на экран место, где взяли предметы
    public void pickUpLocationItem(Location location) {
        if (location instanceof Street) {
            System.out.println("which he got on " + location + ".");
        } else {
            System.out.println("which he got in " + location + ".");
        }
    }

    // Метод "Роль шляпы"
    public void getRoles() {
        hatRoles = HatRole.values();
        System.out.print("Obviously, Mr.Scooperfield's hat used");
        for (int i = 0; i < hatRoles.length; i++) {
            if (i != hatRoles.length - 1) {
                System.out.print(" as " + hatRoles[i] + ",");
            } else {
                System.out.print(" as " + hatRoles[i] + ".");
            }
        }
    }

    // Переопределим метод toString
    @Override
    public String toString() {
        return name;
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hat hat = (Hat) o;
        return Objects.equals(name, hat.name) && Objects.deepEquals(hatRoles, hat.hatRoles);
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(hatRoles));
    }
}