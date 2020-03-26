package controller;

import comptoirs.model.dao.ClientFacade;


import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import comptoirs.model.entity.Client;


@Controller
@Path("commandes") // Le chemin d'accès au contrôleur
@View("commandes.jsp") // La vue qui affiche le résultat
public class ClientCommandeController {
	@Inject // Le DAO (auto-généré) qui gère les entités "Client"
	ClientFacade facade;
	@Inject
	Models models; // Pour transmettre les infos à la vue
	@GET
	public void afficheCommandesPourLeClient( @QueryParam("code") String codeClient ) {
		// On utilise le DAO pour trouver le client qui correspond au paramètre
		Client c = facade.find(codeClient); // TODO : gérer les erreurs : et si le client n'existe pas ?
		// On transmet les informations à la vue
		models.put("client", c);
	}
}