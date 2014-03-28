package com.assur.pack.daoImp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.assur.pack.dao.EtatDao;
import com.assur.pack.data.Etat;

public class EtatDaoImpl implements EtatDao {

	@PersistenceContext
    EntityManager em;
	
	@Override
	public void updateEtat(Etat E) {
		em.merge(E);
	}

	@Override
	public void deleteEtat(Long id_Etat) {
        Etat etat=getEtatById(id_Etat);
		em.remove(etat);
	}

	@Override
	public Etat getEtatById(Long id_Etat) {
       return em.find(Etat.class, id_Etat);
	}

	

}
