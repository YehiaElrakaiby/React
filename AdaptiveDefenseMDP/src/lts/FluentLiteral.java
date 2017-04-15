package lts;

public class FluentLiteral {
	String name;
	String value;
	public FluentLiteral(String n, String v) {
		// TODO Auto-generated constructor stub
		this.name=n;
		this.value=v;
	}
	public FluentLiteral() {
		name ="";
		value="";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString(){
		String s;
		if(value.equals("tt")){
			s = name;
		}
		else if(value.equals("ff")){
			s = "-"+name;
		}
		else {
			s = name + "=" + value;
		}
		return s;

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FluentLiteral other = (FluentLiteral) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}
