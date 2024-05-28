package аctors;

// imports
import interfaces.Speakable;
import java.util.Objects;

public class Crabs extends Mister implements Speakable {
    // Переменная для хранения слов Крабса
    private String phrase;
    // Кому будут направлены слова
    private Object addressObject;
    // Имя персонажа (Крабс)
    public Crabs(String name) {super(name);}
    // Метод для установки слов, которые говорит Крабс
    public void setPhrase(String phrase){
        this.phrase = phrase;
    }

    @Override
    // Выводит на экран фразу и к кому она направлена
    public void speak (Object addressObject) {
        Crabs crabs = new Crabs("Crabs");
        System.out.println(crabs + " said: " + this.phrase + " - to " + addressObject +". ");
    }
    // Переопределение метода equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crabs crabs = (Crabs) o;
        return Objects.equals(phrase, crabs.phrase) && Objects.equals(addressObject, crabs.addressObject);
    }
    // Переопределение метода hashCode
    public int hashCode() {
        return Objects.hash(phrase, addressObject);
    }
}
