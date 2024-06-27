package interfaces;

import actors.Crabs;

public interface Speakable {
    // Вывести на экран фразу и к кому она направлена
    void speak(Crabs crabs, Communication addressObject);
}