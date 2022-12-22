package state;

public class Game {

  public static void main(String[] args) {
    // 지속된 조건이 반복될 때 상태의 값을 클래스로 뺀다.

    PlayerLevel player1 = new AdvancedLevel();
    player1.go();
    PlayerLevel player2 = new BeginnerLevel();
    player2.go();
    PlayerLevel player3 = new SuperLevel();
    player3.go();
  }

}
