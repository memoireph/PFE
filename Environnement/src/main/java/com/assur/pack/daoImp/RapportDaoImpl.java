package com.assur.pack.daoImp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.assur.pack.dao.RapportDao;
import com.assur.pack.data.Rapport;
@Transactional
public class RapportDaoImpl implements RapportDao {

	@PersistenceContext
    EntityManager em;

	@Override
	public void updateRapport(Rapport R) {
		em.merge(R);

	}

	@Override
	public void deleteRapport(Long id_rapport) {
		Rapport rapport=getRapportById(id_rapport);
		em.remove(rapport);
		
	}

	@Override
	public Rapport getRapportById(Long id_rapport) {
		return em.find(Rapport.class, id_rapport);
	}

	

}
