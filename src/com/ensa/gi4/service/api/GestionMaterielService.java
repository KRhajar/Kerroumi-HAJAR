package com.ensa.gi4.service.api;

import com.ensa.gi4.modele.Materiel;

public interface GestionMaterielService {
    void init();
    void listerMateriel();
    void ajouterNouveauMateriel();
    void search();
    void delet();
    void update();
    public void allouerMateriel();

    void marquerIndispoouDispo();
}
