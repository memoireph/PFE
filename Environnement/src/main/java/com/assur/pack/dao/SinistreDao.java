package com.assur.pack.dao;

import java.util.List;
import com.assur.pack.data.*;

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

}

