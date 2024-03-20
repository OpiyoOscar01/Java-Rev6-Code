package PracticePack;

public class C extends A{
public int distance;

public C(String a, int distance) {
super(a);
this.distance = distance;
}
public void dist(){
System.out.println("The distance is "+distance+" kilometers.");
}

public static void main(String[] args) {
C aa=new C("Cock",12);
aa.details();
aa.dist();
}
}
