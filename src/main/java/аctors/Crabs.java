package аctors;

// imports

import interfaces.Speakable;

import java.util.Objects;

public class Crabs extends Mister implements Speakable {
    // Переменная для хранения слов Крабса
    private String phrase;

    // Имя персонажа (Крабс)
    public Crabs(String name) {
        super(name);
    }

    // Метод для установки слов, которые говорит Крабс
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    @Override
    // Выводит на экран фразу и к кому она направлена
    public void speak(Object addressObject) {
        System.out.println("Mr." + getName() + " said: " + this.phrase + " - to " + "Mr." + addressObject + ". ");
    }

    // Переопределение метода equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Crabs crabs = (Crabs) o;
        return Objects.equals(phrase, crabs.phrase);
    }


    // Переопределение метода hashCode
    public int hashCode() {
        return Objects.hash(super.hashCode(), phrase);
    }
}
