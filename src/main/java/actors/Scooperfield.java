package actors;

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
    // Место в руках
    private final int numberOfPlacesInHands = 0;
    // Массив для хранения предметов (в руках)
    public Item[] listOfThings = new Item[numberOfPlacesInHands];

    @Override
    // Переопределяем метод интерфейса. Достать предмет из шляпы
    public void takeItemFromHat(Item item, Hat hat) throws ScooperfieldNotTakeItemFromHatException {
        if (item == null) {
            throw new ScooperfieldNotTakeItemFromHatException("Can't pull out null from Hat!");
        } else {
            int index = -1;
            for (int i = 0; i < hat.itemsInHat.length; i++) {
                if (hat.itemsInHat[i] == item) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                Item[] newItemsInHat = new Item[hat.itemsInHat.length - 1];
                for (int i = 0, j = 0; i < hat.itemsInHat.length; i++) {
                    if (i != index) {
                        newItemsInHat[j++] = hat.itemsInHat[i];
                    }
                }
                hat.itemsInHat = newItemsInHat;
            }
            Item[] newListOfThings = new Item[listOfThings.length + 1];
            System.arraycopy(listOfThings, 0, newListOfThings, 0, listOfThings.length);
            newListOfThings[newListOfThings.length - 1] = item;
            listOfThings = newListOfThings;
            System.out.print(" take " + item + " from " + hat + ",");
        }
    }

    // Имя персонажа (Крабс)
    public Scooperfield(String name, String pronoun) {
        super(name, pronoun);
    }

    // Метод осмотр локации (улица, комната или ванная комната)
    public void lookAround(Location location) {
        System.out.print("Looking around " + location);
    }

    // Метод смотреть на предметы
    public void lookAtSoaps(Item itemFirst, Bathroom.Shelf.StrawberrySoapOfCrabs itemSecond) {
        System.out.print(" looked at " + itemFirst + " and " + itemSecond + "for a while,");
    }

    // Метод позволяет настроить гримасу на лице Скуперфильда (только smile или grimace of disgust)
    public void setFacialExpressions(FacialExpressions facialExpressions) throws NotSetFacialExpressionsException {
        if (Objects.equals(facialExpressions, FacialExpressions.GRIMACE_OF_DISGUST) ||
                Objects.equals(facialExpressions, FacialExpressions.SMILE)) {
            this.facialExpressions = facialExpressions;
        } else {
            throw new NotSetFacialExpressionsException("Enter " + FacialExpressions.GRIMACE_OF_DISGUST
                    + " or " + FacialExpressions.SMILE);
        }
    }

    // Метод выводит на экран манипуляции с лицом
    public void getFacialExpressions() {
        if (Objects.equals(this.facialExpressions, FacialExpressions.SMILE)) {
            System.out.print("putting a " + this.facialExpressions
                    + " on his face, which can be mistaken for a grimace of disgust, ");
        } else if (Objects.equals(this.facialExpressions, FacialExpressions.GRIMACE_OF_DISGUST)) {
            System.out.print("putting a " + this.facialExpressions
                    + " on his face, which can be mistaken for a smile, ");
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
        System.out.print(" pulled out of it:");
    }

    @Override
    // Переопределяем метод интерфейса. Достать все предметы из шляпы
    public void takeItemsFromHat() {
        int quantityOfItem;
        for (quantityOfItem = 0; quantityOfItem < listOfThings.length; quantityOfItem++) {
            System.out.print(listOfThings[quantityOfItem] + ", ");
        }
    }

    // Метод "замечать где"
    public void noticeOn(Bathroom.Shelf location) {
        System.out.print("but then noticed on " + location + " at the washstand,");
    }

    // Метод принадлежности
    public void belongTo(Bathroom.Shelf.StrawberrySoapOfCrabs item, Character object) {
        System.out.print(" exactly the same " + item + "belonging to " + object + ". ");
    }

    @Override
    // Переопределяем метод интерфейса. Метод, говорит ли Скопрефильд спасибо и кому
    public void thanks(Communication addressObject) {
        System.out.println(getName() + " thanked " + addressObject);
    }

    public void washingWithAnotherSoap(Item itemFirst, Bathroom.Shelf.StrawberrySoapOfCrabs itemSecond) {
        System.out.println(itemFirst + " but with " + itemSecond + "that lay nearby.");
    }

    // Метод помыть часть тела
    public void washBodyPart(Washable bodyPart) {
        bodyPart.setWashed(true);
        System.out.print("started to wash his " + bodyPart);
    }

    // Вложенные статические классы Hands and Cheeks
    public static class Hands implements Washable {
        // Переменая имя
        private final String name;
        // Переменная помыты ли руки
        private boolean isWashed;

        public Hands(String name) {
            this.name = name;
        }

        // Переопределение метода (булевая переменная пымыты ли руки)
        @Override
        public void setWashed(boolean isWashed) {
            this.isWashed = isWashed;

        }

        // Метод для проверки помыты ли руки
        public void isWashedHands(Washable hands) {
            String isHandsWashed;
            if (isWashed) {
                isHandsWashed = "Hands was washed";
            } else {
                isHandsWashed = "Hands wasn't washed";
            }
            System.out.print(isHandsWashed);
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
        private boolean isWashed;

        public Cheeks(String name) {
            this.name = name;
        }

        // Переопределение метода (булевая переменная пымыты ли щеки)
        @Override
        public void setWashed(boolean isWashed) {
            this.isWashed = isWashed;
        }

        // Метод для проверки помыты ли щеки

        public void isWashedCheeks() {
            String isCheeksWashed;
            if (isWashed) {
                isCheeksWashed = "Cheeks was washed";
            } else {
                isCheeksWashed = "Cheeks wasn't washed";
            }
            System.out.print(isCheeksWashed);
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
        return isHatOnHead == that.isHatOnHead && facialExpressions == that.facialExpressions
                && Objects.deepEquals(listOfThings, that.listOfThings);
    }

    // Переопределение метода hasCode
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), facialExpressions, isHatOnHead, Arrays.hashCode(listOfThings));
    }
}










