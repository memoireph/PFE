package com.assur.pack.daoImp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.assur.pack.dao.SinistreDao;
import com.assur.pack.data.Document_sinist;
import com.assur.pack.data.Etat;
import com.assur.pack.data.Intervenant;
import com.assur.pack.data.Rapport;
import com.assur.pack.data.Sinistre;
import com.assur.pack.data.SinistreH;
@Transactional
public class SinistreDaoImpl implements SinistreDao {
   
	@PersistenceContext
	EntityManager em;
   
	@Override
	public Long addSinistre(Sinistre S) {
		em.persist(S);
		return S.getId_sinistre();

	}

	@Override
	public void updateSinistre(Sinistre S) {
		em.merge(S);

	}

	@Override
	public void deleteSinistre(Long id_sinistre) {
		Sinistre sinistre=getSinistreById(id_sinistre);
		em.remove(sinistre);

	}

	@Override
	public List<Sinistre> listSinistre() {
		Query q=em.createQuery("from Sinistre s where type_sinistre=:type").setParameter("type","regleur");
		return (List<Sinistre>)q.getResultList();
	}

	@Override
	public Sinistre getSinistreById(Long id_sinistre) {
		
		return em.find(Sinistre.class,id_sinistre);
	}

	@Override
	public List<Intervenant> listIntervenantsSinistre(Long id_sinistre) {
		Sinistre sinistre=getSinistreById(id_sinistre);
		return sinistre.getIntrervenant();
	}

	@Override
	public List<Etat> avancementSinistre(Long id_sinistre) {
		Sinistre sinistre=getSinistreById(id_sinistre);
		return sinistre.getEtat_sinistre();
	}

	@Override
	public List<SinistreH> listHistoriqueSinistre(Long id_sinistre) {
		Sinistre sinistre=getSinistreById(id_sinistre);
		return sinistre.getSinistreh();
	}

	@Override
	public SinistreH getLastHistoriqueSinistre(Long id_sinistre) {
		Sinistre sinistre=getSinistreById(id_sinistre);
		int size=sinistre.getSinistreh().size();
		return sinistre.getSinistreh().get(size-1);
	}

	@Override
	public void addIntervenantSinistre(Intervenant intrervenant, Long id_sinistre) {
		Sinistre sinistre=getSinistreById(id_sinistre);
		intrervenant.getSinistre().add(sinistre);
		sinistre.getIntrervenant().add(intrervenant);
		em.merge(sinistre);
		em.merge(intrervenant);
	}

	@Override
	public void addDocument(Document_sinist D, Long id_sinistre) {
		Sinistre sinistre=getSinistreById(id_sinistre);
		sinistre.getDoc_sinistre().add(D);
		D.setSinistre(sinistre);
		em.persist(D);		
	}

	@Override
	public void addEtat(Etat E, Long id_sinistre) {
		Sinistre sinistre=getSinistreById(id_sinistre);
		sinistre.getEtat_sinistre().add(E);
		E.setSinistre(sinistre);
		em.persist(E);
	}

	@Override
	public void addRapport(Rapport R, Long id_sinistre) {
		Sinistre sinistre=getSinistreById(id_sinistre);
		sinistre.getRapport().add(R);
		R.setSinistre(sinistre);
		em.persist(R);
	}

	@Override
	public List<Rapport> listRapportSinistre(Long id_sinistre) {
		Sinistre sinistre=getSinistreById(id_sinistre);
		return sinistre.getRapport();
	}


}