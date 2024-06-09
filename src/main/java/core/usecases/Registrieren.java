package core.usecases;

import core.entities.Benutzer;
import core.enums.Benutzergruppe;
import dataaccess.BenutzerDAO;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class Registrieren {

    private String username;
    private String password;
    private String email;
    private String name;
    private String vorname;

    @EJB
    private BenutzerDAO benutzerDAO;

    // Getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String register() {
        Benutzer benutzer = new Benutzer();
        benutzer.setName(name);
        benutzer.setVorname(vorname);
        benutzer.setPasswort(password);
        benutzer.setEmail(email);
        benutzer.setBenutzergruppe(Benutzergruppe.MITGLIED); // Set default group

        // Save the user using DAO
        benutzerDAO.save(benutzer);

        return "login.xhtml?faces-redirect=true"; // Redirect to login page
    }
}