package resources;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Event {
	public String name;
	Set<ActionLiteral> actions;
	
	public Event(){
		actions=null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Event(String n,Set<ActionLiteral> s) {
		this.name =n;
		this.actions = s;
	}
	public Event(String n) {
		this.name =n;
		this.actions = new HashSet<ActionLiteral>();
	}
	public Set<ActionLiteral> getActions() {
		return actions;
	}
	public void setActions(Set<ActionLiteral> Actions) {
		this.actions = Actions;
	}
	public void addActionConstant(ActionLiteral f){
		this.actions.add(f);
	}
	@Override
	public String toString(){
		String s = "";
		s+= name + " -> {";
		Iterator<ActionLiteral> i = actions.iterator();
		int size = actions.size(), n=0;
		while(i.hasNext()){
			s += i.next().toString();
			if (++n < size)
				s +=", ";

		}
		s+="}";
		return s;

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actions == null) ? 0 : actions.hashCode());
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
		Event other = (Event) obj;
		if (actions == null) {
			if (other.actions != null)
				return false;
		} else if (!actions.equals(other.actions))
			return false;
		return true;
	}
	
}
