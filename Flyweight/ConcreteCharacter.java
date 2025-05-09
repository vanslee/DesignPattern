package Flyweight;

// 具体享元类 - 字符对象
class ConcreteCharacter implements TextCharacter {
    private final char symbol; // 内部状态(可共享)
    private final String fontFamily;
    private final int fontSize;
    private final boolean isBold;

    public ConcreteCharacter(char symbol, String fontFamily, int fontSize, boolean isBold) {
        this.symbol = symbol;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }

    @Override
    public void display(int positionX, int positionY) {
        // 外部状态(不可共享)作为参数传入
        System.out.printf("显示字符 '%c' (字体: %s, 大小: %d, %s) 在位置 (%d, %d)%n",
                symbol, fontFamily, fontSize, isBold ? "加粗" : "正常", positionX, positionY);
    }
}
