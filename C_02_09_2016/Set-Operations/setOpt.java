package org.creatorstask3;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class SetOpt<E>{

	private Set<E> set;
	

	public SetOpt() {
		this.set=new TreeSet<E>();
	}
	public SetOpt(Collection<E> set) {
		this.set = (Set<E>)set;
	}
	public int size(){
		return this.set.size();
	}
	public boolean isEmpty(){
		return this.set.isEmpty();
	}
	public void clear(){
		this.set.clear();
	}
	public boolean contains(Object o) {
		return this.set.contains(o);
	}
	public boolean remove(Object o){
		return this.set.remove(o);
	}
	public void add(E e){
		this.set.add(e);
	}
	public SetOpt<E> union(SetOpt<E> b) {
    	Set<E> copy1 = new TreeSet<E>(this.set);
    	Set<E> copy2 = new TreeSet<E>(b.set);
        SetOpt<E> tmp = new SetOpt<E>();
        copy1.addAll(copy2);
        tmp.set = copy1;
        return tmp;
    }
	public SetOpt<E> intersection(SetOpt<E> b){
		Set<E> copy1 = new TreeSet<E>(this.set);
    	Set<E> copy2 = new TreeSet<E>(b.set);
        SetOpt<E> tmp = new SetOpt<E>();
        copy1.retainAll(copy2);
        tmp.set = copy1;
        return tmp;
	}
	public SetOpt<E> difference(SetOpt<E> b){
		Set<E> copy1 = new TreeSet<E>(this.set);
    	Set<E> copy2 = new TreeSet<E>(b.set);
        SetOpt<E> tmp = new SetOpt<E>();
        copy1.removeAll(copy2);
        tmp.set = copy1;
        return tmp;
	}
	public SetOpt<E> symmetricDifference(SetOpt<E> b){
		Set<E> copy1 = new TreeSet<E>(this.set);
    	Set<E> copy2 = new TreeSet<E>(b.set);
    	Set<E> copy12 = new TreeSet<E>(this.set);
    	Set<E> copy22 = new TreeSet<E>(b.set);
        SetOpt<E> tmp1 = new SetOpt<E>();
        SetOpt<E> tmp2 = new SetOpt<E>();
        (copy1).addAll(copy2);
        tmp1.set=copy1;
        copy12.retainAll(copy22);
        tmp2.set=copy12;
       tmp1.set.removeAll(tmp2.set);
        return tmp1;
	}
	public boolean isSuperSet(SetOpt<E> b){
		Set<E> copy1 = new TreeSet<E>(this.set);
    	Set<E> copy2 = new TreeSet<E>(b.set);
       
        return copy1.containsAll(copy2);
        
        
	}
	public boolean isSubSet(SetOpt<E> b){
		Set<E> copy1 = new TreeSet<E>(this.set);
    	Set<E> copy2 = new TreeSet<E>(b.set);
        return copy2.containsAll(copy1);
	}
	

	@Override
	public String toString() {
		return " [set=" + set + "]";
	}
	

}
