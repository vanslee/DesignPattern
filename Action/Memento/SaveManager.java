package Action.Memento;

import java.util.ArrayList;
import java.util.List;

public class SaveManager {
    private List<GameSave> saves = new ArrayList<>();

    // 添加存档
    public void addSave(GameSave save) {
        saves.add(save);
    }

    // 获取存档
    public GameSave getSave(int index) {
        if (index >= 0 && index < saves.size()) {
            return saves.get(index);
        }
        return null;
    }

    // 显示所有存档
    public void displaySaves() {
        System.out.println("\n=== 存档列表 ===");
        for (int i = 0; i < saves.size(); i++) {
            GameSave save = saves.get(i);
            System.out.println("存档 #" + (i + 1) +
                    ": 等级=" + save.getLevel() +
                    ", 生命=" + save.getHealth() +
                    ", 位置=" + save.getLocation() +
                    ", 物品=" + save.getInventory());
        }
        System.out.println("===============");
    }
}
