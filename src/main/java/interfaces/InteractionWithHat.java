package interfaces;

// imports

import actors.Scooperfield;
import hat.*;

public interface InteractionWithHat {
    // Снять шляпу с головы
    void takeOffHat(Hat hat);

    // Достать предметы из шляпы
    void takeItemsFromHat();

    void takeItemFromHat(Item item, Hat hat);
}
