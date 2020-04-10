import java.util.Scanner;
public class Area{
public static void main(String[] args){
Scanner ler = new Scanner (System.in);
int raio;
double area;
System.out.println ("Digite o valor do raio: ");
raio = ler.nextInt(); 
area=(raio*raio)*3.14159;
System.out.println("A= "+ area);
}
}
