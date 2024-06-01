package hat;

// imports
import locations.Location;
import java.util.Arrays;
import java.util.Objects;

public class Hat {
    //Переменная имя
    private final String name;
    // Массив роли шляпы
    private final String[] roles = {"a headgear","a travel bag","warehouse for scrap materials"};
    // Имя объекта
    public Hat(String name) {
      this.name = name;
    }
    // Метод, который выводит место подбора предметов
    public void pickUplocationItem(Location location) {
      if (location ==Location.STREET) {
          System.out.println("which he got on " + location+ ".");}
      else {
          System.out.println("which he got in " + location+ ".");
      }
    }
    // Метод роли шляпы
    public void getRoles() {
      System.out.println("Obviously, Mr.Scooperfield's hat served not only as "+roles[0]+", but also as "
              +roles[1]+ " and also as "+roles[2]+".");
    }

    @Override
    //  Переопределим метод toString
    public String toString() {return name;}
    // Переопределение метода equals
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Hat hat = (Hat) o;
      return Objects.equals(name, hat.name) && Objects.deepEquals(roles, hat.roles);
    }
    // Переопределение метода hashCode
    public int hashCode() {
      return Objects.hash(name, Arrays.hashCode(roles));
    }
}