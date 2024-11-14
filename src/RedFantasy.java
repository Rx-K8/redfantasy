import java.util.List;
import java.util.Random;

/** RedFantasy */
public class RedFantasy {
  MonsterManager monsterManager = MonsterManager.getInstance();

  Player user;
  Player cpu;
  Random rnd = new Random();

  public RedFantasy() {
    this.user = new Player("user");
    this.cpu = new Player("cpu");
  }

  public void startPhase() {
    user.drawMonster();
    cpu.drawMonster();

    user.printMonsters();
    cpu.printMonsters();

    System.out.println("--------------------");
    System.out.println("Battle!");
    user.calculatePoint();
    cpu.calculatePoint();

    System.out.println("--------------------");

    if (user.getPoint() > cpu.getPoint()) {
      System.out.println("Player Win!");
      Integer damage = user.getPoint() - cpu.getPoint();
      cpu.updateHp(damage);
    } else if (cpu.getPoint() > user.getPoint()) {
      System.out.println("CPU Win!");
      Integer damage = cpu.getPoint() - user.getPoint();
      user.updateHp(damage);
    } else if (user.getPoint() == cpu.getPoint()) {
      System.out.println("Draw!");
    }

    user.addHistory(user.getHp());
    cpu.addHistory(cpu.getHp());

    System.out.println("Player HP is " + user.getHp());
    System.out.println("CPU HP is " + cpu.getHp());
  }

  public Integer getCpuHp() {
    return cpu.getHp();
  }

  public List<Integer> getCpuHistory() {
    return cpu.getHistory();
  }

  public Integer getUserHp() {
    return user.getHp();
  }

  public List<Integer> getUserHistory() {
    return user.getHistory();
  }
}
