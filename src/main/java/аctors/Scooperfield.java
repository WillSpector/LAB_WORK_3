package аctors;

// imports

import exception.*;
import interfaces.*;
import hat.*;
import locations.Bathroom;
import locations.Location;
import аbstract.FacialExpressions;


import java.util.Arrays;
import java.util.Objects;


public class Scooperfield extends Mister implements Thankable, InteractionWithHat {
    // Переменная для выражения лица
    private FacialExpressions facialExpressions;
    //  Переменная наличия шляпы на голове
    private boolean isHatOnHead;
    // Массив для хранения предметов (в руках)
    private Item[] listOfThings;

    // Имя персонажа (Крабс)
    public Scooperfield(String name, String pronoun) {
        super(name, pronoun);
    }

    // Достать масив из шляпы
    public void getItemsFromHat(Item[] itemsInHands) {
        listOfThings = itemsInHands;
    }

    // Метод осмотр локации (улица, комната или ванная комната)
    public void look(Location location) {
        System.out.print("Looking around " + location);
    }

    // Метод смотреть на предметы
    public void lookAtSoaps(Item itemFirst, Bathroom.Shelf.StrawberrySoapOfCrabs itemSecond) {
        System.out.print(" looked at " + itemFirst + " and " + itemSecond + "for a while,");
    }

    // Метод позволяет настроить гримасу на лице Скуперфильда (только smile или grimace of disgust)
    public void setFacialExpressions(FacialExpressions facialExpressions) throws NotSetFacialExpressionsException {
        if (Objects.equals(facialExpressions, FacialExpressions.GRIMACE_OF_DISGUST) || Objects.equals(facialExpressions, FacialExpressions.SMILE)) {
            this.facialExpressions = facialExpressions;
        } else {
            throw new NotSetFacialExpressionsException("Enter " + FacialExpressions.GRIMACE_OF_DISGUST + " or " + FacialExpressions.SMILE);
        }
    }

    // Метод выводит на экран манипуляции с лицом
    public void getFacialExpressions() {
        if (Objects.equals(this.facialExpressions, FacialExpressions.SMILE)) {
            System.out.print("putting a " + this.facialExpressions + " on his face, which can be mistaken for a grimace of disgust, ");
        } else if (Objects.equals(this.facialExpressions, FacialExpressions.GRIMACE_OF_DISGUST)) {
            System.out.print("putting a " + this.facialExpressions + " on his face, which can be mistaken for a smile, ");
        }
    }


    @Override
    // Метод для снятия шляпы с головы
    public void takeOffHat(Hat hat) {
        isHatOnHead = false;
        System.out.print(" took off his " + hat + " from head ");
    }

    // Метод позволяет установить (надета ли шляпа на голове)
    public void isHatOnHead() {
        if (isHatOnHead) {
            System.out.println("The hat on the head");
        } else {
            System.out.println("The hat is not on the head");
        }
    }


    public void pullOutOfHat() {
        System.out.print(" pulled out of it: ");
    }

    @Override
    // Переопределяем метод интерфейса. Достать все предметы из шляпы
    public void takeItemsFromHat() {
        int quantityOfItem;
        for (quantityOfItem = 0; quantityOfItem < listOfThings.length; quantityOfItem++) {
            System.out.print(listOfThings[quantityOfItem] + ", ");
        }
    }

    @Override
    // Переопределяем метод интерфейса. Достать предмет из шляпы
    public void takeItemFromHat(Item item) throws ScooperfieldNotTakeItemFromHatException {
        if (item == null) {
            throw new ScooperfieldNotTakeItemFromHatException("Can't pull out null from Hat!");
        } else {
            System.out.print(item + ", ");
        }
    }

    // Метод "замечать где"
    public void notice(Bathroom.Shelf location, Bathroom.Shelf.StrawberrySoapOfCrabs item, Character object) {
        System.out.print("but then noticed on " + location + " at the washstand, exactly the same " + item + "belonging to " + object + ", ");
    }

    @Override
    // Переопределяем метод интерфейса. Метод, говорит ли Скопрефильд спасибо и кому
    public void thanks(Communication addressObject) {
        System.out.println("Mr." + getName() + " thanked " + "Mr." + addressObject);
    }

    public void washingWithAnotherSoap(Item itemFirst, Bathroom.Shelf.StrawberrySoapOfCrabs itemSecond) {
        System.out.println(itemFirst + " but with " + itemSecond + "that lay nearby.");
    }

    // Вложенные статические классы Hands and Cheeks
    public static class Hands implements Washable {
        // Переменая имя
        private final String name;
        // Переменная помыты ли руки
        private boolean isHandsWashed;

        public Hands(String name) {
            this.name = name;
        }

        // Метод помыть руки
        public void washHands(Washable hands) {
            isHandsWashed = true;
            System.out.print("started to wash his " + hands);
        }

        // Метод для проверки помыты ли руки
        public void isWashedHands(Washable hands) {
            String isWashed;
            if (isHandsWashed) {
                isWashed = " was washed";
            } else {
                isWashed = " wasn't washed";
            }
            System.out.print(hands + isWashed);
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class Cheeks implements Washable {
        // Переменая имя
        private final String name;
        // Переменная помыты ли щеки
        private boolean isCheeksWashed;

        public Cheeks(String name) {
            this.name = name;
        }

        // Метод помыть щеки
        public void washCheeks(Washable cheeks) {
            isCheeksWashed = true;
            System.out.print("started to wash his " + cheeks);
        }

        // Метод для проверки помыты ли щеки

        public void isWashedCheeks(Washable cheeks) {
            String isWashed;
            if (isCheeksWashed) {
                isWashed = " was washed";
            } else {
                isWashed = " wasn't washed";
            }
            System.out.print(cheeks + isWashed);
        }

        @Override
        public String toString() {
            return name;
        }
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Scooperfield that = (Scooperfield) o;
        return isHatOnHead == that.isHatOnHead && facialExpressions == that.facialExpressions && Objects.deepEquals(listOfThings, that.listOfThings);
    }

    // Переопределение метода hasCode
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), facialExpressions, isHatOnHead, Arrays.hashCode(listOfThings));
    }
}










