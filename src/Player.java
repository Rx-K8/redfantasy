import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
  private String name;
  private Integer maxMonsterCapacity;
  private Integer minMonsterCapacity;
  private List<Monster> monsters;
  private Integer hp;
  private Integer point;
  private List<Integer> history;
  private Random random;
  private MonsterManager monsterManager;
  private Dice dice;

  public Player(String name) {
    this.name = name;
    this.maxMonsterCapacity = 5;
    this.minMonsterCapacity = 3;
    this.monsters = new ArrayList<>();
    this.hp = 50;
    this.point = 0;
    this.history = new ArrayList<>();
    this.random = new Random();
    this.monsterManager = MonsterManager.getInstance();
    this.dice = Dice.getInstance();

    addHistory(hp);
  }

  public void addHistory(Integer hp) {
    history.add(hp);
  }

  public void calculatePoint() {
    point = 0;
    for (Monster monster : monsters) {
      point += monster.getPoint();
    }
    Integer daiceFace = dice.roll();
    System.out.println("--------------------");
    System.out.println(name + " Dice：" + daiceFace);
    if (daiceFace == 1) {
      System.out.println("失敗！すべてのモンスターポイントが半分になる");
      point = point / 2;
    } else if (daiceFace == 6) {
      System.out.println("Critical！すべてのモンスターポイントが倍になる");
      point = point * 2;
    } else {
      point += daiceFace;
    }
    System.out.print(name + " Monster Pointの合計:");
    System.out.println(point);
  }

  private void clearMonsters() {
    monsters.clear();
  }

  public void drawMonster() {
    // 最低でも3枚, 最大で5枚はモンスターを引く
    Integer drawMonsterCount = getDrawMonsterCount();
    System.out.println(name + " Draw " + drawMonsterCount + " monsters");
    clearMonsters();
    for (int i = 0; i < drawMonsterCount; i++) {
      Integer randomMonsterId = random.nextInt(monsterManager.getTotalMonsters()) + 1;
      Monster monster = monsterManager.getMonsterById(randomMonsterId);
      monsters.add(monster);
    }
  }

  private Integer getDrawMonsterCount() {
    return random.nextInt(maxMonsterCapacity - minMonsterCapacity + 1) + minMonsterCapacity;
  }

  public Integer getHp() {
    return hp;
  }

  public String getName() {
    return name;
  }

  public Integer getPoint() {
    return point;
  }

  public List<Integer> getHistory() {
    return history;
  }

  public void printMonsters() {
    System.out.println("--------------------");
    System.out.print(name + " Monsters List:");
    for (Monster monster : monsters) {
      System.out.print(monster.getName() + " ");
    }
    System.out.println();
  }

  public void updateHp(Integer damage) {
    hp -= damage;
  }
}
