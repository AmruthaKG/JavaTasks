package org.creatorstask3;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetOpt<String> so1= new SetOpt<String>();
		SetOpt<String> so2= new SetOpt<String>();
		so1.add("amrutha");
		so1.add("akshara");
		so1.add("sarulatha");
		so2.add("ardhra");
		so2.add("akshara");
		so2.add("sarulatha");
		System.out.println(so1);
		System.out.println(so2);
		System.out.println("union a u b:"+so1.union(so2));
		System.out.println("intersection a n b:"+so1.intersection(so2));
		System.out.println("intersection b n a:"+so1.intersection(so2));
		System.out.println("difference a - b:"+so1.difference(so2));
		System.out.println("Symmetric difference a * b:"+so1.symmetricDifference(so2));
		System.out.println("a superset b:"+((so1.isSuperSet(so2))?"A is the super set of B":"A is not the super set of B"));
		System.out.println("a superset b:"+((so1.isSuperSet(so2))?"A is the sub set of B":"A is not the sub set of B"));
		
		SetOpt<Student> st = new SetOpt<Student>();
		SetOpt<Student> st2 = new SetOpt<Student>();
		st.add(new Student(1,"amrutha",true));
		st.add(new Student(2,"akshara",true));
		st.add(new Student(2,"ardhra",true));
		st2.add(new Student(1,"amrutha",true));
		st2.add(new Student(2,"akshara",true));
		st2.add(new Student(2,"ardhra",true));
		st2.add(new Student(3,"sarulatha",true));
		System.out.println(st);
		System.out.println(st2);
		System.out.println("union a u b:"+st.union(st2));
		System.out.println("intersection a n b:"+st.intersection(st2));
		System.out.println("intersection b n a:"+st.intersection(st2));
		System.out.println("difference a - b:"+st.difference(st2));
		System.out.println("Symmetric difference a * b:"+st.symmetricDifference(st2));
		System.out.println("a superset b:"+((st.isSuperSet(st2))?"A is the super set of B":"A is not the super set of B"));
		System.out.println("a superset b:"+((st.isSuperSet(st2))?"A is the sub set of B":"A is not the sub set of B"));
		System.out.println("union a u b:"+st.union(st2));
		System.out.println("intersection a n b:"+st.intersection(st2));
		System.out.println("intersection b n a:"+st.intersection(st2));
		System.out.println("difference a - b:"+st.difference(st2));
		System.out.println("Symmetric difference a * b:"+st.symmetricDifference(st2));
		System.out.println("a superset b:"+((st.isSuperSet(st2))?"A is the super set of B":"A is not the super set of B"));
		System.out.println("a superset b:"+((st.isSuperSet(st2))?"A is the sub set of B":"A is not the sub set of B"));

	}

}
