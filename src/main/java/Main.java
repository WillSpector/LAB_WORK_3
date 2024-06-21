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
        Scooperfield scooperfield = new Scooperfield("Scooperfield","he");
        // Создаем класс and для соединения строк в тексте
        Concatenation сoncatenation = new Concatenation();
        // Выводи на экран имя объекта crabs
        System.out.print(crabs);
        // Пробел
        сoncatenation.space();
        // Создаем локации
        HotelRoom hotelRoom = new HotelRoom("hotel room");
        // Задаем локацию в которую будет пермещаться Scooperfield
        scooperfield.setLocation(hotelRoom);
        // Задаем локацию в которую будет пермещаться Crabs
        crabs.setLocation(hotelRoom);
        // Выводим на экран куда и с кем перемещается персонаж
        crabs.moveToLocationWith(scooperfield);
        // Задаем фразу которую говорит Крабс
        crabs.setPhrase("You need to wash your face!");
        // Выводим на экран что говорит Крабс
        crabs.speak(scooperfield);
        // Скоперфильд осматривает локацию (можно выбрать)
        scooperfield.look(hotelRoom);
        // Пробел
        сoncatenation.space();
        // Соединяем строки
        сoncatenation.and();
        // Пробел
        сoncatenation.space();
        // Задаем выражение лица
        scooperfield.setFacialExpressions(FacialExpressions.GRIMACE_OF_DISGUST);
        // Выводим текст сравнения выражение лица
        scooperfield.getFacialExpressions();
         /* Будет ли Mr.Scooperfield кого-то благодарить. Да параметр "willThank" лишний,
         но так интересней плюс можно расписать false:)*/
        scooperfield.thanks(crabs);
        // Соединяем строки
        сoncatenation.and();
        // Пробел
        сoncatenation.space();
        // Создаем и задаем локацию в которую будем перемещаться
        Bathroom bathroom = new Bathroom("bathroom");
        scooperfield.setLocation(bathroom);
        // Выводим на экран куда перемещается персонаж
        scooperfield.moveToLocationAlone();
        // Создаем объект Шляпа
        Hat hat = new Hat("hat");
        // Надета ли шляпа?
        scooperfield.setHatOnHead(true);
        // Скуперфильд снимает шляпу с головы
        scooperfield.takeOffHat(hat);
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
        Item[] arrayItem = {Item.TOOTHBRUSH, Item.HANDKERCHIEFS, Item.DENTIFRICE, Item.SPARE_SOCKS, Item.OLD_NAIL, Item.TOWEL, Item.PIECE_OF_COPPER_WIRE};
        // Создаем класс шкафчик
        Bathroom.Locker locker = new Bathroom.Locker("Locker");
        // Класдем массив из предметов в шкафчик
        locker.putThingsInsideLocker(arrayItem);
        //Достаем мыло из шляпы
        System.out.print(scooperfield + " take from " + hat);
        // Пробел
        сoncatenation.space();
        scooperfield.takeItemFromHat(Item.STRAWBERRY_SOAP);
        // Создаем объект полка
        Bathroom.Shelf shelf = new Bathroom.Shelf("shelf");
        // Создаем объект strawberry soap of Crabs
        Bathroom.Shelf.StrawberrySoapOfCrabs strawberrySoapOfCrabs = new Bathroom.Shelf.StrawberrySoapOfCrabs("soap ");
        // Вызываем метод где заметил, какой предмет и кому он принадлежал
        scooperfield.toNotice(shelf, strawberrySoapOfCrabs, crabs);
        // Метод положить рядом
        scooperfield.putItemNear(Item.STRAWBERRY_SOAP);
        // Скуперфильд
        System.out.print(scooperfield);
        // Метод смотреть на предметы
        scooperfield.lookAtSoaps(Item.STRAWBERRY_SOAP, strawberrySoapOfCrabs);
        // Пробел
        сoncatenation.space();
        //, after that
        сoncatenation.after();
        // Пробел
        сoncatenation.space();
        // Местоимение he
        scooperfield.getPronoun();
        // Пробел
        сoncatenation.space();



        //Создаем части тела
        Scooperfield.Hands hands = new Scooperfield.Hands("hands");
        Scooperfield.Cheeks cheeks = new Scooperfield.Cheeks("cheeks");
        //Методы помыть руки
        hands.toWashHands(hands);
        // Пробел
        сoncatenation.space();
        // Соединяем строки
        сoncatenation.and();
        // Пробел
        сoncatenation.space();
        //Методы помыть щеки
        cheeks.toWashCheeks(cheeks);
        // Вводная часть
        сoncatenation.however();
        сoncatenation.space();
        // Метод помыть другим мылом
        scooperfield.isWashingWithAnotherSoap(Item.STRAWBERRY_SOAP, strawberrySoapOfCrabs);









//        // Анонимный класс ресторан
//        Location restaurant = new Location("restaurant") {
//        };
//        System.out.println(crabs + " go to " + restaurant);
    }
}


