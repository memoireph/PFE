package com.assur.pack.dao;

import java.util.List;
import com.assur.pack.data.*;
import com.assur.pack.dataDTO.SinistreDTO;

public interface SinistreDao {
	
	public Long addSinistre(Sinistre S);
	public void updateSinistre(Sinistre S);
	public void deleteSinistre(Long id_sinistre);
	public List<Sinistre> listSinistre();
	public Sinistre getSinistreById(Long id_sinistre);
	public List<Intervenant> listIntervenantsSinistre(Long id_sinistre);
	public List<Etat> avancementSinistre(Long id_sinistre);
	public List<SinistreH> listHistoriqueSinistre(Long id_sinistre);
	public SinistreH getLastHistoriqueSinistre(Long id_sinistre);
	public void addIntervenantSinistre(Intervenant intervenant, Long id_sinistre);
	public void addDocument(Document_sinist D, Long id_sinistre);
	public void addEtat(Etat E, Long id_sinistre);
	public void addRapport(Rapport R, Long id_sinistre);
	public List<Rapport> listRapportSinistre(Long id_sinistre);
	public SinistreDTO createBean(Sinistre sinistre);
	public Sinistre createSinistre(SinistreDTO sinsitredto);
	void addSinistreH(SinistreH h, Long id_sinistre);
	


}

