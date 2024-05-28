package аctors;

// imports
import interfaces.InteractionWithHat;
import interfaces.Thankable;
import locations.Location;
import hat.*;
import java.util.Objects;

public class Scooperfield extends Mister implements Thankable, InteractionWithHat {
    // Переменная для выражения лица
    String facialExpressions;
    // Переменная спасибо
    boolean thanks;
    // Переменная к кому направлено "спасибо" от Скоперфильда
    Object addressObject;
    //  Переменная наличия шляпы на голове
    boolean isHatOnHead;
    // Имя персонажа (Крабс)
    public Scooperfield(String name) {super(name);}
    // Метод осмотр локации (улица, комната или ванная комната)
    public void look(Location location){
        System.out.print("Looking around "+ location);
    }
    // Метод позволяет настроить гримасу на лице Скуперфильда (только smile или grimace of disgust)
    public void setFacialExpressions(String facialExpressions){
        if(facialExpressions == "grimace of disgust"| facialExpressions == "smile" ){
            this.facialExpressions = facialExpressions;
        }
        else {
            System.out.println("Enter 'smile' or 'grimace of disgust'");
        }
    }
    // Метод выводит на экран манипуляции с лицом
    public void getFacialExpressions(){
        if(this.facialExpressions == "smile") {
            System.out.print(" putting a " + this.facialExpressions + " on his face, which can be mistaken for a grimace of disgust, ");}
        else if (this.facialExpressions == "grimace of disgust"){
            System.out.print(" putting a " + this.facialExpressions + " on his face, which can be mistaken for a smile, ");
        }
    }
    // Метод задает (надета ли шляпа на голове)
    public void setHatOnHead (boolean isHatOnHead) {
        this.isHatOnHead = isHatOnHead;
    }
    // Метод для снятия шляпы с головы
    public void takeOffHat(Hat hat) {
        if (isHatOnHead) {
            System.out.println("He took off his "+ hat+ " from head and pulled out of it: ");
        }
}

@Override
    // Переопределяем метод интерфейса. Достать предметы из шляпы
    public void takeItemFromHat(boolean isHatOnHead, Item item) {}
    // Переопределяем метод интерфейса. Метод, говорит ли Скопрефильд спасибо и кому
    public void thanks (boolean willThank, Object addressObject) {
        Scooperfield scooperfield = new Scooperfield("Scooperfield");
        this.thanks = willThank;
        if (this.thanks) {
            this.addressObject = addressObject;
            System.out.println(scooperfield +" thanked " + addressObject);
        }
    }
    // Переопределение метода equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Scooperfield that = (Scooperfield) o;
        return thanks == that.thanks && isHatOnHead == that.isHatOnHead && Objects.equals(facialExpressions, that.facialExpressions) && Objects.equals(addressObject, that.addressObject);
    }
    // Переопределение метода hashCode
    public int hashCode() {
        return Objects.hash(super.hashCode(), facialExpressions, thanks, addressObject, isHatOnHead);
    }
}


