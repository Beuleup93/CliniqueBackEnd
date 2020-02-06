package com.clyn.sn;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.clyn.sn.entities.Address;
import com.clyn.sn.entities.Commande;
import com.clyn.sn.entities.CommandeFournisseur;
import com.clyn.sn.entities.Fournisseur;
import com.clyn.sn.entities.LigneCommande;
import com.clyn.sn.entities.LigneLivraison;
import com.clyn.sn.entities.LigneVente;
import com.clyn.sn.entities.Livraison;
import com.clyn.sn.entities.Produit;
import com.clyn.sn.entities.Rayon;
import com.clyn.sn.entities.Reserve;
import com.clyn.sn.entities.User;
import com.clyn.sn.entities.Vente;
import com.clyn.sn.init.IPharmacieInitService;

@SpringBootApplication
public class GCliniqueApplication implements CommandLineRunner{

	@Autowired
	private IPharmacieInitService iPharmacieInitService;
	
	public static void main(String[] args) {
		SpringApplication.run(GCliniqueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		iPharmacieInitService.initUser();
		iPharmacieInitService.initRayon();
		iPharmacieInitService.initProduit();
		iPharmacieInitService.initVente();
		iPharmacieInitService.initLigneVente();
		iPharmacieInitService.initAddress();
		iPharmacieInitService.initCommande();
		iPharmacieInitService.initLigneCommande();
		iPharmacieInitService.initLivraison();
		iPharmacieInitService.initLigneLivraison();
		iPharmacieInitService.initReserve();
		iPharmacieInitService.initFournisseur();
		iPharmacieInitService.initCommandeFournisseur();
	}

}

@Configuration
class CustomRestMvcConfiguration {

  @SuppressWarnings("deprecation")
@Bean
  public RepositoryRestConfigurer repositoryRestConfigurer() {

    return new RepositoryRestConfigurerAdapter() {

      @Override
      public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    	config.exposeIdsFor(User.class);
    	config.exposeIdsFor(Rayon.class);
    	config.exposeIdsFor(Produit.class);
    	config.exposeIdsFor(LigneVente.class);
        config.exposeIdsFor(Vente.class);
        config.exposeIdsFor(Commande.class);
        config.exposeIdsFor(LigneCommande.class);
        config.exposeIdsFor(Livraison.class);
        config.exposeIdsFor(LigneLivraison.class);
        config.exposeIdsFor(Fournisseur.class);
        config.exposeIdsFor(CommandeFournisseur.class);
        config.exposeIdsFor(Address.class);
        config.exposeIdsFor(Reserve.class);
      }
    };
  }
}