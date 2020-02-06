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
import com.clyn.sn.dao.UserRepository;
import com.clyn.sn.dao.VenteRepository;
import com.clyn.sn.entities.Address;
import com.clyn.sn.entities.Commande;
import com.clyn.sn.entities.LigneVente;
import com.clyn.sn.entities.Produit;
import com.clyn.sn.entities.Rayon;
import com.clyn.sn.entities.User;
import com.clyn.sn.entities.Vente;

@Service
@Transactional
public class IPharmacieInitServiceImpl implements IPharmacieInitService{

	@Autowired
	private UserRepository userRepository;
	
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
		Stream.of("Saliou","Imame","Zeinab","Abdoulaye").forEach(prenom->{
			User u = new User();
			u.setPrenom(prenom);
			u.setEmail("email@gmail.com");
			u.setUsername("username");
			u.setActive(true);
			u.setAlias("A"+prenom.substring(0, 5));
			u.setDateCreate(new Date());
			userRepository.save(u);
		});
	}

	@Override
	public void initRayon() {
		User userCreate = userRepository.findAll().get(0);
			Stream.of("Rayon1","Rayon2","Rayon3","Rayon4").forEach(libelle->{
				Rayon r = new Rayon();
				r.setLibelle(libelle);
				r.setUser(userCreate);
				r.setDateLastUpdate(new Date());
				r.setDateCreate(new Date());
				rayonRepository.save(r);
			});
	}

	@Override
	public void initProduit() {
		User userCreate = userRepository.findAll().get(0);
		rayonRepository.findAll().forEach(rayon->{
			
			Stream.of("RefProd0","RefProd0","RefProd0","RefProd0").forEach(ref->{
				Produit p = new Produit();
				p.setRefProduit(ref+(Math.random()*1000));
				p.setLibelle("Produit");
				p.setUser(userCreate);
				p.setDateCreate(new Date());
				p.setRayon(rayon);
				p.setDateLastUpdate(new Date());
				produitRepository.save(p);
			});
		});
	}

	@Override
	public void initVente() {
		User userCreate = userRepository.findAll().get(0);
		Stream.of("RefV31","RefV01","RefV52","RefV021").forEach(ref->{
			Vente v = new Vente();
			v.setRef(ref+(Math.random()*1000));
			v.setDateCreate(new Date());
			v.setDateLastUpdate(new Date());
			v.setDateVente(new Date());
			v.setUser(userCreate);
			venteRepository.save(v);
		});
	}

	@Override
	public void initLigneVente() {
		User userCreate = userRepository.findAll().get(0);
		produitRepository.findAll().forEach(p->{
			venteRepository.findAll().forEach(v->{
				Stream.of("LV10","LV21","LV02").forEach(ref->{
					LigneVente lv = new LigneVente();
					lv.setProduit(p);
					lv.setVente(v);
					lv.setDateLastUpdate(new Date());
					lv.setDateCreate(new Date());
					lv.setUser(userCreate);
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
		User userCreate = userRepository.findAll().get(0);
		Stream.of("COM0","COM1","COM2").forEach(ref->{
			Commande c = new Commande();
			c.setRef(ref+(Math.random()*1000));
			c.setDateCommande(new Date());
			c.setDateCreate(new Date());
			c.setDateLastUpdate(new Date());
			c.setDelaiLivraisonCom((int) (10+Math.random()*20));
			c.setUser(userCreate);
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
	User userCreate = userRepository.findAll().get(0);
	Stream.of("Xipress","Rufisque","Almadi").forEach(add->{
		Address a = new Address();
		a.setPays("Senegal");
		a.setVille("Dakar");
		a.setRue(12);
		a.setUser(userCreate);
		a.setDateCreate(new Date());
		a.setDateLastUpdate(new Date());
		addressRepository.save(a);
	});
		
	}


}
