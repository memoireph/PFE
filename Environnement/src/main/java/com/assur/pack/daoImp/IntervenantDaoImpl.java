package com.assur.pack.daoImp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.assur.pack.dao.ActivitesDao;
import com.assur.pack.dao.DomicilesDao;
import com.assur.pack.dao.IntervenantDao;
import com.assur.pack.dao.LiensDao;
import com.assur.pack.dao.SinistreDao;
import com.assur.pack.dao.TelephonesDao;
import com.assur.pack.dao.TiersDao;
import com.assur.pack.data.Activites;
import com.assur.pack.data.Autre;
import com.assur.pack.data.Compagnie;
import com.assur.pack.data.Domiciles;
import com.assur.pack.data.Intervenant;
import com.assur.pack.data.Liens;
import com.assur.pack.data.Medecin;
import com.assur.pack.data.Sinistre;
import com.assur.pack.data.Telephones;
import com.assur.pack.data.Tiers;
import com.assur.pack.data.Victime;
@Transactional
public class IntervenantDaoImpl implements IntervenantDao {

	@PersistenceContext
    EntityManager em;
	ActivitesDao activitesdao;
	DomicilesDao domicilesdao;
	TelephonesDao telephonesdao;
	TiersDao tiersdao;
	SinistreDao sinistredao;
	public void setDomicilesdao(DomicilesDao domicilesdao) {
		this.domicilesdao = domicilesdao;
	}

	public void setTelephonesdao(TelephonesDao telephonesdao) {
		this.telephonesdao = telephonesdao;
	}

	public void setTiersdao(TiersDao tiersdao) {
		this.tiersdao = tiersdao;
	}

	public void setSinistredao(SinistreDao sinistredao) {
		this.sinistredao = sinistredao;
	}

	public void setLiensdao(LiensDao liensdao) {
		this.liensdao = liensdao;
	}

	LiensDao liensdao;
	public void setActivitesdao(ActivitesDao activitesdao) {
		this.activitesdao = activitesdao;
	}

	@Override
	public Long addIntervenant(Intervenant I) {
	   em.persist(I);
       return I.getId_intr();
	}

	@Override
	public void updateIntervenant(Intervenant I) {
       em.merge(I);
	}

	@Override
	public void deleteIntervenant(Long id_intr) {
		Intervenant I=getIntervenantById(id_intr);
		em.remove(I);

	}

	@Override
	public Intervenant getIntervenantById(Long id_intr) {

	     return em.find(Intervenant.class, id_intr);
	}

	@Override
	public List<Intervenant> listIntervenant() {
		Query q=em.createQuery("select I from Intervenant I");
		return (List<Intervenant>)q.getResultList();
	
	}


	
	
	@Override
	public List<Activites> listActivitesIntervenant(Long id_intr) {
        Intervenant i=getIntervenantById(id_intr);
		return i.getActivites();
	}

	@Override
	public List<Domiciles> listDomicilesIntervenant(Long id_intr) {
		Intervenant i=getIntervenantById(id_intr);
		return i.getDomiciles();
	}

	@Override
	public List<Liens> listLiensIntervenant(Long id_intr) {
		Intervenant i=getIntervenantById(id_intr);
		return i.getLiens();
	}

	@Override
	public List<Telephones> listTelephonesIntervenant(Long id_intr) {
		Intervenant i=getIntervenantById(id_intr);
		return i.getTelephones();
	}

	@Override
	public List<Tiers> listTiersIntervenant(Long id_intr) {
		Intervenant i=getIntervenantById(id_intr);
		return i.getTiers();
	}
	/*

	@Override
	public Intervenant createBeanIntervenant(IntervenantDTO iDTO) {
        Intervenant i = new Intervenant();
        i.setEmail_intr(iDTO.getEmail_intr());
        i.setId_intr(iDTO.getId_intr());
        i.setNom_intr(iDTO.getNom_intr());
        
        List<Activites> activites = new ArrayList<Activites>();
        if(iDTO.getActivitesid()!=null){
        	for(Long ida : iDTO.getActivitesid())
        		activites.add(activitesdao.getActiviteById(ida));
        }
        i.setActivites(activites);
        
        List<Domiciles> domiciles = new ArrayList<Domiciles>();
        if(iDTO.getDomicilesid()!=null){
        	for(Long idd : iDTO.getDomicilesid())
        		domiciles.add(domicilesdao.getDomicileById(idd));
        }
        i.setDomiciles(domiciles);
        
        List<Liens> liens = new ArrayList<Liens>();
        if(iDTO.getLiensid()!=null){
        	for(Long idl : iDTO.getLiensid())
        		liens.add(liensdao.getLiensById(idl));
        }
        i.setLiens(liens);
        
        List<Sinistre> sinistres = new ArrayList<Sinistre>();
        if(iDTO.getSinistreid()!=null){
        	for(Long ids : iDTO.getSinistreid())
        		sinistres.add(sinistredao.getSinistreById(ids));
        }
        i.setSinistre(sinistres);
        
        List<Telephones> telephones = new ArrayList<Telephones>();
        if(iDTO.getTelephonesid()!=null){
        	
			for(String idt : iDTO.getTelephonesid())
        		telephones.add(telephonesdao.getTelephoneById(idt));
        }
        i.setTelephones(telephones);
        
        List<Tiers> tiers = new ArrayList<Tiers>();
        if(iDTO.getTiersid()!=null){
        	for(Long idtr : iDTO.getTiersid())
        		i.getTiers().add(tiersdao.getTiersById(idtr));
        }
        i.setTiers(tiers);

		return i;
	}
*/
	@Override
	public List<Victime> listVictime() {
		Query q=em.createQuery("select I from Intervenant I where DTYPE=:type").setParameter("type", "Victime");
		return (List<Victime>)q.getResultList();
	}

	@Override
	public List<Medecin> listMedecin() {
		Query q=em.createQuery("select I from Intervenant I where DTYPE=:type").setParameter("type", "Medecin");
		return (List<Medecin>)q.getResultList();
	}

	@Override
	public List<Compagnie> listCompagnie() {
		Query q=em.createQuery("select I from Intervenant I where DTYPE=:type").setParameter("type", "Compagnie");
		return (List<Compagnie>)q.getResultList();
	}

	@Override
	public List<Autre> listAutre() {
		Query q=em.createQuery("select I from Intervenant I where DTYPE=:type").setParameter("type", "Autre");
		return (List<Autre>)q.getResultList();
	}

	@Override
	public List<Telephones> listTelephones() {
		Query q=em.createQuery("select T from Telephones T");
		return (List<Telephones>)q.getResultList();
	}

	@Override
	public void deleteTelephone(Long id_intr, Telephones T) {
		Intervenant i=getIntervenantById(id_intr);
		em.remove(em.merge(T));
	}

	@Override
	public void deleteActivite(Activites A) {
		em.remove(em.merge(A));
		
	}

	@Override
	public void deleteDomicile(Domiciles D) {
		em.remove(em.merge(D));
	}

	@Override
	public void deleteLien(Liens L) {
		em.remove(em.merge(L));
	}

	@Override
	public String getTypeIntr(Long id_intr) {
		//Query q=em.createQuery("select DTYPE from Intervenant where id_intr=:id");
		Query qq=em.createNativeQuery("select DTYPE from Intervenant where id_intr=:id");
		qq.setParameter("id", id_intr);
		return (String) qq.getSingleResult();
	}

	

	@Override
	public void updateIntervenantVictime(Victime v, String Type) {
		if(Type=="physique"){
		Query q=em.createQuery("UPDATE Intervenant SET nom_intr=:nom, prenom=:prenom, CIN=:cin, date_naissance=:date_naissance, civilite=:civilite, email_intr=:email WHERE id_intr=:id_intr");
		q.setParameter("id_intr", v.getId_intr());
		q.setParameter("nom", v.getNom_intr());
		q.setParameter("prenom", v.getPrenom());
		q.setParameter("cin", v.getCIN());
		q.setParameter("date_naissance", v.getDate_naissance());
		q.setParameter("civilite", v.getCivilite());
		q.setParameter("email", v.getEmail_intr());
		q.executeUpdate();
		}
	}
	
	@Override
	public void updateIntervenantMedecin(Medecin m, String Type) {
		if(Type=="physique"){
		Query q=em.createQuery("UPDATE Intervenant SET nom_intr=:nom, prenom=:prenom, CIN=:cin, date_naissance=:date_naissance, civilite=:civilite, email_intr=:email WHERE id_intr=:id_intr");
		q.setParameter("id_intr", m.getId_intr());
		q.setParameter("nom", m.getNom_intr());
		q.setParameter("prenom", m.getPrenom());
		q.setParameter("cin", m.getCIN());
		q.setParameter("date_naissance", m.getDate_naissance());
		q.setParameter("civilite", m.getCivilite());
		q.setParameter("email", m.getEmail_intr());
		q.executeUpdate();
		}
	}
	
	@Override
	public void updateIntervenantAutre(Autre a, String Type) {
		if(Type=="physique"){
		Query q=em.createQuery("UPDATE Intervenant SET nom_intr=:nom, prenom=:prenom, CIN=:cin, date_naissance=:date_naissance, civilite=:civilite, email_intr=:email WHERE id_intr=:id_intr");
		q.setParameter("id_intr", a.getId_intr());
		q.setParameter("nom", a.getNom_intr());
		q.setParameter("prenom", a.getPrenom());
		q.setParameter("cin", a.getCIN());
		q.setParameter("date_naissance", a.getDate_naissance());
		q.setParameter("civilite", a.getCivilite());
		q.setParameter("email", a.getEmail_intr());
		q.executeUpdate();
		}
	}
	
	@Override
	public void updateIntervenantCompagnie(Compagnie c, String Type) {
		if(Type=="moral"){
		Query q=em.createQuery("UPDATE Intervenant SET nom_intr=:nom, patente=:patente, site=:site, email_intr=:email WHERE id_intr=:id_intr");
		q.setParameter("id_intr", c.getId_intr());
		q.setParameter("patente", c.getPatente());
		q.setParameter("nom", c.getNom_intr());
		q.setParameter("site", c.getSite());
		q.setParameter("email", c.getEmail_intr());
		q.executeUpdate();
		}
		//em.merge(I);
	}

	
	@Override
	public void addTelephonesIntervenant(Long id_intr, Telephones T) {
		Intervenant I=getIntervenantById(id_intr);
		I.getTelephones().add(T);
		em.persist(T);
		em.merge(I);

	}

	@Override
	public void addDomicilesIntervenant(Long id_intr, Domiciles D) {
		Intervenant I=getIntervenantById(id_intr);
		I.getDomiciles().add(D);
		em.persist(D);
		em.merge(I);
	}

	@Override
	public void addActivitesIntervenant(Long id_intr, Activites A) {
		Intervenant I=getIntervenantById(id_intr);
		I.getActivites().add(A);
		em.persist(A);
		em.merge(I);
	}

	@Override
	public void addTiersIntervenant(Long id_intr, Tiers Tr) {
		Intervenant I=getIntervenantById(id_intr);
		I.getTiers().add(Tr);
		em.persist(Tr);
		em.merge(I);
	}

	@Override
	public void addLiensIntervenant(Long id_intr, Liens L) {
		Intervenant I=getIntervenantById(id_intr);
		I.getLiens().add(L);
		em.persist(L);
		em.merge(I);
		
	}
	


}
