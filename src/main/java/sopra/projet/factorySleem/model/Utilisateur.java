package sopra.projet.factorySleem.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateurs")
public class Utilisateur {
	@Id
	private String identifiant;
	private String motDePasse;
	private boolean active;
	@OneToMany(mappedBy = "utilisateur")
	private Set<RoleUtilisateur> roles;
	
	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<RoleUtilisateur> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleUtilisateur> roles) {
		this.roles = roles;
	}

	public Utilisateur() {
	}

}
