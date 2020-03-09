
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
  import com.clyn.sn.entities.Personnel;
  import com.clyn.sn.service.IPersonnelService; 
  
  @RestController 
  public class PersonnelRestController {
  
  @Autowired 
  private IPersonnelService personnelService;
  
  @GetMapping("/personnels/list") 
  public List<Personnel> findAllPersonnel(){ 
	  return personnelService.findAllPersonnel(); 
  }
  
  @PostMapping("/personnels/save") 
  public Personnel savePersonnel(@RequestBody Personnel personnel) { 
	  return personnelService.savePersonnel(personnel); 
  }
  
  @PutMapping("/personnels/update") 
  public Personnel editPersonnel(@RequestBody Personnel personnel) { 
	  return personnelService.updatePersonnel(personnel); 
  } 
  
  @DeleteMapping("/personnels/delete") 
  public void deletePersonnel(@RequestBody Personnel personnel) { 
	   personnelService.deletePersonnel(personnel); 
  }
  
  @GetMapping("/personnels/list/{id}") 
  public Personnel findOnePersonnel(@PathVariable("id")Long id){ 
	  return personnelService.findOnePersonnel(id); 
  }
 }
 