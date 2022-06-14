package nc.univ.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity
public class Salle {
    protected int capacite;
    protected String nom;

    @Id
    protected String code;

    @OneToMany
    protected ArrayList<Cours> listeCours;

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Cours> getListeCours() {
        return listeCours;
    }

    public void setListeCours(ArrayList<Cours> listeCours) {
        this.listeCours = listeCours;
    }
}
