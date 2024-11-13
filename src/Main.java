public class Main {
  static RedFantasy rf = new RedFantasy();

  public static void main(String[] args) {

    // setMonsters();

    while (true) {
      try {
        if (rf.getPlayerHp() > 0 && rf.getCpuHp() > 0) {
          Thread.sleep(3000);
          rf.startPhase();
        } else if (rf.getPlayerHp() <= 0) {
          System.out.println("Playerは死んでしまった");
          break;
        } else if (rf.getCpuHp() <= 0) {
          System.out.println("CPUは死んでしまった");
          break;
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Player History:");
    for (int i = 0; i < rf.getPlayerHistory().length && rf.getPlayerHistory()[i] != -9999; i++) {
      System.out.print(rf.getPlayerHistory()[i] + "\t");
    }
    System.out.println("\nCPU History:");
    for (int i = 0; i < rf.getCpuHistory().length && rf.getCpuHistory()[i] != -9999; i++) {
      System.out.print(rf.getCpuHistory()[i] + "\t");
    }
  }
}
