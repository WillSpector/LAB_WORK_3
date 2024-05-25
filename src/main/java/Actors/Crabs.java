package Actors;

import Interfaces.Speakable;

public class Crabs extends Mister implements Speakable {
    // Переменная принимающая слова Крабса
    private String phrase;

    // Кому будут направлены слова
    private Object addressObject;

    // Имя персонажа (Крабс)
    public Crabs(String name) {super(name);}

    // Слова, которые говорит Крабс
    public void setPhrase(String phrase){
        this.phrase = phrase;
    }

    // Вывод на экран фразу и к кому она направлены
    @Override
    public void speak (Object addressObject) {
        Crabs crabs = new Crabs("Crabs");
        System.out.println(crabs + " said: " + this.phrase + " - to " + addressObject +". ");
    }

}
