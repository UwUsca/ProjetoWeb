package br.pucpr.projeto.entity;

import javax.persistence.*;

@Entity
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String campaignName;

    @Column
    private Integer totalPlayers;

    @Column
    private String description;

    @Column(nullable = false)
    private String gameSystem;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public Integer getTotalPlayers() {
        return totalPlayers;
    }
    public void setTotalPlayers(Integer totalPlayers) {
        this.totalPlayers = totalPlayers;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getGameSystem() {
        return gameSystem;
    }
    public void setGameSystem(String gameSystem) {
        this.gameSystem = gameSystem;
    }
}
