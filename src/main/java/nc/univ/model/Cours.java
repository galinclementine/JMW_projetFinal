package nc.univ.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Cours {

    @Id
    @GeneratedValue
    protected int id;

    protected Date dateDebut;
    protected Date dateFin;

    @OneToOne
    protected Niveau niveau;

    @OneToOne
    protected Salle salle;

    @OneToMany
    protected ArrayList<Eleve> listeEleves;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public ArrayList<Eleve> getListeEleves() {
        return listeEleves;
    }

    public void setListeEleves(ArrayList<Eleve> listeEleves) {
        this.listeEleves = listeEleves;
    }
}
