// imports

import exception.NotSetFacialExpressionsException;
import hat.Hat;
import hat.Item;
import locations.*;
import аbstract.FacialExpressions;
import аctors.*;
import аbstract.Concatenation;

import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) throws NotSetFacialExpressionsException {
        //Создаем объект класса Crabs
        Crabs crabs = new Crabs("Crabs", "he");
        //Создаем объект класса Scooperfield
        Scooperfield scooperfield = new Scooperfield("Scooperfield", "he");
        // Создаем класс and для соединения строк в тексте
        Concatenation сoncatenation = new Concatenation();
        // Выводи на экран имя объекта crabs
        System.out.print(crabs);
        // Пробел
        сoncatenation.getSpace();
        // Создаем локации
        HotelRoom hotelRoom = new HotelRoom("the hotel room");
        // Выводим на экран куда и с кем перемещается персонаж
        crabs.moveToLocationWith(scooperfield, hotelRoom);
        // Задаем фразу которую говорит Крабс
        crabs.setPhrase("You need to wash your face!");
        // Выводим на экран что говорит Крабс
        crabs.speak(scooperfield);
        // Скоперфильд осматривает локацию (можно выбрать)
        scooperfield.look(hotelRoom);
        // Пробел
        сoncatenation.getSpace();
        // Соединяем строки
        сoncatenation.getAnd();
        // Пробел
        сoncatenation.getSpace();
        // Задаем выражение лица
        scooperfield.setFacialExpressions(FacialExpressions.GRIMACE_OF_DISGUST);
        // Выводим текст сравнения выражение лица
        scooperfield.getFacialExpressions();
         /* Будет ли Mr.Scooperfield кого-то благодарить. Да параметр "willThank" лишний,
         но так интересней плюс можно расписать false:)*/
        scooperfield.thanks(crabs);
        // Соединяем строки
        сoncatenation.getAnd();
        // Пробел
        сoncatenation.getSpace();
        // Создаем локацию
        Bathroom bathroom = new Bathroom("bathroom");
        // Выводим на экран куда перемещается персонаж
        scooperfield.moveToLocationAlone(bathroom);
        // Создаем объект Шляпа
        Hat hat = new Hat("hat");
        // Сохраняем предметы в шляпе
        hat.setItemsInHat();
        // Местоимение He
        scooperfield.getPronoun();
        // Скуперфильд снимает шляпу с головы
        scooperfield.takeOffHat(hat);
        // Соединяем строки
        сoncatenation.getAnd();
        // Вывод на экран текста достать из шляпы
        scooperfield.pullOutOfHat();
        // Перемещаем предмет из шляпы в руки
        scooperfield.getItemsFromHat(hat.itemsInHat);
        /* Достаем вещи из шляпы (расписал для каждого предмета, если надо будет достать определенный)*/
        scooperfield.takeItemFromHat(Item.TOOTHBRUSH);
        scooperfield.takeItemFromHat(Item.HANDKERCHIEFS);
        scooperfield.takeItemFromHat(Item.DENTIFRICE);
        scooperfield.takeItemFromHat(Item.SPARE_SOCKS);
        scooperfield.takeItemFromHat(Item.OLD_NAIL);
        scooperfield.takeItemFromHat(Item.TOWEL);
        scooperfield.takeItemFromHat(Item.PIECE_OF_COPPER_WIRE);
        //Выводим место где были взяты предметы
        Street street = new Street("street");
        hat.pickUpLocationItem(street);
        //Выводим на экран роль шляпы
        hat.getRoles();
        // Создаем массив из вещей
        Item[] listOfItem = {Item.TOOTHBRUSH, Item.HANDKERCHIEFS, Item.DENTIFRICE, Item.SPARE_SOCKS, Item.OLD_NAIL,
                Item.TOWEL, Item.PIECE_OF_COPPER_WIRE};
        // Создаем класс шкафчик
        Bathroom.Locker locker = new Bathroom.Locker("Locker");
        // Класдем массив из предметов в шкафчик
        locker.putThingsInsideLocker(listOfItem);
        //Достаем мыло из шляпы
        System.out.print(scooperfield + " take from " + hat);
        // Пробел
        сoncatenation.getSpace();
        scooperfield.takeItemFromHat(Item.STRAWBERRY_SOAP);
        // Создаем объект полка
        Bathroom.Shelf shelf = new Bathroom.Shelf("shelf");
        // Создаем объект strawberry soap of Crabs
        Bathroom.Shelf.StrawberrySoapOfCrabs strawberrySoapOfCrabs =
                new Bathroom.Shelf.StrawberrySoapOfCrabs("soap ");
        // Вызываем метод где заметил
        scooperfield.notice(shelf);
        // Метод принадлежности предмета
        scooperfield.belongTo(strawberrySoapOfCrabs, crabs);
        // Метод положить рядом
        shelf.putItemOnShelf(Item.STRAWBERRY_SOAP);
        // Скуперфильд
        System.out.print(scooperfield);
        // Метод смотреть на предметы
        scooperfield.lookAtSoaps(Item.STRAWBERRY_SOAP, strawberrySoapOfCrabs);
        // Пробел
        сoncatenation.getSpace();
        //, after that
        сoncatenation.getAfter();
        // Пробел
        сoncatenation.getSpace();
        // Местоимение he
        scooperfield.getPronoun();
        // Пробел
        сoncatenation.getSpace();
        //Создаем части тела
        Scooperfield.Hands hands = new Scooperfield.Hands("hands");
        Scooperfield.Cheeks cheeks = new Scooperfield.Cheeks("cheeks");
        //Методы помыть руки
        scooperfield.washHands(hands);
        // Пробел
        сoncatenation.getSpace();
        // Соединяем строки
        сoncatenation.getAnd();
        // Пробел
        сoncatenation.getSpace();
        //Методы помыть щеки
        scooperfield.washCheeks(cheeks);
        // Вводная часть
        сoncatenation.getHowever();
        сoncatenation.getSpace();
        // Метод помыть другим мылом
        scooperfield.washingWithAnotherSoap(Item.STRAWBERRY_SOAP, strawberrySoapOfCrabs);


        // Анонимный класс ресторан
        Location restaurant = new Location("restaurant") {
        };
        System.out.println(crabs + " go to " + restaurant);
    }
}
