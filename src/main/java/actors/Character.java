package actors;

// imports

import locations.Location;

import java.util.Objects;

abstract class Character {
    // Имя персонажа
    private final String name;
    // Местоимение персонажа
    private final String pronoun;
    // Переменная location
    protected Location location;

    // Метод возврата имени (пока не используется)
    public String getName() {
        return this.name;
    }

    // Метод выводит местоимение
    public void getPronoun() {
        System.out.print(this.pronoun);
    }

    // Конструктор Character
    protected Character(String name, String pronoun) {
        this.name = name;
        this.pronoun = pronoun;
    }


    // Переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name);
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return name;
    }
}










