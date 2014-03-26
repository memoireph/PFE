package com.assur.pack.dao;

import com.assur.pack.data.Rapport;

public interface RapportDao {
	
	public void addRapport(Rapport R, Long id_sinistre);
	public void updateRapport(Rapport R);
	public void deleteRapport(Long id_rapport);
	public void getRapportById(Long id_rapport);

}
