package Collection;

import java.util.ArrayList;

public class Qspider {

	public static void main(String[] args) {
		 ArrayList javaStudents =new ArrayList();
		 javaStudents.add("Dolu");
		 javaStudents.add("Krishna");
		 javaStudents.add("Bhoomi");
		 javaStudents.add("Nakshatra");
		 javaStudents.add("Mokshit");
		 
		 
		 ArrayList  dupliJava = new ArrayList(javaStudents);
		 //dupliJava.add(javaStudents);
		 
		 
		 
		 ArrayList pythonStudents =new ArrayList();
		 pythonStudents.add("Virat");
		 pythonStudents.add("Mahi");
		 pythonStudents.add("Guru");
		 pythonStudents.add("Nakshatra");
		 pythonStudents.add("Mokshit");
		 
		 ArrayList proStudents =new ArrayList();
		 proStudents.add("Doreman");
		 proStudents.add("Gagan");
		 proStudents.add("Chinmayi");
		 proStudents.add("Nakshatra");
		 proStudents.add("Mokshit");
		 
		 ArrayList commonStudents =new ArrayList();
		 commonStudents.addAll(javaStudents);
		 commonStudents.addAll(pythonStudents);
		 commonStudents.addAll(proStudents);
		 
		 System.out.println(commonStudents);
		 
		 commonStudents.remove("Guru");
	     System.out.println(commonStudents);
		 
		 dupliJava.retainAll(pythonStudents);
		 System.out.println(dupliJava);
		 
		 //dupliJava.clear();
		 
		 dupliJava.addAll(javaStudents);
		 dupliJava.retainAll(proStudents);
		 System.out.println(dupliJava);
		 
		 
		 commonStudents.removeAll(proStudents);
		 System.out.println(commonStudents);
		 
		 System.out.println("Student at index 3 "+ commonStudents.get(3));
		 System.out.println(commonStudents.contains("Mahi"));
		 System.out.println(commonStudents.containsAll(javaStudents));
		 System.out.println(javaStudents.size());
		 System.out.println(pythonStudents.size());
		 System.out.println(proStudents.size());
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
}