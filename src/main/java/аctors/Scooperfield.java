package аctors;

// imports
import interfaces.InteractionWithHat;
import interfaces.Thankable;
import locations.Location;
import hat.*;

import java.util.Arrays;
import java.util.Objects;

import static hat.Item.*;

public class Scooperfield extends Mister implements Thankable, InteractionWithHat {
    // Переменная для выражения лица
    String facialExpressions;
    // Переменная спасибо
    boolean thanks;
    //  Переменная наличия шляпы на голове
    boolean isHatOnHead;
    // Массив для хранения предметов
    private final Item[] arrayThings = Item.values();
    // Имя персонажа (Крабс)
    public Scooperfield(String name) {super(name);}
    // Метод осмотр локации (улица, комната или ванная комната)
    public void look(Location location) {
        System.out.print("Looking around "+ location);
    }
    // Метод позволяет настроить гримасу на лице Скуперфильда (только smile или grimace of disgust)
    public void setFacialExpressions(String facialExpressions) {
        if(Objects.equals(facialExpressions, "grimace of disgust") | Objects.equals(facialExpressions, "smile")) {
            this.facialExpressions = facialExpressions;
        }
        else {
            System.out.println("Enter 'smile' or 'grimace of disgust'");
        }
    }
    // Метод выводит на экран манипуляции с лицом
    public void getFacialExpressions() {
        if(Objects.equals(this.facialExpressions, "smile")) {
            System.out.print(" putting a " + this.facialExpressions + " on his face, which can be mistaken for a grimace of disgust, ");}
        else if (Objects.equals(this.facialExpressions, "grimace of disgust")) {
            System.out.print(" putting a " + this.facialExpressions + " on his face, which can be mistaken for a smile, ");
        }
    }
    // Метод позволяет установить (надета ли шляпа на голове)
    public void setHatOnHead(boolean isHatOnHead) {
        this.isHatOnHead = isHatOnHead;
    }
@Override
    // Метод для снятия шляпы с головы
    public void takeOffHat(Hat hat) {
        if (isHatOnHead) {
            this.isHatOnHead = false;
            System.out.println("He took off his "+ hat+ " from head and pulled out of it: ");
        } else {
            System.out.println("Hat isn't on head");
        }
    }
    // Переопределяем метод интерфейса. Достать предметы из шляпы
    public void takeItemFromHat(Item item) {
        if (!isHatOnHead) {
            if (item == TOOTHBRUSH){System.out.print(arrayThings[0]+", ");}
            else if (item ==HANDKERCHIEFS) {System.out.print(arrayThings[1]+", ");}
            else if (item ==DENTIFRICE) {System.out.print(arrayThings[2]+", ");}
            else if (item ==SPARE_SOCKS) {System.out.print(arrayThings[3]+", ");}
            else if (item ==OLD_NAIL) {System.out.print(arrayThings[4]+", ");}
            else if (item ==TOWEL) {System.out.print(arrayThings[5]+", ");}
            else if (item ==PIECE_OF_COPPER_WIRE) {System.out.print(arrayThings[6]+", ");}
            else if (item ==ALL_ITEM) {System.out.print(arrayThings[7]);}
            else {System.out.print("There is no this item in the hat");}
        } else {
            System.out.println("You can't do that. Hat on head. Take off it. ");
        }
    }
    // Переопределяем метод интерфейса. Метод, говорит ли Скопрефильд спасибо и кому
    public void thanks(boolean willThank, Object addressObject) {
        if (willThank) {
            System.out.println("Mr."+getName() +" thanked " + "Mr." + addressObject);
        }
    }
    // Переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Scooperfield that = (Scooperfield) o;
        return thanks == that.thanks && isHatOnHead == that.isHatOnHead && Objects.equals(facialExpressions, that.facialExpressions) && Objects.deepEquals(arrayThings, that.arrayThings);
    }
    // Переопределение метода hashCode
    public int hashCode() {
        return Objects.hash(super.hashCode(), facialExpressions, thanks, isHatOnHead, Arrays.hashCode(arrayThings));
    }
}


