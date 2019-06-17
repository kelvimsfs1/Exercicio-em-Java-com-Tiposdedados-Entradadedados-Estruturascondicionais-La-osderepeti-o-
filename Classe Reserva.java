'''package trab;

import java.util.ArrayList;

public class Reserva {

	public static void main(String[] args) {
		
	}
		
		private String local;

		private int checkIn;

		private int checkOut;

		private int hospedes;

		private String tipoAcomodacao;

		private int data;

		private float preco;

		private String tipoViagem;

		private String reservaInstantanea;

		private String maisFiltro;

		private int quantidadeHospedes;

		private String tipoHospedes;

		private String destino;
		
		ArrayList<Pessoa> lista ;
		Imovel imovel;
		
		public Reserva() {
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

		public void setLocal(String local) {
	        this.local = local;

		}

		public String getLocal() {
			return local;
		}

		public void setCheckIn(int checkIn) {
	        this.checkIn = checkIn;
		}

		public int getCheckIn() {
			return checkIn;
		}

		public void setCheckOut(int checkOut) {
	        this.checkOut = checkOut;
		}

		public int getCheckOut() {
			return checkOut;
		}

		public void setHospedes(int hospedes) {
	        this.hospedes = hospedes;
		}

		public int getHospedes() {
			return hospedes;
		}

		public void setTipoAcomodacao(String tipoAcomodacao) {
	        this.tipoAcomodacao = tipoAcomodacao;
		}

		public String getTipoAcomodacao() {
			return tipoAcomodacao;
		}

		public void setData(int data) {
	        this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setPreco(float preco) {
	        this.preco = preco;
		}

		public float getPreco() {
			return preco;
		}

		public void setTipoViagem(String tipoViagem) {
	        this.tipoViagem = tipoViagem;
		}

		public String getTipoViagem() {
			return tipoViagem;
		}

		public void setReservaInstantanea(String reservaInstantanea) {
	         this.reservaInstantanea = reservaInstantanea;
		}

		public String getReservaInstantanea() {
			return reservaInstantanea;
		}

		public void setMaisFiltro(String maisFiltro) {
	        this.maisFiltro =  maisFiltro;
		}

		public String getMaisFiltro() {
			return maisFiltro;
		}

		public void setQuantidadeHospedes(int quantidadeHospedes) {
	        this.quantidadeHospedes = quantidadeHospedes;
		}

		public int getQuantidadeHospedes() {
			return quantidadeHospedes;
		}

		public void setTipoHospedes(String tipoHospedes) {
	        this.tipoHospedes = tipoHospedes;
		}

		public String getTipoHospedes() {
			return tipoHospedes;
		}

		public void setDestino(String destino) {
	        this.destino = destino;
		}

		public String getDestino() {
			return destino;
		}

		public void adicionarReserva() {

		}

		public void consultarReserva() {

		}

		public void alterarReserva() {

		}

		public void excluirReserva() {

		}

	{


	}

}
'''
