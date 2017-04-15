package lts;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class State {
	String name;
	SortedSet<FluentLiteral> fluents;

	public State(String n,SortedSet<FluentLiteral> s) {
		this.name=n;
		this.fluents = s;
	}
	public State(String n) {
		this.name=n;
		this.fluents = new TreeSet<FluentLiteral>();
	}

	public State() {
		this.name = "";
		this.fluents = new TreeSet<FluentLiteral>();
	}
	public void addFluentConstant(FluentLiteral f){
		this.fluents.add(f);
	}

	public Set<FluentLiteral> getFluents() {
		return fluents;
	}
	public void setFluents(SortedSet<FluentLiteral> fluents) {
		this.fluents = fluents;
	}

	@Override
	public String toString(){
		String s = "";
		s+= name + " -> {";
		Iterator<FluentLiteral> i = fluents.iterator();
		int size = fluents.size(), n=0;
		while(i.hasNext()){
			s += i.next().toString();
			if (++n < size)
				s +=", ";

		}
		s+="}";
		return s;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fluents == null) ? 0 : fluents.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equalsFluents(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if (fluents == null) {
			if (other.fluents != null)
				return false;
		} else if (!fluents.equals(other.fluents))
			return false;
		return true;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if (fluents == null) {
			if (other.fluents != null)
				return false;
		} else if (!fluents.equals(other.fluents))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
