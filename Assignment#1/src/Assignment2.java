
public class Assignment2 {
public static void main(String[]args) {
	int number = 7; 
double decimal = 10.25; 
boolean ILoveBooks = true; 
char t = '5';
String idk = "um hi"; 

System.out.println(number); 
System.out.println(decimal); 
System.out.println(ILoveBooks); 
System.out.println(t);
System.out.println(idk); 
 
int number1 = (int) 8.1; //value is now 8 because java rounds down 
double decimal1 = (double)3; //value is now 3.0 because a double always includes decimal places 
boolean ILooveBooks = 1 > 3; //value is now false because 1 is not greater than 3
char t1 = 5; //value is now 5 because "=" is "equal to" 
String concatenation = "hello" + " there"; //value is now "hello there" because of addition 

System.out.println(number1);
System.out.println( decimal1);
System.out.println(ILooveBooks);
System.out.println(t1);
System.out.println(concatenation); 

boolean master = 8 == 3; 
System.out.println (master);

boolean follower = !true; 

System.out.println(follower);
} } 
