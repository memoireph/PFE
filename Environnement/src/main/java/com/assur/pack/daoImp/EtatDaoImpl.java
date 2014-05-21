package com.assur.pack.daoImp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.assur.pack.dao.EtatDao;
import com.assur.pack.data.Etat;
import com.assur.pack.dataDTO.EtatDTO;
@Transactional
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

	@Override
	public EtatDTO getBean(Etat etat) {
		EtatDTO etatdto=new EtatDTO();
		etatdto.setIntitule(etat.getIntitule());
		etatdto.setId_etat(etat.getId_etat());
		etatdto.setEcheance(etat.getEcheance());
		etatdto.setDate_realisation(etat.getDate_realisation());
		etatdto.setRealiser(etat.isRealiser());
		etatdto.setIdsinistre(etat.getSinistre().getId_sinistre());
		etatdto.setIdintervenant(etat.getIntervenant().getId_intr());
		return etatdto;
	}

	

}
