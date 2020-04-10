import java.util.Scanner;
public class primeiro{
public static void main(String[] args){
Scanner numero = new Scanner (System.in);
double a;
double b;
double c;
double triangulo;
double circulo;
double trapezio;
double quadrado;
double retangulo;
System.out.println ("Qual o valor de A: ");
a = scan.nextDouble(); 
System.out.println ("Qual o valor de B: ");
b = scan.nextDouble();
System.out.println ("Qual o valor de C: ");
c = scan.nextDouble(); 
triangulo=a*c/2;
circulo=(c*c)*3.14159;
trapezio=((a+b)*c)/2;
quadrado=b*b;
retangulo=a*b;
System.out.println("TRIANGULO = "+ triangulo);
System.out.println("CIRCULO = "+ circulo);
System.out.println("TRAPEZIO = "+ trapezio);
System.out.println("QUADRADO = "+ quadrado);
System.out.println("RETANGULO = "+ retangulo);
}
}
