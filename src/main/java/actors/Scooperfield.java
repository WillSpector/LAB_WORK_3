package actors;

// imports

import exception.*;
import interfaces.*;
import hat.*;
import locations.Bathroom;
import locations.Location;
import abstracts.FacialExpression;

import java.util.Arrays;
import java.util.Objects;


public class Scooperfield extends Mister implements Thankable, InteractionWithHat {
    // Выражение лица
    private FacialExpression facialExpression;
    //  Шляпа на голове?
    private boolean isHatOnHead;
    // Место в руках
    private static final int NUMBER_OF_PLACES_IN_HANDS = 0;
    // Массив для хранения предметов (в руках)
    public Item[] listOfThings = new Item[NUMBER_OF_PLACES_IN_HANDS];

    // Конструктор
    public Scooperfield(String name, String pronoun) {
        super(name, pronoun);
    }

    // Метод "Осмотреть локацию"
    public void lookAround(Location location) {
        System.out.print("Looking around " + location);
    }

    // Метод "Смотреть на два разных мыла"
    public void lookAtSoaps(Item itemFirst, Bathroom.Shelf.StrawberrySoapOfCrabs itemSecond) {
        System.out.print(" looked at " + itemFirst + " and " + itemSecond + " for a while,");
    }

    // Метод "Настроить гримасу на лице Скуперфильда (только smile или grimace of disgust)"
    public void setFacialExpression(FacialExpression facialExpression) throws NotSetFacialExpressionsException {
        if (Objects.equals(facialExpression, FacialExpression.GRIMACE_OF_DISGUST) ||
                Objects.equals(facialExpression, FacialExpression.SMILE)) {
            this.facialExpression = facialExpression;
        } else {
            throw new NotSetFacialExpressionsException("Enter " + FacialExpression.GRIMACE_OF_DISGUST
                    + " or " + FacialExpression.SMILE);
        }
    }

    // Метод "Вывести на экран манипуляцию с лицом"
    public void getFacialExpression() {
        if (Objects.equals(this.facialExpression, FacialExpression.SMILE)) {
            System.out.print("putting a " + this.facialExpression
                    + " on his face, which can be mistaken for a grimace of disgust, ");
        } else if (Objects.equals(this.facialExpression, FacialExpression.GRIMACE_OF_DISGUST)) {
            System.out.print("putting a " + this.facialExpression
                    + " on his face, which can be mistaken for a smile, ");
        }
    }

    // Переопределяем метод интерфейса. Метод для снятия шляпы с головы
    @Override
    public void takeOffHat(Hat hat) {
        isHatOnHead = false;
        System.out.print(" took off his " + hat + " from head");
    }

    // Метод "Надета ли шляпа на голове"
    public void isHatOnHead() {
        if (isHatOnHead) {
            System.out.println("The hat on the head");
        } else {
            System.out.println("The hat is not on the head");
        }
    }

    public void pullOutOfHat(Hat hat) {
        System.out.print("pulled out of " + hat.getPronoun() + ": ");
    }

    // Переопределяем метод интерфейса. Достать все предметы из шляпы
    @Override
    public void takeItemsFromHat() {
        int quantityOfItem;
        for (quantityOfItem = 0; quantityOfItem < listOfThings.length; quantityOfItem++) {
            System.out.print(listOfThings[quantityOfItem] + ", ");
        }
    }

    // Переопределяем метод интерфейса. Достать предмет из шляпы
    @Override
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

    // Метод "Замечать"
    public void noticeOn(Bathroom.Shelf location) {
        System.out.print(" but then noticed on " + location + " at the washstand,");
    }

    // Метод принадлежности
    public void belongTo(Bathroom.Shelf.StrawberrySoapOfCrabs item, Character object) {
        System.out.print(" exactly the same " + item + " belonging to " + object + ". ");
    }

    @Override
    // Переопределяем метод интерфейса. Говорит ли Скопрефильд спасибо и кому
    public void thanks(Communication addressObject) {
        System.out.println(getName() + " thanked " + addressObject);
    }

    // Метод "Помыть с помощью другого мыла"
    public void washingWithAnotherSoap(Item itemFirst, Bathroom.Shelf.StrawberrySoapOfCrabs itemSecond) {
        System.out.println(itemFirst + " but with " + itemSecond + " that lay nearby.");
    }

    // Метод "Помыть часть тела"
    public void washBodyPart(Washable bodyPart) {
        bodyPart.setWashed(true);
        System.out.print("started to wash his " + bodyPart);
    }

    // Вложенный статический класс Hands
    public static class Hands implements Washable {
        // Имя
        private final String name;
        // Помыты ли руки
        private boolean isWashed;

        // Конструктор
        public Hands(String name) {
            this.name = name;
        }

        // Переопределяем метод интерфейса. Помыты ли руки
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

        // Переопределение метода toString
        @Override
        public String toString() {
            return name;
        }

    }

    // Вложенный статический класс Cheeks
    public static class Cheeks implements Washable {
        // Имя
        private final String name;
        // Помыты ли щеки
        private boolean isWashed;

        // Конструктор
        public Cheeks(String name) {
            this.name = name;
        }

        // Метод для проверки помыты ли щеки
        @Override
        public void setWashed(boolean isWashed) {
            this.isWashed = isWashed;
        }

        // Переопределяем метод интерфейса. Помыты ли щеки
        public void isWashedCheeks() {
            String isCheeksWashed;
            if (isWashed) {
                isCheeksWashed = "Cheeks was washed";
            } else {
                isCheeksWashed = "Cheeks wasn't washed";
            }
            System.out.print(isCheeksWashed);
        }

        // Переопределение метода toString
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
        return isHatOnHead == that.isHatOnHead && facialExpression == that.facialExpression
                && Objects.deepEquals(listOfThings, that.listOfThings);
    }

    // Переопределение метода hasCode
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), facialExpression, isHatOnHead, Arrays.hashCode(listOfThings));
    }
}










