package br.pucpr.projeto.repository;

import br.pucpr.projeto.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Responsável por interagir com o banco de dados
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
