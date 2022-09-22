package br.pucpr.projeto.controller;

import br.pucpr.projeto.entity.Player;
import br.pucpr.projeto.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Endpoints para controller
@RequestMapping("/players") //Endpoint para rota
public class PlayerController {

    @Autowired //Instancia um repository em tempo de execução automaticamente;
    private PlayerRepository playerRepository;

    /* ---- MÉTODOS GET ---- */
    @GetMapping // Responde request /players
    public List<Player> getAllPlayers(){
        return playerRepository.findAll(); // Puxa tudo de Player;
    }

    @GetMapping("/{id}") //Retorna player especifico
    public Player getPlayerById(@PathVariable Integer id){
        return playerRepository.findById(id).get(); // Retorna o player correspondente
    }

    /* ---- MÉTODOS POST ---- */
    @PostMapping // Adiciona player no /players
    @ResponseStatus(HttpStatus.CREATED) // Retorna código 201 (especificação de código de status de código HTTP)
    public Player addNewPlayer(@RequestBody Player player){ //Converte o JSON para o objeto Player
        return playerRepository.save(player); // Salva no banco
    }

    /* ---- MÉTODOS DELETE ---- */
    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Integer id){
        playerRepository.deleteById(id);
    }
}
