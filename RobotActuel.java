


	//robot actuel 

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Scanner;

	public class RobotActuel {

	public static void main(String[] args) {
	//TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Veuillez saisir une suite d'articles");
	String str = sc.nextLine();

	ArrayList <String> moncarton = new ArrayList();
	ArrayList <Integer> masuite = new ArrayList();

	for(int i = 0 ;i<str.length(); i++){
	char a =str.charAt(i);
	masuite.add(Character.getNumericValue(a));
	}
	int comp=masuite.size();
	for(int i=0;i<comp;i++){
	moncarton.add(Integer.toString(masuite.get(i)));
	int som= masuite.get(i);


	for(int j=i+1;j<masuite.size();j++){
	som=som+masuite.get(j);
	if(som<=10){
	moncarton.add(Integer.toString(masuite.get(j)));
	if(j==(masuite.size()-1))
	{i=j;}
	}
	else{
	moncarton.add("/");
	i=j-1;
	j=masuite.size();
	}
	}
	}

	Iterator<String> it = moncarton.iterator();

	while (it.hasNext()) {
	   String s = it.next();
	System.out.print(s);

	}
	}

	}

