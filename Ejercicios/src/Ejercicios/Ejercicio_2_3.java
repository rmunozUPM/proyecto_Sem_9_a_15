package Ejercicios;

public class Ejercicio_2_3 {

	public int sumaArrayIterativo (int[]array) throws Exception{
		if(array== null||array.length ==0)
			throw new Exception();
		int suma = 0;
		for(int i = 0; i<array.length;i++) {
			suma = suma +array[i];
		}
		return suma;
	}
	
	public int sumaArrayRecursivo(int[]array) throws Exception{
		return sumaArrayRecursivo(array,0);
		 
	}
	private int sumaArrayRecursivo(int[]a,int i) throws Exception{
		if(a== null||a.length ==0)
			throw new Exception();
		if( i == a.length-1)
			return a[i];
		return a[i]+ sumaArrayRecursivo(a,i+1);
	}
}
