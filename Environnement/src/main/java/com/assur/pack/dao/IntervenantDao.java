package com.assur.pack.dao;

import java.util.List;

import com.assur.pack.data.Activites;
import com.assur.pack.data.Autre;
import com.assur.pack.data.Compagnie;
import com.assur.pack.data.Domiciles;
import com.assur.pack.data.Intervenant;
import com.assur.pack.data.Liens;
import com.assur.pack.data.Medecin;
import com.assur.pack.data.Telephones;
import com.assur.pack.data.Tiers;
import com.assur.pack.data.Victime;

public interface IntervenantDao {
	
	public Long addIntervenant (Intervenant I);
	public void updateIntervenant (Intervenant id_intr);
	public void deleteIntervenant( Long id_intr);
	public List<Intervenant> listIntervenant();
	public Intervenant getIntervenantById(Long id_intr);
	String getTypeIntr(Long id_intr);
	
	public List<Telephones> listTelephones();
	public List<Victime> listVictime();
    public List<Medecin> listMedecin();
    public List<Compagnie> listCompagnie();
    public List<Autre> listAutre();
    public void deleteTelephone (Long id_intr, Telephones T);
    public void deleteActivite (Activites A);
    public void deleteDomicile (Domiciles D);
    public void deleteLien (Liens L);
    
	List<Activites> listActivitesIntervenant(Long id_intr);
	List<Domiciles> listDomicilesIntervenant(Long id_intr);
	List<Liens> listLiensIntervenant(Long id_intr);
	List<Telephones> listTelephonesIntervenant(Long id_intr);
	List<Tiers> listTiersIntervenant(Long id_intr);
	public void updateIntervenantVictime(Victime v, String Type);
	public void updateIntervenantMedecin(Medecin m, String Type);
	public void updateIntervenantAutre(Autre a, String Type);
	public void updateIntervenantCompagnie(Compagnie c, String Type);
	void addTiersIntervenant(Long id_intr, Tiers Tr);
	void addLiensIntervenant(Long id_intr, Liens L);
	void addActivitesIntervenant(Long id_intr, Activites A);
	void addDomicilesIntervenant(Long id_intr, Domiciles D);
	void addTelephonesIntervenant(Long id_intr, Telephones T);
}



