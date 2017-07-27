package resources;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

public class ActionVariableDescription {
	String name;
	HashSet<String> domain;
	String type;
	Integer id;
	
	public ActionVariableDescription(String name, EList<String> values, String tp, int i) {
		this.name=name;
		this.domain=new HashSet<String>();
		for(String v: values) {
			domain.add(v);
		}
		this.id = i;
		this.type = tp;
	}
	
	public ActionVariableDescription(String n, HashSet<String> values) {
		this.name=n;
		this.domain=values;
	}
	public ActionVariableDescription(String n) {
		this.name=n;
		this.domain=new HashSet<String>();
	}
	public ActionVariableDescription() {
		name="";
		domain = new HashSet<String>();
	}
	
	public ActionVariableDescription(String name, HashSet<String> domain2, String tp, int i) {
		this.name=name;
		this.domain=domain2;
		this.id = i;
		this.type = tp;	
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
	public void setDomain(HashSet<String> domain) {
		this.domain = domain;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
