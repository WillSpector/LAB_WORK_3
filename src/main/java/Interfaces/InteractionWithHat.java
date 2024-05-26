package Interfaces;

// imports
import Hat.*;

public interface InteractionWithHat {
   // Снять шляпу с головы
   void takeOffHat(Hat hat);
   // Достать предметы из шляпы
   void takeItemFromHat(boolean isHatOnHead, Item item);
}
