package com.clyn.sn.init;

import java.util.Date;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clyn.sn.dao.AddressRepository;
import com.clyn.sn.dao.CommandeFournisseurRepository;
import com.clyn.sn.dao.CommandeRepository;
import com.clyn.sn.dao.FournisseurRepository;
import com.clyn.sn.dao.LigneCommandeRepository;
import com.clyn.sn.dao.LigneLivraisonRepository;
import com.clyn.sn.dao.LigneVenteRepository;
import com.clyn.sn.dao.LivraisonRepository;
import com.clyn.sn.dao.ProduitRepository;
import com.clyn.sn.dao.RayonRepository;
import com.clyn.sn.dao.ReserveRepository;
import com.clyn.sn.dao.PersonnelRepository;
import com.clyn.sn.dao.VenteRepository;
import com.clyn.sn.entities.Address;
import com.clyn.sn.entities.Commande;
import com.clyn.sn.entities.LigneVente;
import com.clyn.sn.entities.Produit;
import com.clyn.sn.entities.Rayon;
import com.clyn.sn.entities.Personnel;
import com.clyn.sn.entities.Vente;

@Service
@Transactional
public class IPharmacieInitServiceImpl implements IPharmacieInitService{

	@Autowired
	private PersonnelRepository personnelRepository;
	
	@Autowired
	private RayonRepository rayonRepository;
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Autowired
	private VenteRepository venteRepository;
	
	@Autowired
	private LigneVenteRepository ligneVenteRepository;
	
	@Autowired
	private CommandeRepository commandeRepository;
	
	@Autowired
	private LigneCommandeRepository ligneCommandeRepository;
	
	@Autowired
	private LivraisonRepository livraisonRepository;
	
	@Autowired
	private LigneLivraisonRepository ligneLivraisonRepository;
	
	@Autowired
	private FournisseurRepository fournisseurRepository;
	
	@Autowired
	private CommandeFournisseurRepository commandeFournisseurRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ReserveRepository reserveRepository;
	
	@Override
	public void initUser() {
		Stream.of("Saliou","Imame").forEach(prenom->{
			Personnel u = new Personnel();
			u.setPrenom(prenom);
			u.setEmail("email@gmail.com");
			u.setUsername("username");
			u.setActive(true);
			u.setAlias("A"+prenom.substring(0, 5));
			u.setDateCreate(new Date());
			personnelRepository.save(u);
		});
	}

	@Override
	public void initRayon() {
		Personnel userCreate = personnelRepository.findAll().get(0);
			Stream.of("Rayon1","Rayon2").forEach(libelle->{
				Rayon r = new Rayon();
				r.setLibelle(libelle);
				r.setDescription("Rayons contenant les xxx");
				//r.setPersonnel(userCreate);
				r.setDateLastUpdate(new Date());
				r.setDateCreate(new Date());
				rayonRepository.save(r);
			});
	}

	@Override
	public void initProduit() {
		Personnel userCreate = personnelRepository.findAll().get(0);
		rayonRepository.findAll().forEach(rayon->{
			
			Stream.of("RefProd0","RefProd0").forEach(ref->{
				Produit p = new Produit();
				p.setRefProduit(ref+(Math.random()*1000));
				p.setLibelle("Produit");
				//p.setPersonnel(userCreate);
				p.setDateCreate(new Date());
				p.setRayon(rayon);
				p.setDateLastUpdate(new Date());
				produitRepository.save(p);
			});
		});
	}

	@Override
	public void initVente() {
		Personnel userCreate = personnelRepository.findAll().get(0);
		Stream.of("RefV31","RefV01").forEach(ref->{
			Vente v = new Vente();
			v.setRef(ref+(Math.random()*1000));
			v.setDateCreate(new Date());
			v.setDateLastUpdate(new Date());
			v.setDateVente(new Date());
			//v.setPersonnel(userCreate);
			venteRepository.save(v);
		});
	}

	@Override
	public void initLigneVente() {
		Personnel userCreate = personnelRepository.findAll().get(0);
		produitRepository.findAll().forEach(p->{
			venteRepository.findAll().forEach(v->{
				Stream.of("LV10","LV21","LV02").forEach(ref->{
					LigneVente lv = new LigneVente();
					lv.setProduit(p);
					lv.setVente(v);
					lv.setDateLastUpdate(new Date());
					lv.setDateCreate(new Date());
					//lv.setPersonnel(userCreate);
					ligneVenteRepository.save(lv);
				});
			});
		});
		
	}

	@Override
	public void initLivraison() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initLigneLivraison() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initCommande() {
		Personnel userCreate = personnelRepository.findAll().get(0);
		Stream.of("COM0","COM1").forEach(ref->{
			Commande c = new Commande();
			c.setRef(ref+(Math.random()*1000));
			c.setDateCommande(new Date());
			c.setDateCreate(new Date());
			c.setDateLastUpdate(new Date());
			c.setDelaiLivraisonCom((int) (10+Math.random()*20));
			//c.setPersonnel(userCreate);
			commandeRepository.save(c);
		});
		
	}

	@Override
	public void initLigneCommande() {
		
	}

	@Override
	public void initFournisseur() {
		
	}

	@Override
	public void initCommandeFournisseur() {
		
	}

	@Override
	public void initReserve() {
			
	}

	@Override
	public void initAddress() {
	Personnel userCreate = personnelRepository.findAll().get(0);
	Stream.of("Xipress","Rufisque").forEach(add->{
		Address a = new Address();
		a.setPays("Senegal");
		a.setVille("Dakar");
		a.setRue(12);
		//a.setPersonnel(userCreate);
		a.setDateCreate(new Date());
		a.setDateLastUpdate(new Date());
		addressRepository.save(a);
	});
		
	}


}
