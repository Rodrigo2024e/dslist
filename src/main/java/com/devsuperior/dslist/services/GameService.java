package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

//Service componente responsável por implementar lógica de negócio
//Como Service é uma classe comum é necessário registra-la como componente do sistema
//O componente pode ser registrado como @Component ou como o apelido da classe @Service
//Service faz comunicação com repository e a controller (API)

@Service
public class GameService {
	
	//injetar(ligar) o gamerepository na classe service
	@Autowired GameRepository gameRepository;
	
	//findAll encontrada todos os games no banco de dados
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		//transforma a lista game completa em uma lista resumida (GameMinDTO)
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		}
		
	

}