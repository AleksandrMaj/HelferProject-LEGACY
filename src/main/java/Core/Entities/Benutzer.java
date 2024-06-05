package Core.Entities;

import Core.Enums.Benutzergruppe;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Benutzer implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String vorname;

    @Embedded
    private Adresse adresse;

    private Benutzergruppe benutzergruppe;

    @Embedded
    private Email email;

    private String passwort;

    public Benutzer()
    {
    }

    public Benutzer(String name, String vorname, Adresse adresse, Benutzergruppe benutzergruppe, Email email, String passwort)
    {
        this.name = name;
        this.vorname = vorname;
        this.adresse = adresse;
        this.benutzergruppe = benutzergruppe;
        this.email = email;
        this.passwort = passwort;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getVorname()
    {
        return vorname;
    }

    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }

    public Adresse getAdresse()
    {
        return adresse;
    }

    public void setAdresse(Adresse adresse)
    {
        this.adresse = adresse;
    }

    public Benutzergruppe getBenutzergruppe()
    {
        return benutzergruppe;
    }

    public void setBenutzergruppe(Benutzergruppe benutzergruppe)
    {
        this.benutzergruppe = benutzergruppe;
    }

    public Email getEmail()
    {
        return email;
    }

    public void setEmail(Email email)
    {
        this.email = email;
    }

    public String getPasswort()
    {
        return passwort;
    }

    public void setPasswort(String passwort)
    {
        this.passwort = passwort;
    }
}

@Embeddable
class Adresse
{
    private String strasse;
    private String stadt;
    private String plz;
    private String land;

    public String getStrasse()
    {
        return strasse;
    }

    public void setStrasse(String strasse)
    {
        this.strasse = strasse;
    }

    public String getStadt()
    {
        return stadt;
    }

    public void setStadt(String stadt)
    {
        this.stadt = stadt;
    }

    public String getPlz()
    {
        return plz;
    }

    public void setPlz(String plz)
    {
        this.plz = plz;
    }

    public String getLand()
    {
        return land;
    }

    public void setLand(String land)
    {
        this.land = land;
    }
}

@Embeddable
class Email
{
    private String email;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}

