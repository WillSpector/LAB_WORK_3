package аctors;

// imports

import exception.NotSetFacialExpressionsException;
import exception.ScooperfieldNotTakeItemFromHatException;
import interfaces.*;
import hat.*;
import locations.Location;

import java.util.Arrays;
import java.util.Objects;

public class Scooperfield extends Mister implements Thankable, InteractionWithHat {
    // Переменная для выражения лица
    private String facialExpressions;
    //  Переменная наличия шляпы на голове
    private boolean isHatOnHead;
    // Массив для хранения предметов
    private final Item[] arrayThings = Item.values();
    private boolean isBeingWashed;

    // Имя персонажа (Крабс)
    public Scooperfield(String name) {
        super(name);
    }

    // Метод осмотр локации (улица, комната или ванная комната)
    public void look(Locations location) {
        System.out.print("Looking around " + location);
    }

    // Метод смотреть на предметы
    public void lookAtItems(Item item0, Location.Bathroom.Shelf.StrawberrySoapOfCrabs item1) {
        System.out.print(" looked at " + item0 + " and " + item1 + " for a while,");
    }

    // Метод позволяет настроить гримасу на лице Скуперфильда (только smile или grimace of disgust)
    public void setFacialExpressions(String facialExpressions) throws NotSetFacialExpressionsException {
        if (Objects.equals(facialExpressions, "grimace of disgust") || Objects.equals(facialExpressions, "smile")) {
            this.facialExpressions = facialExpressions;
        } else {
            throw new NotSetFacialExpressionsException("Enter 'smile' or 'grimace of disgust'");
        }
    }

    // Метод выводит на экран манипуляции с лицом
    public void getFacialExpressions() {
        if (Objects.equals(this.facialExpressions, "smile")) {
            System.out.print("putting a " + this.facialExpressions + " on his face, which can be mistaken for a grimace of disgust, ");
        } else if (Objects.equals(this.facialExpressions, "grimace of disgust")) {
            System.out.print("putting a " + this.facialExpressions + " on his face, which can be mistaken for a smile, ");
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
            System.out.println("He took off his " + hat + " from head and pulled out of it: ");
        } else {
            System.out.println("Hat isn't on head");
        }
    }

    // Переопределяем метод интерфейса. Достать все предметы из шляпы
    public void takeItemsFromHat() {
        int quantityOfItem;
        for (quantityOfItem = 0; quantityOfItem < arrayThings.length; quantityOfItem++) {
            System.out.print(arrayThings[quantityOfItem] + ", ");
        }
    }

    // Переопределяем метод интерфейса. Достать предмет из шляпы
    public void takeItemFromHat(Item item) throws ScooperfieldNotTakeItemFromHatException {
        if (item == null) {
            throw new ScooperfieldNotTakeItemFromHatException("Can't pull out null from Hat!");
        } else {
            System.out.print(item.getItem() + ", ");
        }
    }

    // Метод "замечать где"
    public void toNotice(Location.Bathroom.Shelf locations, Location.Bathroom.Shelf.StrawberrySoapOfCrabs item, Communication object) {
        System.out.println("but then noticed on " + locations + " at the washstand, exactly the same" + item + " belonging to " + object);
    }

    // Метод положить предмет рядом
    public void putItemNear(Item item) {
        System.out.print("Put his " + item + " near, ");
    }

    // Переопределяем метод интерфейса. Метод, говорит ли Скопрефильд спасибо и кому
    public void thanks(boolean willThank, Communication addressObject) {
        if (willThank) {
            System.out.println("Mr." + getName() + " thanked " + "Mr." + addressObject);
        }
    }

    // Метод помыть часть тела
    public void washBodyPart(Washable bodyPart) {
        this.isBeingWashed = true;
        System.out.print("wash his " + bodyPart);
    }

    public void isBeingWashed(Washable bodyPart) {
        String isWashed;
        if (isBeingWashed) {
            isWashed = " was washed";
        } else {
            isWashed = " wasn't washed";
        }
        System.out.println(bodyPart.toString() +
                isWashed);
    }

    public void isWashingWithAnotherSoap(Item itemFirst, Location.Bathroom.Shelf.StrawberrySoapOfCrabs itemSecond) {
        System.out.println(itemFirst + " but with " + itemSecond + " that lay nearby.");
    }

    // Вложенные статические классы Hands and Cheeks
    public static class Hands implements Washable {
        String name;

        public Hands(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class Cheeks implements Washable {
        String name;

        public Cheeks(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    // Переопределение метода equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Scooperfield that = (Scooperfield) o;
        return isHatOnHead == that.isHatOnHead && Objects.equals(facialExpressions, that.facialExpressions) && Objects.deepEquals(arrayThings, that.arrayThings);
    }

    // Переопределение метода hashCode
    public int hashCode() {
        return Objects.hash(super.hashCode(), facialExpressions, isHatOnHead, Arrays.hashCode(arrayThings));
    }
}






