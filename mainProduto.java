import java.util.Scanner;

public class mainProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto Produto = new Produto();
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double precoCusto;
		double precoVenda;
		
		System.out.println("Digite o nome do produto");
		nome = sc.nextLine();
		

		do {
		System.out.println("ATENÇÃO : o preÃ§o de venda deverÃ¡ ser maior que o custo");	
			
		System.out.println("Digite o preco de custo do produto");
		precoCusto = sc.nextDouble();
		
		System.out.println("Digite o preco de venda do produto");
		precoVenda = sc.nextDouble();
		
		}while(precoCusto >= precoVenda);
		
		
		Produto.setNome(nome);
		Produto.setPrecoCusto(precoCusto);
		Produto.setPrecoVenda(precoVenda);
		
		Produto.calcularMargemLucro();
		Produto.getMargemLucroPercentual();
		
		Produto.informacaoProduto();

	}

}
