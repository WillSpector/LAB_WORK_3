package аctors;

// imports
import java.util.Objects;

abstract class Character {
    // Имя персонажа
    private String name;
    // Метод для установки имени
    public void setName(String name) {this.name = "Mr." + name;}
    // Метод возврата имени (пока не используется)
    public String getName() {
        return this.name;
    }
    // Конструктор Character
    public Character(String name){
        this.name = name;
    }


    @Override
    // Переопределение метода equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name);
    }
    // Переопределение метода hashCode
    public int hashCode() {
        return Objects.hashCode(name);
    }
    // Переопределение метода toString
    public String toString() {
        return name;
    }
}










