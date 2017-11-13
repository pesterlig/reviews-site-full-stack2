package reviewssitefullstack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	PlayerNumRepository playerNumRepo;

	@Resource
	GameRepository gameRepo;

	// @Resource
	// DescriptionTagRepository DescriptionTagRepo;

	@RequestMapping("/")
	public String redirectToPlayerNum(Model model) {
		return "redirect:/playerNums";
	}

	@RequestMapping("/playerNums")
	public String showAllPlayerNums(Model model) {
		model.addAttribute("playerNums", playerNumRepo.findAll());
		return "playerNums";
		
	}
	
	@RequestMapping("/playerNum")
	public String showOnePlayerNum(@RequestParam("id")Long id, Model model) {
		model.addAttribute("playerNum", playerNumRepo.findOne(id));
//		model.addAttribute(attributeValue);
		return "playerNum";
	}
	
	@RequestMapping("/game")
	public String showOneGame(@RequestParam("id")Long id, Model model) {
		Game gameToBeShown = gameRepo.findOne(id);
		
		System.out.println(gameToBeShown.getPlayerNum());
		System.out.println(gameToBeShown.getPlayerNum().getId());
		
		model.addAttribute("game", gameToBeShown);
		
		
		
		return "game";
	}
	

	@RequestMapping("/games")
	public String showAllGames(Model model) {
		model.addAttribute("games", gameRepo.findAll());
		return "games";
	}

//	@RequestMapping("/descriptionTag")
//	public String showOneDescriptionTag(@RequestParam("id")Long id, Model model) {
//		model.addAttribute(descriptionTag, descriptionTagRepo.findOne(id));
//	}
//	

//	@RequestMapping("/descriptionTags")
//	public String showAllDescriptionTags(Model model) {
//		model.addAttribute("descriptionTags", descriptionTagRepo.findAll());
//		return "descriptionTags";
//	}

} // closes the controller class