public class Main {
  static RedFantasy rf = new RedFantasy();

  public static void main(String[] args) {

    // setMonsters();

    while (true) {
      try {
        if (rf.getUserHp() > 0 && rf.getCpuHp() > 0) {
          Thread.sleep(3000);
          rf.startPhase();
        } else if (rf.getUserHp() <= 0) {
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
    for (Integer history : rf.getUserHistory()) {
      System.out.print(history + "\t");
    }
    System.out.println("\nCPU History:");
    for (Integer history : rf.getCpuHistory()) {
      System.out.print(history + "\t");
    }
  }
}
