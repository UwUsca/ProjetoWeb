package br.pucpr.projeto.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity //Definindo como Entidade (para tabela no banco)
@Table(name = "players")
public class Player {

    @Id //Identificador da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Banco incrementa o ID sozinho
    private Integer id; //Id unico

    @Column(nullable = false)
    private String playerName; // Nome player

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id.equals(player.id) && login.equals(player.login) && password.equals(player.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password);
    }



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
