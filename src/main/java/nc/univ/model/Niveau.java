package nc.univ.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity
public class Niveau {
    @Id
    protected String code;

    protected String libelle;

    @OneToMany
    protected ArrayList<Cours> listeCours;

    @OneToMany
    protected ArrayList<Eleve> listeEleves;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public ArrayList<Cours> getListeCours() {
        return listeCours;
    }

    public void setListeCours(ArrayList<Cours> listeCours) {
        this.listeCours = listeCours;
    }

    public ArrayList<Eleve> getListeEleves() {
        return listeEleves;
    }

    public void setListeEleves(ArrayList<Eleve> listeEleves) {
        this.listeEleves = listeEleves;
    }
}
