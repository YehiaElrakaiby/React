package resources;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StateVariableDescription {
	String name;
	Set<String> domain;
	public StateVariableDescription(String n, Set<String> values) {
		this.name=n;
		this.domain=values;
	}
	public StateVariableDescription(String n) {
		this.name=n;
		this.domain=new HashSet<String>();
	}
	public StateVariableDescription() {
		name="";
		domain = new HashSet<String>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getDomain() {
		return domain;
	}
	public void addToDomain(String e) {
		this.domain.add(e);
	}
	public void setDomain(Set<String> domain) {
		this.domain = domain;
	}

	@Override
	public String toString(){
		String s = "";
		s+= name + " -> {";
		Iterator<String> i = domain.iterator();
		int size = domain.size(), n=0;
		while(i.hasNext()){
			s += i.next();
			if (++n < size)
				s +=", ";

		}
		s+="}";
		return s;

	}
}
