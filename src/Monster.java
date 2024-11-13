public class Monster {
  private Integer id;
  private String name;
  private Integer point;

  public Monster(Integer id, String name, Integer point) {
    this.id = id;
    this.name = name;
    this.point = point;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getPoint() {
    return point;
  }
}
