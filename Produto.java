import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

public class Produto {
	private String Nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	//GET
		public String getNome() {
			return Nome;
		}
		
		public double getPrecoCusto() {
			return precoCusto;
		}
		
		public double getPrecoVenda() {
			return precoVenda;
		}
		
		public double getMargemLucro() {
			return margemLucro;
		}
	
	//SET
		public void setNome(String Nome) {
			this.Nome = Nome;
		}
		
		public void setPrecoCusto(double precoCusto) {
			this.precoCusto = precoCusto;
		}
		
		public void setPrecoVenda(double precoVenda) {
			this.precoCusto = precoVenda;
			}
		
		public void setmargemLucro(double margemLucro) {
			this.margemLucro = margemLucro;
		}
		
		//CALCULOS
		
		public void calcularMargemLucro() {
			this.margemLucro = this.precoVenda - this.precoCusto;
		}
		
		public double getMargemLucroPercentual() {
			
			return margemLucro/(precoCusto / 100);
			
		}
		
		public void informacaoProduto() {
			System.out.println("Nome do produto: "+this.getNome());
			System.out.println("Valor do custo do produto: R$"+df.format(this.getPrecoCusto()));
			System.out.println("Valor de venda do produto: R$"+df.format(this.getPrecoVenda()));
			System.out.println("Margem de lucro do produto: R$"+df.format(this.getMargemLucro()));
			System.out.println("Percentual da margem de lucro: "+df.format(this.getMargemLucroPercentual())+"%");
		}
}
