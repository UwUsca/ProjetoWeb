package br.pucpr.projeto.entity;

import javax.persistence.*;

@Entity
@Table(name = "sheets")
public class Sheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String creatorId;
    @Column(nullable = false)
    private String characterName;
    @Column
    private String sheetDescription;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreator() {
        return creatorId;
    }
    public void setCreator(String creator) {
        this.creatorId = creator;
    }

    public String getCharacter() {
        return characterName;
    }
    public void setCharacter(String character) {
        this.characterName = character;
    }

    public String getSheetDescription() {
        return sheetDescription;
    }
    public void setSheetDescription(String sheetDescription) {
        this.sheetDescription = sheetDescription;
    }
}
