/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.io.Serializable;
import javax.mvc.binding.MvcBinding;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

/**
 *
 * @author numag
 */
public class ClientForm implements Serializable {

    private static final long serialVersionUID = -3523783484400524581L;

    @MvcBinding @FormParam("libelle")
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[a-zA-Z0-9]+", message = "Uniquement des lettres ou des chiffres")
    private String libelle;

    @MvcBinding @FormParam("description")
    //@NotEmpty
    @Size(min = 1, max = 255)
    private String description;

    // Getters, setters

    public String getLibelle() {
            return libelle;
    }

    public void setLibelle(final String libelle) {
            this.libelle = libelle;
    }

    public String getDescription() {
            return description;
    }

    public void setDescription(final String description) {
            this.description = description;
    }

}
