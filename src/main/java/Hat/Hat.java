package Hat;

import Interfaces.InteractionWithHat;
import Locations.Location;

import java.util.Arrays;

import static Hat.Item.*;

public class Hat implements InteractionWithHat {
    //Переменная имя
    String name;
    // Массив для хранения предметов
    Item[] arrayThings = Item.values();
    // Перемнная роли шляпы
    String[] roles = {"a headgear","a travel bag","warehouse for scrap materials"};
    // Имя объекта
  public Hat (String name){
      this.name = name;
  }



    @Override
    public String toString(){
        return name;
    }
    // Метод для снятия шляпы с головы
    public void takeOffHat(Hat hat) {}

    // Метод, который выводит место подбора предметов
    public void picUplocationItem(Location location) {
      if (location ==Location.STREET){
        System.out.println("which he got on " + location+ ".");}
      else {System.out.println("which he got in " + location+ ".");}
    }
    // Метод роли шляпы


    public void getRoles() {
      System.out.println("Obviously, Mr.Scooperfield's hat served not only as "+roles[0]+", but also as "
              +roles[1]+ " and also as "+roles[2]+".");;
    }

    @Override
    public void takeItemFromHat(boolean isHatOnHead, Item item) {
      if (!isHatOnHead) {
          if (item == TOOTHBRUSH){System.out.println(arrayThings[0]+", ");}
          else if (item ==HANDKERCHIEFS) {System.out.println(arrayThings[1]+", ");}
          else if (item ==DENTIFRICE) {System.out.println(arrayThings[2]+", ");}
          else if (item ==SPARE_SOCKS) {System.out.println(arrayThings[3]+", ");}
          else if (item ==OLD_NAIL) {System.out.println(arrayThings[4]+", ");}
          else if (item ==TOWEL) {System.out.println(arrayThings[5]+", ");}
          else if (item ==PIECE_OF_COPPER_WIRE) {System.out.println(arrayThings[6]+", ");}
          else
              System.out.print(Arrays.toString(arrayThings).replace("[","")
                                                                .replace("]", " "));
      }
      else {
          System.out.println("You can't do that. Hat on head. Take off it. ");
      }

    }
}
