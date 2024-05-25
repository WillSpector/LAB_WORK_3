package Actors;

import Interfaces.InteractionWithHat;
import Interfaces.Thankable;
import Locations.Location;
import Hat.*;

public class Scooperfield extends Mister implements Thankable, InteractionWithHat {
    // Выражение лица
    String facialExpressions;

    // Переменая спасибо
    boolean thanks;

    // Переменная к кому напарвлено спасибо Скоперфильда
    Object addressObject;

    // Шляпа на голове или нет
    boolean isHatOnHead;

    // Имя персонажа (Крабс)
    public Scooperfield(String name) {super(name);}

    // Создааем объект класс Scooperfield


    // Говорит ли Скопрефильд спасибо и кому
    public void thanks (boolean willThank, Object addressObject) {
        Scooperfield scooperfield = new Scooperfield("Scooperfield");
        this.thanks = willThank;

        if (this.thanks == true) {
            this.addressObject = addressObject;
            System.out.println(scooperfield +" thanked " + addressObject);
        }
        else if (this.thanks== false){}
    }
    // Осмотр локации (улица, комната или ванная команта)
    public void look(Location location){
        System.out.print("Looking around "+ location);
    }

    // Позволяет настроить гримассу на лице Скуперфильда (только smile или grimace of disgust)
    public void setFacialExpressions(String facialExpressions){

        if(facialExpressions == "grimace of disgust"| facialExpressions == "smile" ){
            this.facialExpressions = facialExpressions;
        }
        else {
            System.out.println("Enter 'smile' or 'grimace of disgust'");
        }
    }
    // Вывести на экран манипуляции с лицом
    public void getFacialExpressions(){
        if(this.facialExpressions == "smile") {
            System.out.print(" putting a " + this.facialExpressions + " on his face, which can be mistaken for a grimace of disgust, ");}
        else if (this.facialExpressions == "grimace of disgust"){
            System.out.print(" putting a " + this.facialExpressions + " on his face, which can be mistaken for a smile, ");
        }
    }
    // Проверяем надета ли шляпа на голове
    public void setHatOnHead (boolean isHatOnHead) {
        this.isHatOnHead = isHatOnHead;
    }

    // Метод для снятия шляпы с головы
    public void takeOffHat(Hat hat) {
        if (isHatOnHead) {
            System.out.println("He took off his "+ hat+ " from head and pulled out of it: ");
        }
}
    // Достать предметы из шляпы
@Override
    public void takeItemFromHat(boolean isHatOnHead, Item item) {

    }


}


