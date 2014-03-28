package com.assur.pack.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.assur.pack.dao.IntervenantDao;
import com.assur.pack.data.Intervenant;
import com.assur.pack.data.Sinistre;

public class IntervenantDaoImpl implements IntervenantDao {

	@PersistenceContext
    EntityManager em;
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


}
