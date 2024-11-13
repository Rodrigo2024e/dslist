package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

/*"desenvolvimento por camada". repository sempre será construída como INTERFACE. o repository manda informações 
(camada de acesso de dados) para a classe services. Repository tem todo acesso ao banco de dados e consegue fazer toda manipulação
incluir, deletar, pesquisar e alterar, mas pra isso precisa do componente JpaRepository*/

//Transação = repository + services
//API = controller
                                        //<nome da entidade(Game) e o tipo(Long) do id>
public interface GameRepository extends JpaRepository<Game, Long> {

}
