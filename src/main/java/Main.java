// imports
import аctors.*;
import аbstract.Concatenation;
import hat.*;

import static locations.Location.*;

public class Main {
    public static void main(String[] args) {
        //Создаем объект класса Crabs
        Crabs crabs = new Crabs("Crabs");
        //Создаем объект класса Scooperfield
        Scooperfield scooperfield = new Scooperfield("Scooperfield");
        // Создаем класс and для соединения строк в тексте
        Concatenation and = new Concatenation();
        // Выводи на экран имя объекта crabs
        System.out.print(crabs);
        // Задаем локацию в которую будем перемещаться
        crabs.setLocation(HOTEL_ROOM);
        // Выводим на экран куда и с кем перемещается персонаж
        crabs.moveToLocationWith(scooperfield);
        // Задаем фразу которую говорит Крабс
        crabs.setPhrase("You need to wash your face!");
        // Выводим на экран что говорит Крабс
        crabs.speak(scooperfield);
        // Скоперфильд осматривает локацию (можно выбрать)
        scooperfield.look(HOTEL_ROOM);
        // Соединяем строки
        and.and();
        // Задаем выражение лица
        scooperfield.setFacialExpressions("grimace of disgust");
        // Выводим текст сравнения выражение лица
        scooperfield.getFacialExpressions();
         /* Будет ли Mr.Scooperfield кого-то благодарить. Да параметр "willThank" лишний,
         но так интересней плюс можно расписать false:)*/
        scooperfield.thanks(true,crabs);
        // Соединяем строки
        and.and();
        // Задаем локацию в которую будем перемещаться
        scooperfield.setLocation(BATHROOM);
        // Выводим на экран куда перемещается персонаж
        scooperfield.moveToLocationAlone();
        // Создаем объект Шляпа
        Hat hat = new Hat("hat");
        // Надета ли шляпа?
        scooperfield.setHatOnHead(true);
        // Скуперфильд снимает шляпу с головы
        scooperfield.takeOffHat(hat);
        /* Достаем вещи из шляпы (расписал для каждого предмета, если надо будет достать определенный.
        На экран выводи массив всех предметов)*/
        scooperfield.takeItemFromHat(Item.ALL_ITEM);
        //Выводим место где были взяты предметы
        hat.pickUplocationItem(STREET);
        //Выводим на экран роль шляпы
        hat.getRoles();
    }
}


