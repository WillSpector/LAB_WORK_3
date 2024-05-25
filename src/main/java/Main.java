import Actors.*;
import Abstract.Concatenation;
import Hat.*;

import static Hat.Item.*;
import static Locations.Location.*;

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
        // Задаем локацию в которую будем перемщаться
        crabs.setLocation(HOTEL_ROOM);
        // Выводим на экран куда и с кем перемащается персонаж
        crabs.moveTo(scooperfield);
        // Задаем фразу которую говорит
        crabs.setPhrase("You need to wash your face!");
        // Выводим на экран что говорит Mr.Crabs
        crabs.speak(scooperfield);
        // Скоперфильд осматривает локацию (можно выбрать)
        scooperfield.look(HOTEL_ROOM);
        // Соеднияем строки
        and.and();
        // Задаем выражение лица
        scooperfield.setFacialExpressions("smile");
        // выводим текст сравнения выражение лица
        scooperfield.getFacialExpressions();
         /* Будет ли Mr.Scooperfield кого-то балгодаирть.Да параметр "willThank" лишний,
         но так интересней плюс можно расписать false:)*/
        scooperfield.thanks(true,crabs);
        // Соеднияем строки
        and.and();
        // Задаем локацию в которую будем перемщаться
        scooperfield.setLocation(BATHROOM);
        // Выводим на экран куда и с кем перемащается персонаж
        scooperfield.moveTo("");
        // создаем объект Шляпа
        Hat hat = new Hat("hat");
        // Надета ли шляпа ?
        scooperfield.setHatOnHead(true);
        // Скуперфильд снимает шляпу с головы
        scooperfield.takeOffHat(hat);
        /* Достаем вещи из шляпы (расписал для каждого предмета, если надо будет достать определенный.
        На экарн выводи массив всех предметов)*/
        hat.takeItemFromHat(false,null);
        //Выводим место подбора предметов
        hat.picUplocationItem(STREET);
        //Выводи на экран роль шляпы
        hat.getRoles();









    }
}


