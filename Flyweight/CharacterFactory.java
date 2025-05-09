package Flyweight;

import java.util.HashMap;
import java.util.Map;

// 享元工厂
class CharacterFactory {
    private static final Map<ConcreteCharacter, ConcreteCharacter> characterPool = new HashMap<>();

    public static TextCharacter getCharacter(char character, String fontFamily, int fontSize, boolean isBold) {
        ConcreteCharacter key = new ConcreteCharacter(character, fontFamily, fontSize, isBold);

        // 如果池中没有该字符，则创建并存入池中
        characterPool.putIfAbsent(key, key);

        return characterPool.get(key);
    }

    public static int getPoolSize() {
        return characterPool.size();
    }
}
