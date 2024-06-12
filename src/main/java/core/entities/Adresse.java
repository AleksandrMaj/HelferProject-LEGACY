package core.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse
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
