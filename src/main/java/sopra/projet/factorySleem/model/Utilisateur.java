package sopra.projet.factorySleem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(name = "identifiant")
	private String identifiant;
	@Column(name = "motDePasse")
	private String motDePasse;
	@Column(name = "active")
	private boolean active;
	@Column(name = "roleUtilisateur")
	@Enumerated(EnumType.STRING)
	private RoleUtilisateur roleUtilisateur;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

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

	public RoleUtilisateur getRoleUtilisateur() {
		return roleUtilisateur;
	}

	public void setRoleUtilisateur(RoleUtilisateur roleUtilisateur) {
		this.roleUtilisateur = roleUtilisateur;
	}

	public Utilisateur() {
	}

	public Utilisateur(String identifiant, String motDePasse, boolean active, RoleUtilisateur roleUtilisateur) {
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.active = active;
		this.roleUtilisateur = roleUtilisateur;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", version=" + version + ", identifiant=" + identifiant + ", motDePasse="
				+ motDePasse + ", active=" + active + ", roleUtilisateur=" + roleUtilisateur + "]";
	}

}
