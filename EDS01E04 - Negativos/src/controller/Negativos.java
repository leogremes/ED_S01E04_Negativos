package controller;

public class Negativos
{
	public Negativos() {
		super();
	}
	
	public int contarNegativos(int[] arr, int pos, int qtd)
	{		
		if (arr[pos] < 0)
			qtd++;
		
		//CONDIÇÃO DE PARADA -> primeira posição do vetor
		//CHAMADA DE PASSOS -> chamar a função com o vetor 1 posição menor, passando a quantidade de números negativos encontrados
		if (pos == 0) return qtd;
		return contarNegativos(arr, --pos, qtd);
	}
}
