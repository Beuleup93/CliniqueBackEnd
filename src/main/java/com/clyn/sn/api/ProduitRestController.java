package com.clyn.sn.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clyn.sn.entities.Rayon;
import com.clyn.sn.entities.Produit;
import com.clyn.sn.service.IProduitService;
import com.clyn.sn.service.IRayonService;

@RestController
@CrossOrigin("*")
public class ProduitRestController {
	
	@Autowired
	private IProduitService produitService;
	
	@Autowired
	private IRayonService rayonService;
	
	//CRUD PRODUIT
	
	@GetMapping("/produits/list") 
	  public List<Produit> findAllProduit(){ 
		  return produitService.findAllProduit(); 
	  }
	  
	  @PostMapping("/produits/save") 
	  public Produit saveProduit(@RequestBody Produit produit) { 
		  return produitService.saveProduit(produit); 
	  }
	  
	  @PutMapping("/produits/update") 
	  public Produit editProduit(@RequestBody Produit produit) { 
		  return produitService.updateProduit(produit); 
	  } 
	  
	  @DeleteMapping("/produits/delete") 
	  public void deleteProduit(@RequestBody Produit produit) { 
		   produitService.deleteProduit(produit); 
	  }
	  
	  @GetMapping("/produit/list/{id}") 
	  public Produit findOneProduit(@PathVariable("id")Long id){ 
		  return produitService.findOneProduit(id); 
	  }
	
	//CRUD RAYON
	  
	  @GetMapping("/rayons/list") 
	  public List<Rayon> findAllRayon(){ 
		  return rayonService.findAllRayon(); 
	  }
	  
	  @PostMapping("/rayons/save") 
	  public Rayon saveRayon(@RequestBody Rayon rayon) { 
		  return rayonService.saveRayon(rayon); 
	  }
	  
	  @PutMapping("/rayons/update") 
	  public Rayon editRayon(@RequestBody Rayon rayon) { 
		  return rayonService.updateRayon(rayon); 
	  } 
	  
	  @DeleteMapping("/rayons/delete") 
	  public void deleteRayon(@RequestBody Rayon rayon) { 
		   rayonService.deleteRayon(rayon); 
	  }
	  
	  @GetMapping("/rayons/list/{id}") 
	  public Rayon findOneRayon(@PathVariable("id")Long id){ 
		  return rayonService.findOneRayon(id); 
	  }
}
