package trainging.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Type")
public class Type {
	@Id
	@Column(name = "Type_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int typeId;

	@Column(name = "Type_Name")
	private String typeName;

	@Column(name = "Type_Description")
	private String typeDescription;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "type")
	private Set<MovieType> moiveType;
	
	/**##################################*/
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Type(String typeName, String typeDescription) {
		super();
		this.typeName = typeName;
		this.typeDescription = typeDescription;
	}
	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

	@Override
	public String toString() {
		return "Type [typeId=" + typeId + ", typeName=" + typeName + ", typeDescription=" + typeDescription
				+ ", moiveType=" + moiveType + "]";
	}
	
	
	
}
