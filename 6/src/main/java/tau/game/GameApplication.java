package tau.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tau.game.model.GamePlaying;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(GameApplication.class, args);
		GamePlaying game = new GamePlaying();
		System.out.println("Gra na planszy, twoja kolej, oto zasady:");
		System.out.println("Twoj pozycja oznaczona jest jako 'I'");
		System.out.println("Aby wygrać dojdź do METY oznaczonej jako 'F'");
		System.out.println(" Do przemieszczania użyj klawiszy: ");
		System.out.println(" W - ruch w góre.");
		System.out.println(" S - ruch w dół");
		System.out.println(" A - ruch w lewo");
		System.out.println(" D - ruch w prawo");
		System.out.println(" X - to przeszkody");
		System.out.println(" Q - koniec gry");
		System.out.println();
		game.gameFlow(8);
	}

}
