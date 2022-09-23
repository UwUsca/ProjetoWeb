package br.pucpr.projeto.controller;

import br.pucpr.projeto.entity.Campaign;
import br.pucpr.projeto.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {

    @Autowired
    private CampaignRepository campaignRepository;

    /* ---- MÉTODOS GET ---- */
    @GetMapping // Retorna todas as campanhas
    public List<Campaign> getAllCampaign(){
        return campaignRepository.findAll();
    }

    @GetMapping("/{id}") // Retorna campanha especifica
    public Campaign getCampaignById(@PathVariable Integer id){
        return campaignRepository.findById(id).get();
    }

    /* ---- MÉTODOS POST ---- */
    @PostMapping // Adiciona nova campanha
    @ResponseStatus(HttpStatus.CREATED)
    public Campaign newCampaign(@RequestBody Campaign campaign){
        return campaignRepository.save(campaign);
    }

    /* ---- MÉTODOS DELETE ---- */
    @DeleteMapping("/{id}")
    public void deleteCampaign(@PathVariable Integer id){
        campaignRepository.deleteById(id);
    }
}
