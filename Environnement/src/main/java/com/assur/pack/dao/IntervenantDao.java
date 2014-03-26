package com.assur.pack.dao;

import com.assur.pack.data.Intervenant;

public interface IntervenantDao {
	
	public void addIntervenant (Intervenant I);
	public void updateIntervenant (Intervenant id_intr);
	public void deleteIntervenant( Long id_intr);
	public Intervenant getIntervenantById(Long id_intr);


}
