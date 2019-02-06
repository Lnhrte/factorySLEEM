package sopra.projet.factorySleem.services;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;

import sopra.projet.factorySleem.model.Utilisateur;

public class CustomUserDetails implements UserDetails {

	private Utilisateur utilisateur;

	public CustomUserDetails(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.commaSeparatedStringToAuthorityList(
				StringUtils.collectionToCommaDelimitedString(utilisateur.getRoles()));
	}

	@Override
	public String getUsername() {
		return utilisateur.getIdentifiant();
	}

	@Override
	public String getPassword() {
		return utilisateur.getMotDePasse();
	}
	
	@Override
	public boolean isEnabled() {
		return utilisateur.isActive();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

}
