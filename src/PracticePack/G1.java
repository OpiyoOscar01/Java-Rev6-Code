package PracticePack;
public class G1 extends G implements G2,G3 {
public void makePayment(){
System.out.println("You will receive payment this weekend.");
}
public void message(){
System.out.println("Congratulations");
}
public void confirm(){
System.out.println("Confirm that you have received your salary.");
}
public void check(){
System.out.println("Check your email for the salary notification");
}
public static void main(String[] args) {
G1 kk=new G1();
kk.makePayment();
System.out.println("Your salary for this month is "+kk.calSalary(20000.8,28));
kk.check();
kk.message();
kk.confirm();
}
}
