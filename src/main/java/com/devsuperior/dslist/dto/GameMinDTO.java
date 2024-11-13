package com.devsuperior.dslist.dto;
//para importar ctrl + shift + o
import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
	}

	//construtor recebe a entidade (objeto) "Game"
	public GameMinDTO(Game Entity) {
		id = Entity.getId();
		title = Entity.getTitle();
		year = Entity.getYear();
		imgUrl = Entity.getImgUrl();
		shortDescription = Entity.getShortDescription();
	}

	//para esta classe só será usado os métodos getters q apenas ira trazer os valores, não inputará nada
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	
	
	
	
	
	
}
