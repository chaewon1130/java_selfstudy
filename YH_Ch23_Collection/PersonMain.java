package YH_Ch23_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class PersonMain {

	public static void main(String[] args) {
		HashSet<Person> person = new HashSet<>();
		person.add(new Person("김동호", 29));
		person.add(new Person("김동호", 29));
		person.add(new Person("손흥민", 31));
		
		System.out.println("해쉬셋크기 : " + person.size());
		Iterator<Person> iter = person.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
