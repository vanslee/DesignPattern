package Memento;

import java.util.ArrayList;
import java.util.List;

public class GameSave {
    private final int level;
    private final int health;
    private final String location;
    private final List<String> inventory;

    public GameSave(int level, int health, String location, List<String> inventory) {
        this.level = level;
        this.health = health;
        this.location = location;
        this.inventory = new ArrayList<>(inventory); // 防御性拷贝
    }

    // 获取存档信息
    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public String getLocation() {
        return location;
    }

    public List<String> getInventory() {
        return new ArrayList<>(inventory); // 防御性拷贝
    }
}
