package lts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.Value;

public class DescriptionAction {
	String name;
	HashSet<String> domain;
	String type;
	Integer id;
	public DescriptionAction(String n, HashSet<String> values) {
		this.name=n;
		this.domain=values;
	}
	public DescriptionAction(String n) {
		this.name=n;
		this.domain=new HashSet<String>();
	}
	public DescriptionAction() {
		name="";
		domain = new HashSet<String>();
	}
	public DescriptionAction(String name, EList<Value> values, String tp, int i) {
		this.name=name;
		this.domain=new HashSet<String>();
		for(Value v: values) {
			domain.add(v.getValue());
		}
		this.id = i;
		this.type = tp;
	}
	public DescriptionAction(String name, HashSet<String> domain2, String tp, int i) {
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
