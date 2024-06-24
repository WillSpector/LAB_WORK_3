package аctors;

// imports

import java.util.Objects;

abstract class Character {
    // Имя персонажа
    private String name;

    // Местоимение персонажа
    private String pronoun;

    // Метод возврата имени (пока не используется)
    public String getName() {
        return this.name;
    }

    // Метод выводит местоимение
    public void getPronoun() {
        System.out.print(this.pronoun);
    }

    // Конструктор Character
    public Character(String name, String pronoun) {
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










