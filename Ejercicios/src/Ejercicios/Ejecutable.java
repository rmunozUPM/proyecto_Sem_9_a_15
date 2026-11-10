package Ejercicios;

public class Ejecutable {

	public static void main(String[] args) throws Exception {

		Ejercicios_practica p1= new Ejercicios_practica ();
		Ejercicio_2_3 p2= new Ejercicio_2_3();
		
		int[]a= {1,2,3,4,5,6,7,8,9,10};
		int m=2;
		int n=4;
		int p=10;
		System.out.println("Factorial de " + n + " es: " + p1.factorialRec(n));
		System.out.println("Factorial de " + n + " es: " + p1.factorialIter(n));
		System.out.println("Factorial de " + n + " es: " + p1.factorialIter(p));
		System.out.println("Factorial de " + n + " es: " + p1.factorialRec(p));
		
		System.out.println("Elevado de " + m+ " a la potencia "+ n + " es: " + p1.elevaRec(m,n));
		System.out.println("Elevado de " + m + " a la potencia "+ n + " es: " + p1.elevadoIter(m,n));
		
		System.out.println("El numero de Fibonacci en la posicion " + n + " es: " + p1.fibonacciRec(n));
		System.out.println("El numero de Fibonacci en la posicion " + 5 + " es: " + p1.fibonacciIter(5));
		System.out.println("Suma aritmetica de los " + 5 + " primeros términos es: " + p1.sumAritRec(5));
		System.out.println("Suma aritmetica de los " + p + " primeros términos es: " + p1.sumAritIter(p));
		System.out.println("Suma aritmetica de los " + p + " primeros términos es: " + p1.sumAritGauss(p));
		
		System.out.println("La suma de los elementos del array es: " + p2.sumaArrayIterativo(a));
		System.out.println("La suma de los elementos del array es: " + p2.sumaArrayRecursivo(a));

	}

}
