package com.assur.pack.dao;

import java.util.List;

import com.assur.pack.data.Intervenant;

public interface IntervenantDao {
	
	public Long addIntervenant (Intervenant I);
	public void updateIntervenant (Intervenant id_intr);
	public void deleteIntervenant( Long id_intr);
	public List<Intervenant> listIntervenant();
	public Intervenant getIntervenantById(Long id_intr);


}
