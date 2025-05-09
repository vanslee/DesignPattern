package Memento;

public class Application {
    public static void main(String[] args) {
        // 创建游戏角色
        GameCharacter hero = new GameCharacter(1, 100, "新手村");
        hero.displayStatus();

        // 创建存档管理器
        SaveManager saveManager = new SaveManager();

        // 游戏进行中...
        hero.addItem("木剑");
        hero.moveTo("森林");
        hero.levelUp();
        hero.displayStatus();

        // 创建第一个存档
        saveManager.addSave(hero.createSave());

        // 继续游戏
        hero.addItem("治疗药水");
        hero.moveTo("山洞");
        hero.levelUp();
        hero.addItem("铁盾");
        hero.displayStatus();

        // 创建第二个存档
        saveManager.addSave(hero.createSave());

        // 显示所有存档
        saveManager.displaySaves();

        // 恢复到第一个存档
        System.out.println("\n恢复到第一个存档...");
        hero.restoreFromSave(saveManager.getSave(0));
        hero.displayStatus();

        // 继续游戏
        hero.addItem("魔法书");
        hero.moveTo("城堡");
        hero.displayStatus();
    }
}
