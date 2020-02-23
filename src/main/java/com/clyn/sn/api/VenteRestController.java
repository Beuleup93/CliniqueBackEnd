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

import com.clyn.sn.entities.LigneVente;
import com.clyn.sn.entities.Vente;
import com.clyn.sn.service.ILigneVenteService;
import com.clyn.sn.service.IVenteService;

@RestController
public class VenteRestController {

	@Autowired
	private IVenteService venteService;
	
	@Autowired
	private ILigneVenteService ligneVenteService;
	
	//CRUD VENTE
	
	@GetMapping("/ventes/list") 
	  public List<Vente> findAllVente(){ 
		  return venteService.findAllVente(); 
	  }
	  
	  @PostMapping("/ventes/save") 
	  public Vente saveVente(@RequestBody Vente vente) { 
		  return venteService.saveVente(vente); 
	  }
	  
	  @PutMapping("/ventes/update") 
	  public Vente editVente(@RequestBody Vente vente) { 
		  return venteService.updateVente(vente); 
	  } 
	  
	  @DeleteMapping("/ventes/delete") 
	  public void deleteVente(@RequestBody Vente vente) { 
		   venteService.deleteVente(vente); 
	  }
	  
	  @GetMapping("/vente/list/{id}") 
	  public Vente findOneVente(@PathVariable("id")String ref){ 
		  return venteService.findOneVente(ref); 
	  }
	
	//CRUD LIGNE VENTE
	  
	  @GetMapping("/ligneVentes/list") 
	  public List<LigneVente> findAllLigneVente(){ 
		  return ligneVenteService.findAllLigneVente(); 
	  }
	  
	  @PostMapping("/ligneVentes/save") 
	  public LigneVente saveLigneVente(@RequestBody LigneVente ligneVente) { 
		  return ligneVenteService.saveLigneVente(ligneVente); 
	  }
	  
	  @PutMapping("/ligneVentes/update") 
	  public LigneVente editLigneVente(@RequestBody LigneVente ligneVente) { 
		  return ligneVenteService.updateLigneVente(ligneVente); 
	  } 
	  
	  @DeleteMapping("/ligneVentes/delete") 
	  public void deleteLigneVente(@RequestBody LigneVente ligneVente) { 
		   ligneVenteService.deleteLigneVente(ligneVente); 
	  }
	  
	  @GetMapping("/ligneVente/list/{id}") 
	  public LigneVente findOneLigneVente(@PathVariable("id")Long id){ 
		  return ligneVenteService.findOneLigneVente(id); 
	  }
	
}
