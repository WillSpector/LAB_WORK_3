package Hat;

public enum Item {
    TOOTHBRUSH ("toothbrush"),
    HANDKERCHIEFS ("handkerchiefs"),
    DENTIFRICE ("dentifrice"),
    SPARE_SOCKS ("spare socks"),
    OLD_NAIL ("two old nails"),
    TOWEL ("towel"),
    PIECE_OF_COPPER_WIRE ("piece of copper wire");

  private final String item;

  Item (String item) {this.item = item;}

  public String getItem() {return item;}

    @Override
    public String toString() {return  item;}

}
