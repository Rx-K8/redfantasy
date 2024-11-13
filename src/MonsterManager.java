import java.util.HashMap;
import java.util.Map;

public class MonsterManager {
  private final Map<String, Monster> nameToMonster = new HashMap<>();
  private final Map<Integer, String> idToName = new HashMap<>();

  public MonsterManager() {
    for (MonsterType monster : MonsterType.values()) {
      addMonster(new Monster(monster.getId(), monster.getName(), monster.getPoint()));
    }
  }

  private void addMonster(Monster monster) {
    this.nameToMonster.put(monster.getName(), monster);
    this.idToName.put(monster.getId(), monster.getName());
  }

  public Monster getMonsterById(int id) {
    String name = idToName.get(id);
    return getMonsterByName(name);
  }

  public Monster getMonsterByName(String name) {
    return nameToMonster.get(name);
  }

  public Integer getTotalMonsters() {
    return nameToMonster.size();
  }
}
