package reviewssitefullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {

	@Resource
	private PlayerNumRepository playerNumRepo;

	@Resource
	private GameRepository gameRepo;

//	@Resource
//	private DescriptionTagRepository descriptionTagRepo;

	@Override
	public void run(String... args) throws Exception {

		PlayerNum twoPlayer = new PlayerNum("Two-Player");
		playerNumRepo.save(twoPlayer);
		PlayerNum morePlayer = new PlayerNum("Two or More Players");
		playerNumRepo.save(morePlayer);
		
		Game roboRally = new Game("Robo-Rally", "60 minutes plus", "Put on your thinking cap!", "/images/Robo-Rally.jpg", "http://avalonhill.wizards.com/games/robo-rally","Adorable customizable pieces, board variations, turn phases, and teeth gnashing.  Highly recommend!", morePlayer);
		gameRepo.save(roboRally);
		Game galaxyTruckers = new Game("Galaxy Truckers", "60 minutes plus", "Brain Cramp!", "imgUrl", "img", "Confusing tiles, board variations, turn phases, and cursing as your spaceship gets beaten up by asteroids and boarded by aliens. Highly recommend!", morePlayer);
		gameRepo.save(galaxyTruckers);
		Game ninja = new Game("Ninja: Legend of the Scorpion Clan", "45 minutes plus ", "Some Concentration Suggested", "imgUrl", "img", "Great Art, good fantasy concept, strategy, deception, turn phases, and ninjas!  Great Fun!", twoPlayer);
		gameRepo.save(ninja);
		Game gnerglers = new Game("Gnerglers", "20 minutes", "Put on your thinking cap!", "/images/gnerglers.png", "http://www.coroflot.com/IrenaEckard/Gnerglers-Board-Game", "Amazing original customizable pieces, fantastic art, excellent game mechanic.  This fabulous new game by emerging designer, Irena Eckard, has the optimum mixture of strategy and luck.  The game pieces are original, sculptural works of art.  The game uses a colorful hex board and nine pieces to a side. All pieces start out as Grunts, evolving through mining Gnuggets to become first Hoppers, then Chargers and finally Warriors. Each new evolved state has enhanced movement ability that is visually reinforced by the clever design of the piece.  The game also makes use of special playing cards that buff up the creatures when they do battle.  Exhaustively play-tested with both children and adults, this charming game provides opportunties to get better, but enough randomness to give beginners a sliver of hope.  Gnerglers combines the best of all games!  It is quick, fun, appealing, strategic, never the same twice and gorgeous.  The only bad thing about Gnerglers is that there are only two copies in the world.  Evolving monsters, cards and dice.  Best game ever!", twoPlayer);
		gameRepo.save(gnerglers);
		Game santorini = new Game("Santorini", "20 minutes", "Put on your thinking cap!", "imgUrl", "img", "Clever, 3D, pure strategy game. Expansion card pack livens up the rules.  Great new game!", twoPlayer);
		gameRepo.save(santorini);
		Game coup = new Game("Coup", "15 minutes", "Some Concentration Suggested", "imgUrl", "img", "Deception, Secret Identities and Bluffing. An easy-on-the-wallet party game.  Have fun backstabbing your friends and relations!", morePlayer);
		gameRepo.save(coup);
		Game resistance = new Game("The Resistance", "20 minutes", "Some Concentration Suggested", "imgUrl", "img", "Deception, secret Identities and bluffing.  Like werewolf, but with spies.  Excellent party game!", morePlayer);
		gameRepo.save(resistance);
		Game settlers = new Game("Settlers of Catan", "60 minutes plus", "Put on your thinking cap", "/images/catan.jpg", "https://www.catan.com/game/catan", "Board variations, turn phases, trading and bluffing.  Like Monopoly on steroids.  A great family game!", morePlayer);
		gameRepo.save(settlers);
		
	

		
	} // close run method

} // close the populator class
