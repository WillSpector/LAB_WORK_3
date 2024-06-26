// imports

import exception.NotSetFacialExpressionsException;
import hat.*;
import locations.*;
import abstracts.FacialExpressions;
import actors.*;
import abstracts.Concatenation;

public class Main {
    public static void main(String[] args) throws NotSetFacialExpressionsException {
        // Создаем объект класса Crabs
        Crabs crabs = new Crabs("Crabs", "he");
        // Создаем объект класса Scooperfield
        Scooperfield scooperfield = new Scooperfield("Scooperfield", "he");
        // Создаем класс and для соединения строк в тексте
        Concatenation concatenation = new Concatenation();
        // Выводи на экран имя объекта crabs
        System.out.print(crabs);
        // Создаем локации
        HotelRoom hotelRoom = new HotelRoom("the hotel room");
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
        scooperfield.setFacialExpressions(FacialExpressions.GRIMACE_OF_DISGUST);
        // Выводим текст сравнения выражение лица
        scooperfield.getFacialExpressions();
        // Кого благодарит Scooperfield
        scooperfield.thanks(crabs);
        // Соединяем строки
        concatenation.getAnd();
        // Создаем локацию
        Bathroom bathroom = new Bathroom("bathroom");
        // Выводим на экран куда перемещается персонаж
        scooperfield.moveToLocationAlone(bathroom);
        // Создаем объект Шляпа
        Hat hat = new Hat("hat", "it");
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
        Street street = new Street("street");
        hat.pickUpLocationItem(street);
        // Выводим на экран роль шляпы
        hat.getRoles();
        // Создаем класс шкафчик
        Bathroom.Locker locker = new Bathroom.Locker("Locker");
        // Кладем массив из предметов в шкафчик
        locker.putThingsInsideLocker(scooperfield.listOfThings, scooperfield);
        // Достаем мыло из шляпы
        System.out.print(scooperfield);
        scooperfield.takeItemFromHat(Item.STRAWBERRY_SOAP, hat);
        // Создаем объект полка
        Bathroom.Shelf shelf = new Bathroom.Shelf("shelf");
        // Создаем объект strawberry soap of Crabs
        Bathroom.Shelf.StrawberrySoapOfCrabs strawberrySoapOfCrabs =
                new Bathroom.Shelf.StrawberrySoapOfCrabs("soap");
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
        // Создаем части тела
        Scooperfield.Hands hands = new Scooperfield.Hands("hands");
        Scooperfield.Cheeks cheeks = new Scooperfield.Cheeks("cheeks");
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
