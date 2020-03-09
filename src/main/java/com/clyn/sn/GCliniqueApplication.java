package com.clyn.sn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

/*
 * @Configuration class CustomRestMvcConfiguration {
 * 
 * @SuppressWarnings("deprecation")
 * 
 * @Bean public RepositoryRestConfigurer repositoryRestConfigurer() {
 * 
 * return new RepositoryRestConfigurerAdapter() {
 * 
 * @Override public void
 * configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
 * config.exposeIdsFor(Personnel.class); config.exposeIdsFor(Rayon.class);
 * config.exposeIdsFor(Produit.class); config.exposeIdsFor(LigneVente.class);
 * config.exposeIdsFor(Vente.class); config.exposeIdsFor(Commande.class);
 * config.exposeIdsFor(LigneCommande.class);
 * config.exposeIdsFor(Livraison.class);
 * config.exposeIdsFor(LigneLivraison.class);
 * config.exposeIdsFor(Fournisseur.class);
 * config.exposeIdsFor(CommandeFournisseur.class);
 * config.exposeIdsFor(Address.class); config.exposeIdsFor(Reserve.class); } };
 * } }
 */