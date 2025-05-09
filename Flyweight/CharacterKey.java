package Flyweight;

public class CharacterKey {
    private final char symbol;
    private final String fontFamily;
    private final int fontSize;
    private final boolean isBold;

    public CharacterKey(char symbol, String fontFamily, int fontSize, Boolean isBold) {
        this.symbol = symbol;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CharacterKey that = (CharacterKey) o;
        return symbol == that.symbol &
                fontSize == that.fontSize &
                isBold == that.isBold &
                fontFamily.equals(that.fontFamily);
    }

    @Override
    public int hashCode() {
        return 31 * (31 * (31 * symbol + fontFamily.hashCode()) + fontSize) + (isBold ? 1 : 0);
    }
}
