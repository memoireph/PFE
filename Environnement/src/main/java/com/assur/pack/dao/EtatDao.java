package com.assur.pack.dao;

import com.assur.pack.data.Etat;

public interface EtatDao {

	public void addEtat(Etat E, Long id_sinistre);
	public void updateEtat(Etat E);
	public void deleteEtat(Long id_Etat);
	public void getEtatById(Long id_Etat);
	
}
