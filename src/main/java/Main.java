// imports

import exception.NotSetFacialExpressionsException;
import hat.*;
import locations.*;
import abstracts.FacialExpression;
import actors.*;
import abstracts.Concatenation;


public class Main {

    // Декларация персонажей
    static Crabs crabs;
    static Scooperfield scooperfield;
    // Декларация частей тела Скуперфильда
    static Scooperfield.Hands hands;
    static Scooperfield.Cheeks cheeks;
    // Декларация локаций
    static Street street;
    static HotelRoom hotelRoom;
    static Bathroom bathroom;
    // Декларация предметов
    static Hat hat;
    static Bathroom.Shelf.StrawberrySoapOfCrabs strawberrySoapOfCrabs;
    // Декларация объектов в ванной
    static Bathroom.Locker locker;
    static Bathroom.Shelf shelf;
    // Декларация класса "соединителя"
    static Concatenation concatenation;

    static {
        // Инициализация персонажей
        crabs = new Crabs("Crabs", "he");
        scooperfield = new Scooperfield("Scooperfield", "he");
        // Инициализация частей тела Скуперфильда
        hands = new Scooperfield.Hands("hands");
        cheeks = new Scooperfield.Cheeks("cheeks");
        // Инициализация локаций
        street = new Street("street");
        hotelRoom = new HotelRoom("the hotel room");
        bathroom = new Bathroom("bathroom");
        // Инициализация предметов
        hat = new Hat("hat", "it");
        strawberrySoapOfCrabs = new Bathroom.Shelf.StrawberrySoapOfCrabs("soap");
        // Инициализация объектов в ванной
        locker = new Bathroom.Locker("Locker");
        shelf = new Bathroom.Shelf("shelf");
        // Инициализация класса "соединителя"
        concatenation = new Concatenation();
    }

    public static void main(String[] args) throws NotSetFacialExpressionsException {
        // Выводи на экран имя объекта crabs
        System.out.print(crabs);
        // Выводим на экран куда и с кем перемещается персонаж
        crabs.moveToLocationWith(scooperfield, hotelRoom);
        // Задаем фразу которую говорит Крабс
        crabs.setPhrase("You need to wash your face!");
        // Выводим на экран что говорит Крабс
        crabs.speak(scooperfield);
        // Скоперфильд осматривает локацию (можно выбрать)
        scooperfield.lookAround(hotelRoom);
        // Соединяем строки
        concatenation.getAnd();
        // Задаем выражение лица
        scooperfield.setFacialExpression(FacialExpression.GRIMACE_OF_DISGUST);
        // Выводим текст сравнения выражение лица
        scooperfield.getFacialExpression();
        // Кого благодарит Scooperfield
        scooperfield.thanks(crabs);
        // Соединяем строки
        concatenation.getAnd();
        // Выводим на экран куда перемещается персонаж
        scooperfield.moveToLocationAlone(bathroom);
        // Сохраняем предметы в шляпе
        hat.setItemsInHat();
        // Местоимение He
        scooperfield.getPronoun();
        // Скуперфильд снимает шляпу с головы
        scooperfield.takeOffHat(hat);
        // Соединяем строки
        concatenation.getAnd();
        // Вывод на экран текста достать из шляпы
        scooperfield.pullOutOfHat(hat);
        // Достаем вещи из шляпы (Держит в руках)
        scooperfield.takeItemFromHat(Item.TOOTHBRUSH, hat);
        scooperfield.takeItemFromHat(Item.HANDKERCHIEFS, hat);
        scooperfield.takeItemFromHat(Item.DENTIFRICE, hat);
        scooperfield.takeItemFromHat(Item.SPARE_SOCKS, hat);
        scooperfield.takeItemFromHat(Item.OLD_NAIL, hat);
        scooperfield.takeItemFromHat(Item.TOWEL, hat);
        scooperfield.takeItemFromHat(Item.PIECE_OF_COPPER_WIRE, hat);
        hat.pickUpLocationItem(street);
        // Выводим на экран роль шляпы
        hat.getRoles();
        // Кладем массив из предметов в шкафчик
        locker.putThingsInsideLocker(scooperfield.listOfThings, scooperfield);
        // Достаем мыло из шляпы
        System.out.print(scooperfield);
        scooperfield.takeItemFromHat(Item.STRAWBERRY_SOAP, hat);
        // Сеттим обеъект мыло на полку
        shelf.setSoapOnShelf(strawberrySoapOfCrabs);
        // Вызываем метод где заметил
        scooperfield.noticeOn(shelf);
        // Метод принадлежности предмета
        scooperfield.belongTo(strawberrySoapOfCrabs, crabs);
        // Метод положить рядом на полку
        shelf.putItemOnShelf(Item.STRAWBERRY_SOAP, scooperfield);
        // Скуперфильд
        System.out.print(scooperfield);
        // Метод смотреть на предметы
        scooperfield.lookAtSoaps(Item.STRAWBERRY_SOAP, strawberrySoapOfCrabs);
        // after that
        concatenation.getAfter();
        // Местоимение he
        scooperfield.getPronoun();
        // Пробел
        concatenation.getSpace();
        // Методы помыть руки
        scooperfield.washBodyPart(hands);
        // Соединяем строки
        concatenation.getAnd();
        // Методы помыть щеки
        scooperfield.washBodyPart(cheeks);
        // Выводим however
        concatenation.getHowever();
        // Метод помыть другим мылом
        scooperfield.washingWithAnotherSoap(Item.STRAWBERRY_SOAP, strawberrySoapOfCrabs);

        // Анонимный класс ресторан
        Location restaurant = new Location("restaurant") {
        };
        System.out.println(crabs + " go to " + restaurant);
    }
}

