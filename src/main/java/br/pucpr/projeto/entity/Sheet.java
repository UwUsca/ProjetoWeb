package br.pucpr.projeto.entity;

import javax.persistence.*;

@Entity
public class Sheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String creator;
    @Column(nullable = false)
    private String character;
    @Column
    private String sheetDescription;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCharacter() {
        return character;
    }
    public void setCharacter(String character) {
        this.character = character;
    }

    public String getSheetDescription() {
        return sheetDescription;
    }
    public void setSheetDescription(String sheetDescription) {
        this.sheetDescription = sheetDescription;
    }
}
