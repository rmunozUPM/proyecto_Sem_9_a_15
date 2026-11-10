package Ejercicios;

public class Ejercicios_practica {

	public int factorialRec (int n) throws Exception {
		if(n<0) 
			throw new Exception();
		if(n==0)
			return 1;
		if(n==1)
			return 1;
		
		return n*factorialRec(n-1);
	}
	
	public int factorialIter(int n) throws Exception{
		if(n<0)
			throw new Exception();
		if(n==0)
			return 1;
		
		int factorial = 1;
		for(int i=1; i<=n; i++) {
			factorial = factorial *i;
		}
		return factorial;
	}
	
	public double elevaRec(double m, int n) throws Exception{
		if(n<0)
			throw new Exception();
		
		if(n==0)
		 return 1;
		
		return m*elevaRec(m,n-1);
	}
	public double elevadoIter(double m, int n) throws Exception{
		if(n<0)
			throw new Exception();
		if(n==0)
			return 1;
		
		int elevado = 1;
		for(int i=1; i<=n; i++) {
			elevado = (int) (elevado * m);
		}
		return elevado;
	}
	
	public int fibonacciRec ( int n) throws Exception{
		if(n<0)
			throw new Exception ();
		
		if( n==0)
			return 0;
		if(n == 1)
			return 1;
		
		return fibonacciRec (n-1)+ fibonacciRec(n-2);
	}
	public int fibonacciIter ( int n) throws Exception{
		if(n<0)
			throw new Exception ();
		
		int[]numeros = new int[n];
		numeros[0]=1;
		numeros[1]=1;
		for(int i =2; i<numeros.length; i++) {
			numeros[i] = numeros[i-1]+numeros[i-2];
		}
		
		return numeros[n-1];
	}
	public int sumAritRec (int n) throws Exception{
		if(n<0)
			throw new Exception();
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return n+ sumAritRec(n-1);
	 }
	public int sumAritIter ( int n) throws Exception{
		if( n <0)
			throw new Exception ();
		int suma= 0;
		for(int i=0; i<=n; i++) 
			suma = suma +i;
		return suma;
		}
	public int sumAritGauss ( int n) throws Exception{
		return  ((n+1)*n)/2;
		}
	}


