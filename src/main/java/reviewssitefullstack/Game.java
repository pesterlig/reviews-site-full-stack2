package reviewssitefullstack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

// @ManyToOne and a @ManyToMany 

@Entity
public class Game {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String minutesToPlay;
	private String challengeLevel;
	private String imgUrl;
	private String imgSource;
	
	@Lob
	private String review;

	@ManyToOne
	private PlayerNum playerNum;

	// @ManyToMany
	// private Set<DescriptionTags> descriptionTags

	protected Game() {
		
	}

	public Game(String title, String minutesToPlay, String challengeLevel, String imgUrl, String imgSource, String review, PlayerNum playerNum) {
		this.title = title;
		this.minutesToPlay = minutesToPlay;
		this.challengeLevel = challengeLevel;
		this.imgUrl = imgUrl;
		this.imgSource = imgSource;
		this.review = review;
		this.playerNum = playerNum;
		
	}

	@Override
	public String toString() {
		return title;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getMinutesToPlay() {
		return minutesToPlay;
	}

	public String getChallengeLevel() {
		return challengeLevel;
	}
	 
	public String getImgSource() {
		return imgSource;
	}
	public String getImgUrl() {
		return imgUrl;
	}

	public String getReview() {
		return review;
	}

	public PlayerNum getPlayerNum() {
		return playerNum;
	}
	

}
