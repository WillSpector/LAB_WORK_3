package Interfaces;


import Hat.*;

public interface InteractionWithHat {
   // снять шляпу с головы
   public void takeOffHat(Hat hat);
   // Достать предметы из шляпы
   public void takeItemFromHat(boolean isHatOnHead, Item item);
}
