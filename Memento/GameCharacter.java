package Memento;

import java.util.ArrayList;
import java.util.List;

public class GameCharacter {
    private int level;
    private int health;
    private String location;
    private List<String> inventory;

    public GameCharacter(int level, int health, String location) {
        this.level = level;
        this.health = health;
        this.location = location;
        this.inventory = new ArrayList<>();
    }

    // 添加物品到背包
    public void addItem(String item) {
        inventory.add(item);
        System.out.println("获得物品: " + item);
    }

    // 升级角色
    public void levelUp() {
        level++;
        health += 10;
        System.out.println("升级! 当前等级: " + level + ", 生命值: " + health);
    }

    // 移动角色
    public void moveTo(String newLocation) {
        this.location = newLocation;
        System.out.println("移动到: " + newLocation);
    }

    // 创建存档(备忘录)
    public GameSave createSave() {
        System.out.println("创建存档...");
        return new GameSave(level, health, location, new ArrayList<>(inventory));
    }

    // 从存档恢复
    public void restoreFromSave(GameSave save) {
        this.level = save.getLevel();
        this.health = save.getHealth();
        this.location = save.getLocation();
        this.inventory = new ArrayList<>(save.getInventory());
        System.out.println("从存档恢复...");
    }

    // 显示角色状态
    public void displayStatus() {
        System.out.println("=== 当前存档角色状态 ===");
        System.out.println("等级: " + level);
        System.out.println("生命值: " + health);
        System.out.println("位置: " + location);
        System.out.println("背包: " + inventory);
        System.out.println("===============");
    }
}
