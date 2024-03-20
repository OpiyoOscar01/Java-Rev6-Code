package PracticePack;

public class A {

int age=23;
public String name;
public String address="Kampala";
public void details() {
System.out.println("\nHello " + name + ",you are " + age + " years old.");
}
A(String a){
this.name=a;
}

public  static void main(String[] args) {
A obj=new A("Steve");
obj.details();
}
}
