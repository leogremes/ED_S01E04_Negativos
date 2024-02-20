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
		
		//CONDI��O DE PARADA -> primeira posi��o do vetor
		//CHAMADA DE PASSOS -> chamar a fun��o com o vetor 1 posi��o menor, passando a quantidade de n�meros negativos encontrados
		if (pos == 0) return qtd;
		return contarNegativos(arr, --pos, qtd);
	}
}
