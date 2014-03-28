package com.assur.pack.dao;

import com.assur.pack.data.Rapport;

public interface RapportDao {
	
	public void updateRapport(Rapport R);
	public void deleteRapport(Long id_rapport);
	public Rapport getRapportById(Long id_rapport);

}
