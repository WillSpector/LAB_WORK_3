package actors;

// imports

import interfaces.Communication;
import interfaces.Speakable;

import java.util.Objects;

public class Crabs extends Mister implements Speakable {
    // Переменная для хранения слов Крабса
    private String phrase;

    // Имя персонажа (Крабс)
    public Crabs(String name, String pronoun) {
        super(name, pronoun);
    }

    // Метод для установки слов, которые говорит Крабс
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }


    // Выводит на экран фразу и к кому она направлена
    @Override
    public void speak(Communication addressObject) {
        System.out.println(getName() + " said: " + this.phrase + " - to " + addressObject + ". ");
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Crabs crabs = (Crabs) o;
        return Objects.equals(phrase, crabs.phrase);
    }


    // Переопределение метода hasCode
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), phrase);
    }
}
