package com.assur.pack.daoImp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.assur.pack.dao.DocumentDao;
import com.assur.pack.dao.EtatDao;
import com.assur.pack.dao.IndemnisationDao;
import com.assur.pack.dao.IntervenantDao;
import com.assur.pack.dao.SinistreDao;
import com.assur.pack.data.Contrat;
import com.assur.pack.data.Document_sinist;
import com.assur.pack.data.Etat;
import com.assur.pack.data.Indemnisation;
import com.assur.pack.data.Intervenant;
import com.assur.pack.data.Rapport;
import com.assur.pack.data.Sinistre;
import com.assur.pack.data.SinistreH;
import com.assur.pack.dataDTO.SinistreDTO;

public class SinistreDaoImpl implements SinistreDao {
   private IndemnisationDao indemdao;
   private IntervenantDao intervenantdao;
   private EtatDao etatdao;
   private DocumentDao document;
	@PersistenceContext
	EntityManager em;
   
	@Override
	public Long addSinistre(Sinistre S) {
		//S.setContrat(contrat);
		//contrat.getSinistre().add(S);
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
		Query q=em.createQuery("from Sinistre");
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

	@Override
	public SinistreDTO createBean(Sinistre sinistre) {
		SinistreDTO sinistredto=new SinistreDTO();
		sinistredto.setId_sinistre(sinistre.getId_sinistre());
		sinistredto.setLieu_sinistre(sinistre.getLieu_sinistre());
		sinistredto.setMode_gestion(sinistre.getMode_gestion());
		sinistredto.setQualification(sinistre.getQualification());
		sinistredto.setDate_cloture(sinistre.getDate_cloture());
		sinistredto.setDate_decla(sinistre.getDate_decla());
		if(sinistre.getIndemnisation()!=null)
		sinistredto.setIdindemnisation(sinistre.getIndemnisation().getNum_ind());
		if(sinistre.getContrat()!=null)
		sinistredto.setNumContrat(sinistre.getContrat().getNum_contrat());
		ArrayList idListInterv=new ArrayList();
		if(sinistre.getIntrervenant()!=null){
			for (Intervenant s : sinistre.getIntrervenant()) {
				idListInterv.add(s.getId_intr());
			}	
		}
		sinistredto.setIntrervenant(idListInterv);
		ArrayList etats=new ArrayList();
		if(sinistre.getEtat_sinistre()!=null){
			
			for (Etat etat : sinistre.getEtat_sinistre()) {
				etats.add(etat.getId_etat());
			}
		}
		sinistredto.setEtat_sinistre(etats);
		
		return sinistredto;
	}

	@Override
	public Sinistre createSinistre(SinistreDTO sinistredto) {
		Sinistre sinistre=new Sinistre();
		sinistre.setId_sinistre(sinistredto.getId_sinistre());
		sinistre.setLieu_sinistre(sinistredto.getLieu_sinistre());
		sinistre.setMode_gestion(sinistredto.getMode_gestion());
		sinistre.setQualification(sinistredto.getQualification());
		sinistre.setDate_cloture(sinistredto.getDate_cloture());
		sinistre.setDate_decla(sinistredto.getDate_decla());
		if(sinistredto.getIdindemnisation()!=null)
		sinistre.setIndemnisation(indemdao.getIndemnisationById(sinistredto.getIdindemnisation()));
		List<Intervenant> intervenant=new ArrayList<Intervenant>();
		if(sinistredto.getIntrervenant()!=null){
			for (Long interve :sinistredto.getIntrervenant()) {
				intervenant.add(intervenantdao.getIntervenantById(interve));
			}		
		}
		sinistre.setIntrervenant(intervenant);
		List<Etat> etats=new ArrayList<Etat>();
		if(sinistredto.getEtat_sinistre()!=null){
			for (Long etat : sinistredto.getEtat_sinistre()) {
				etats.add(etatdao.getEtatById(etat));
			}
		}
		sinistre.setEtat_sinistre(etats);
		List<Document_sinist> docs=new ArrayList<Document_sinist>();
		if(sinistredto.getDoc_sinistre()!=null){
			for (Long doc: sinistredto.getDoc_sinistre()) {
				docs.add(document.getDocumentById(doc));
			}
		}
		sinistre.setDoc_sinistre(docs);
		return sinistre;
	}

	public void setIndemdao(IndemnisationDao indemdao) {
		this.indemdao = indemdao;
	}

	public void setIntervenantdao(IntervenantDao intervenantdao) {
		this.intervenantdao = intervenantdao;
	}

	public void setEtatdao(EtatDao etatdao) {
		this.etatdao = etatdao;
	}

	public void setDocument(DocumentDao document) {
		this.document = document;
	}

	public void addIndemnisationSinistre(Long id_sinistre, Indemnisation I) {
		Sinistre S=getSinistreById(id_sinistre);
		S.setIndemnisation(I);
		I.setSinistre(S);
		em.persist(I);
		em.merge(S);
}

@Override
public void addSinistreH(SinistreH h, Long id_sinistre) {
	Sinistre s=getSinistreById(id_sinistre);
	s.getSinistreh().add(h);
	
	em.persist(h);
	em.merge(s);
}
 
}
