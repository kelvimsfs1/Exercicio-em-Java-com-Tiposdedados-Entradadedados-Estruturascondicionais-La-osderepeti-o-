'''package trab;

import java.sql.Date;

public class Reserva1 {

	public static void main(String[] args) {
		
		    Reserva reserva1=new Reserva();
		    reserva1.setLocal("Joinville");
		    reserva1.setCheckIn(13062019);
		    reserva1.setCheckOut(14062019);
		    reserva1.setHospedes(2);
		    reserva1.setTipoAcomodacao("casa");
            reserva1.setData(15062019);
            reserva1.setPreco(150);
            reserva1.setTipoViagem("traballho");
            reserva1.setReservaInstantanea("não");
            reserva1.setTipoHospedes("adultos");
            reserva1.setDestino("Joinville-sc");
            
		    
			Imovel imovel1=new Imovel();
	        imovel1.setnumeroComodos(2);
	        imovel1.setquantidadeHospedes(2);
	        imovel1.setcidade("Joinville");
	        imovel1.setestado("Santa Catarina");
	        imovel1.setnumeroCamas(2);
	        imovel1.setnumeroBanheiros(2);
	        imovel1.setReserva(reserva1);
		
		
		 	Pessoa pessoas = new Pessoa();
            pessoas.setEnderecoEmail("joao@gmail.com");
            pessoas.setNome("Joao");
            pessoas.setSobreNome("silva");
            pessoas.setSenha("123");
            pessoas.setDataNascimento(new Date(05/06/2019));
            pessoas.setImovel(imovel1);
            imovel1.adicionarPessoa(pessoas);;
            
            Pessoa pessoas1 = new Pessoa();
            pessoas1.setEnderecoEmail("jose@gmail.com");
            pessoas1.setNome("Jose");
            pessoas1.setSobreNome("silva");
            pessoas1.setSenha("123");
            pessoas1.setDataNascimento(new Date(05/06/2019));
            pessoas1.setImovel(imovel1);
            imovel1.adicionarPessoa(pessoas1);;
            
            
            System.out.println(pessoas.getNome());
            System.out.println(pessoas.getImovel().getcidade());
            System.out.println(pessoas1.getNome());
            System.out.println(pessoas1.getImovel().getcidade());

            
            
	}

}
'''
