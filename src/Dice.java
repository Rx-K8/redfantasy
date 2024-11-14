import java.util.Random;

/** Daice */
public class Dice {
  private Random random;
  private static Dice instance;

  private Dice() {
    random = new Random();
  }

  public Integer roll() {
    return random.nextInt(6) + 1;
  }

  public static Dice getInstance() {
    if (instance == null) {
      instance = new Dice();
    }
    return instance;
  }
}
