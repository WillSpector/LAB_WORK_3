package Actors;

abstract class Character {
    // Имя персонажа
    private String name;

    // Установить имя
    public void setName(String name) {this.name = "Mr." + name;}

    // Вывести имя на экран
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
