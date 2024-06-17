// imports

import exception.NotSetFacialExpressionsException;
import hat.Hat;
import hat.Item;
import locations.Location;
import аctors.*;
import аbstract.Concatenation;
import static locations.Location.*;

public class Main {
    public static void main(String[] args) throws NotSetFacialExpressionsException {
        //Создаем объект класса Crabs
        Crabs crabs = new Crabs("Crabs");
        //Создаем объект класса Scooperfield
        Scooperfield scooperfield = new Scooperfield("Scooperfield");
        // Создаем класс and для соединения строк в тексте
        Concatenation and = new Concatenation();
        // Выводи на экран имя объекта crabs
        System.out.print(crabs);
        // Создаем локации
        Location.HotelRoom hotelRoom = new HotelRoom();
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
        // Соединяем строки
        and.and();
        // Задаем выражение лица
        scooperfield.setFacialExpressions("grimace of disgust");
        // Выводим текст сравнения выражение лица
        scooperfield.getFacialExpressions();
         /* Будет ли Mr.Scooperfield кого-то благодарить. Да параметр "willThank" лишний,
         но так интересней плюс можно расписать false:)*/
        scooperfield.thanks(true, crabs);
        // Соединяем строки
        and.and();
        // Создаем и задаем локацию в которую будем перемещаться
        Location.Bathroom bathroom = new Bathroom();
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
        Location.Street street = new Street();
        hat.pickUpLocationItem(street);
        //Выводим на экран роль шляпы
        hat.getRoles();
        // Создаем массив из вещей
        Item[] arrayItem = {Item.TOOTHBRUSH, Item.HANDKERCHIEFS, Item.DENTIFRICE, Item.SPARE_SOCKS, Item.OLD_NAIL, Item.TOWEL, Item.PIECE_OF_COPPER_WIRE};
        // Создаем класс шкафчик
        Location.Bathroom.Locker locker = new Bathroom.Locker();
        // Класдем массив из предметов в шкафчик
        locker.putThingsInsideLocker(arrayItem);
        //Достаем мыло из шляпы
        System.out.print(scooperfield + " take from " + hat);
        scooperfield.takeItemFromHat(Item.STRAWBERRY_SOAP);
        // Создаем объект полка
        Location.Bathroom.Shelf shelf = new Bathroom.Shelf();
        // Создаем объект strawberry soap of Crabs
        Bathroom.Shelf.StrawberrySoapOfCrabs strawberrySoapOfCrabs = new Bathroom.Shelf.StrawberrySoapOfCrabs();
        // Вызываем метод где заметил, какой предмет и кому он принадлежал
        scooperfield.toNotice(shelf, strawberrySoapOfCrabs, crabs);
        // Метод положить рядом
        scooperfield.putItemNear(Item.STRAWBERRY_SOAP);
        // Метод смотреть на предметы
        System.out.print(scooperfield);
        scooperfield.lookAtItems(Item.STRAWBERRY_SOAP, strawberrySoapOfCrabs);
        //Создаем части тела
        Scooperfield.BodyPart bodyPart = scooperfield.new BodyPart();
        //Методы помыть руки и щеки
        System.out.print(" after that he started ");
        bodyPart.washHands();
        and.and();
        bodyPart.washCheeks();
        System.out.println(", however, not with " + Item.STRAWBERRY_SOAP + " but with " + strawberrySoapOfCrabs + " that lay nearby.");

        // Анонимный класс

    }
}


