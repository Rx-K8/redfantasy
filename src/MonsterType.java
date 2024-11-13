public enum MonsterType {
  IGAKIN(1, "イガキン", 9),
  NAMACHU(2, "ナマチュウ", 3),
  INOUEN(3, "イノウエン", 1),
  RYOJI(4, "リョージィ", 2),
  AKIMOTON(5, "アキモトン", 5),
  GOJIMA(6, "ゴージマ", 4),
  CHUDEN(7, "チュウデン", 6),
  DUKAHON(8, "ヅカホン", 8),
  NISHIMURA(9, "ニシムラー", 7),
  SAKODEN(10, "サコーデン", 2),
  UCHI(11, "ウッチー", 5),
  HAYASHI(12, "ハヤッシー", 4),
  KICHI(13, "キーチー", 3),
  RYOKUN(14, "リョクン", 1),
  DEKOPON(15, "デコポン", 6),
  KAMISAN(16, "カミサン", 5),
  SHISUI(17, "シスイ", 1),
  JONA(18, "ジョナ", 7),
  GIDAGIDA(19, "ギダギダ", 2),
  MITSU(20, "ミッツー", 8),
  ZOESAN(21, "ゾエサン", 5),
  KITABA(22, "キタバー", 3);

  private final Integer id;
  private final String name;
  private final Integer point;

  MonsterType(Integer id, String name, Integer point) {
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
