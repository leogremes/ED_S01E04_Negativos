package view;

import controller.Negativos;

public class Principal
{
	public static void main(String[] args)
	{
		int[] arr = {-10, -21, 10, -5, 4, 3};
		int pos = arr.length - 1;
		
		Negativos neg = new Negativos();
		
		System.out.println(neg.contarNegativos(arr, pos, 0));
	}
}
