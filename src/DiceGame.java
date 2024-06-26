public class DiceGame {
	public static void main (String[] args) {
		//lancer du joueur 1
		System.out.println("-----------------------");
		System.out.println("joueur A: ");
		int dice1 = (int) (Math.random() * 5.4) + 1;
		int dice2 = (int) (Math.random() * 5.4) + 1;
		int result1 = dice1 + dice2;
		System.out.println(dice1 + " et " + dice2);
		if (dice1 == dice2){
			System.out.println("> vous avez fait un double! votre score est doublé!");
			result1 = 2*result1;
		}
		System.out.println("total joueur A: " + result1);
		System.out.println("");

		//lancer du joueur 2
		System.out.println("joueur B: ");
		int dice3 = (int) (Math.random() * 5.4) + 1;
		int dice4 = (int) (Math.random() * 5.4) + 1;
		int result2 = dice3 + dice4;
		System.out.println(dice3 + " et " + dice4);
		if (dice3 == dice4){
			System.out.println("vous avez fait un double! votre score est doublé!");
			result2 = 2*result2;
		}
		System.out.println("total joueur B: " + result2);
		System.out.println("");

		//match
		if (result1 > result2){
			if (result1 >= 2*result2){
				System.out.println("victoire écrasante du joueur A!");
			} else {
			System.out.println("victoire joueur A!");}
		} else if (result2 > result1){
			if (result2 >= 2*result1){
				System.out.println("victoire écrasante du joueur B!");
			} else {
			System.out.println("victoire joueur B");}
		} else {
			System.out.println("ex aequo");
		}
		System.out.println("-----------------------");
		System.out.println("^C");
	}
}
// (C) Sébastien Gantois, 2024