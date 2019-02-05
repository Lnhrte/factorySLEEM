package sopra.projet.factorySleem.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Version;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class RessourcesMaterielles {

	@Id
	private String code;
	
	@Column(name="cout")
	private int cout;
	
	@Version
	private int version;

	public RessourcesMaterielles() {
		super();
	}

	public RessourcesMaterielles(String code, int cout) {
		super();
		this.code = code;
		this.cout = cout;
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "RessourcesMaterielles [code=" + code + ", cout=" + cout + "]";
	}

	

	
}
