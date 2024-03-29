package com.demo;
import java.util.*;

class Checker implements Comparator<Player> {

  @Override
  public int compare(Player a1, Player a2) {
    if (a1.score < a2.score) {
      return 1;
    } else if (a1.score > a2.score) {
      return -1;
    } else {
      return a1.name.compareTo(a2.name);
    }
  }
}

class Player {
  String name;
  int score;

  Player(String name, int score){
    this.name = name;
    this.score = score;
  }
}



public class PlayerSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();

	    Player[] player = new Player[n];
	    Checker checker = new Checker();

	    for(int i = 0; i < n; i++){
	      player[i] = new Player(scan.next(), scan.nextInt());
	    }
	    scan.close();

	    Arrays.sort(player, checker);
	    for(int i = 0; i < player.length; i++){
	      System.out.printf("%s %s\n", player[i].name, player[i].score);
	    }

	}

}
