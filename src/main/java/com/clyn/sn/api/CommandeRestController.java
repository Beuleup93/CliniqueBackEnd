package com.clyn.sn.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clyn.sn.entities.Commande;
import com.clyn.sn.entities.LigneCommande;
import com.clyn.sn.service.ICommandeService;
import com.clyn.sn.service.ILigneCommandeService;

@RestController
public class CommandeRestController {

	@Autowired
	private ICommandeService commandeService;
	
	@Autowired
	private ILigneCommandeService ligneCommandeService;
	
	//CRUD COMMANDE
	
	@GetMapping("/commandes/list") 
	  public List<Commande> findAllCommande(){ 
		  return commandeService.findAllCommande(); 
	  }
	  
	  @PostMapping("/commandes/save") 
	  public Commande saveCommande(@RequestBody Commande commande) { 
		  return commandeService.saveCommande(commande); 
	  }
	  
	  @PutMapping("/commandes/update") 
	  public Commande editCommande(@RequestBody Commande commande) { 
		  return commandeService.updateCommande(commande); 
	  } 
	  
	  @DeleteMapping("/commandes/delete") 
	  public void deleteCommande(@RequestBody Commande commande) { 
		   commandeService.deleteCommande(commande); 
	  }
	  
	  @GetMapping("/commande/list/{id}") 
	  public Commande findOneCommande(@PathVariable("id")String id){ 
		  return commandeService.findOneCommande(id); 
	  }
	
	//CRUD LIGNE COMMANDE
	  
	  @GetMapping("/ligneCommandes/list") 
	  public List<LigneCommande> findAllLigneCommande(){ 
		  return ligneCommandeService.findAllLigneCommande(); 
	  }
	  
	  @PostMapping("/ligneCommandes/save") 
	  public LigneCommande saveLigneCommande(@RequestBody LigneCommande ligneCommande) { 
		  return ligneCommandeService.saveLigneCommande(ligneCommande); 
	  }
	  
	  @PutMapping("/ligneCommandes/update") 
	  public LigneCommande editLigneCommande(@RequestBody LigneCommande ligneCommande) { 
		  return ligneCommandeService.updateLigneCommande(ligneCommande); 
	  } 
	  
	  @DeleteMapping("/ligneCommandes/delete") 
	  public void deleteLigneCommande(@RequestBody LigneCommande ligneCommande) { 
		   ligneCommandeService.deleteLigneCommande(ligneCommande); 
	  }
	  
	  @GetMapping("/ligneCommande/list/{id}") 
	  public LigneCommande findOneLigneCommande(@PathVariable("id")Long id){ 
		  return ligneCommandeService.findOneLigneCommande(id); 
	  }
	
}
