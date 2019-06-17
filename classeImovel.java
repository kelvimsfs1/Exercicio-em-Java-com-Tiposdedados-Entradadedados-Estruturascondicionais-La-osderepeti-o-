'''package trab;

import java.util.ArrayList;

public class Imovel {

	public static void main(String[] args) {
		
	}
		
		private int numeroComodos;

		private int quantidadeHospedes;

		private String cidade;

		private String estado;

		private int numeroCamas;

		private int numeroBanheiros;

		private int endereco;
 
		private String tipoAluguel;
		
		private ArrayList<Pessoa> lista;
		private Reserva reserva;
		
		public Imovel() {
			lista= new ArrayList<Pessoa>();
		}
		
		public void adicionarPessoa(Pessoa pessoas){
			lista.add(pessoas);
		}
		
		public int quantidadePessoa(){
			return lista.size();
			
		}
		
		public void removerPessoa (Pessoa pessoas) {
			lista.remove(pessoas);
		}
		
		public Pessoa gePessoa(int posicao){
			return lista.get(posicao);
		}
		
		public Reserva getReserva() {
			return reserva;
		}

		public void setReserva(Reserva reserva) {
			this.reserva = reserva;
		}

		public int getnumeroComodos() {
			return numeroComodos;
		}

		public void setnumeroComodos(int numeroComodos) {
			this.numeroComodos = numeroComodos;
		}

		public int getquantidadeHospedes() {
			return quantidadeHospedes;
		}

		public void setquantidadeHospedes(int quantidadeHospedes) {
	                this.quantidadeHospedes = quantidadeHospedes;

		}

		public String getcidade() {
			return cidade;
		}

		public void setcidade(String cidade) {
	               this.cidade = cidade;
		}

		public String getestado() {
			return estado;
		}

		public void setestado(String estado) {
	                this.estado = estado;
		}

		public int getnumeroCamas() {
			return numeroCamas;
		}

		public void setnumeroCamas(int numeroCamas) {
	                this.numeroCamas = numeroCamas;
		}

		public int getnumeroBanheiros() {
			return numeroBanheiros;
		}

		public void setnumeroBanheiros(int numeroBanheiros) {
	        this.numeroBanheiros = numeroBanheiros;
		}

		public int getendereco() {
			return endereco;
		}

		public void setendereco(int endereco) {
	         this.endereco = endereco;
		}

		public String gettipoAluguel() {
			return tipoAluguel;
		}

		public void settipoAluguel(String tipoAluguel) {
	               this.tipoAluguel = tipoAluguel;
		}

		{


	}

}'''
