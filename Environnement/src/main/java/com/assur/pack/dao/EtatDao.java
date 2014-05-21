package com.assur.pack.dao;

import com.assur.pack.data.Etat;
import com.assur.pack.dataDTO.EtatDTO;

public interface EtatDao {
	public void updateEtat(Etat E);
	public void deleteEtat(Long id_Etat);
	public Etat getEtatById(Long id_Etat);
	public EtatDTO getBean(Etat etat);
	
}
