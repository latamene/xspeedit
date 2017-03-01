
//robot optimisé

 
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.Scanner;

	public class RobotOptimise {
	public static int compteur(int a ,ArrayList <Integer> arr){
	Iterator<Integer> it = arr.iterator();
	int com=0;
	while (it.hasNext()) {
	     Integer s = it.next();
	     if(s==a)
	com++;
	 
	}
	return com;
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Veuillez saisir une suite d'articles");
	String str = sc.nextLine();
	ArrayList <String> moncarton = new ArrayList<String>();
	ArrayList <Integer> masuite = new ArrayList<Integer>();
	for(int i = 0 ;i<str.length(); i++){
	char a =str.charAt(i);
	masuite.add(Character.getNumericValue(a));
	}
	int comp1=compteur(1,masuite);
	int comp2=compteur(2,masuite);
	int comp3=compteur(3,masuite);
	int comp4=compteur(4,masuite);
	int comp5=compteur(5,masuite);
	int comp6=compteur(6,masuite);
	int comp7=compteur(7,masuite);
	int comp8=compteur(8,masuite);
	int comp9=compteur(9,masuite);
	       int compy=masuite.size()/2;
	if(comp1>=compy || comp2>=compy || comp3>=compy || comp4>=compy || comp5>=compy||comp6>=compy || comp7>=compy || comp8>=compy || comp9>=compy){
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
	else {
	int comp=masuite.size();
	//int comp=0;
	while(comp>0){
	if(comp==1){
	Integer x = Collections.max(masuite);
	int indxx =masuite.indexOf(x);
	masuite.remove(indxx);
	moncarton.add(Integer.toString(x));
	comp=masuite.size();
	 
	}
	else {
	Integer x = Collections.max(masuite);
	Integer y = Collections.min(masuite);
	if((x+y)<=10){
	moncarton.add(Integer.toString(x));
	moncarton.add(Integer.toString(y));
	moncarton.add("/");
	int indx =masuite.indexOf(x);
	masuite.remove(indx);
	int indy =masuite.indexOf(y);
	masuite.remove(indy);
	comp=masuite.size();
	}
	else {
	Integer maxy = Collections.max(masuite);
	moncarton.add(Integer.toString(maxy));
	moncarton.add("/");
	int indxa =masuite.indexOf(maxy);
	masuite.remove(indxa);
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

	}

