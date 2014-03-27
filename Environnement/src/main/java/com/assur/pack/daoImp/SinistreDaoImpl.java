package com.assur.pack.daoImp;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.assur.pack.dao.SinistreDao;
import com.assur.pack.data.Etat;
import com.assur.pack.data.Intervenant;
import com.assur.pack.data.Sinistre;
import com.assur.pack.data.SinistreH;

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
		
		return null;
	}

	@Override
	public void addIntervenantSinistre(Intervenant intrervenant, Long id_sinistre) {
		Sinistre sinistre=getSinistreById(id_sinistre);
		intrervenant.getSinistre().add(sinistre);
		sinistre.getIntrervenant().add(intrervenant);
		em.merge(sinistre);
		em.merge(intrervenant);
		
		
	  

	}


}
