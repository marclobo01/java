package trabalho_poo;

public class trabalho {
	
		public static void main(String[] args){
			System.out.println("ola mundo");
			
			
			class Conta{
				double saldo;
				String nome;
				
				double consultarSaldo() {
					return saldo;
				}
				
				void creditar(double v) {
					saldo = saldo + v;
				}
				
			}
			
			Conta c = new Conta();
			c.saldo = 300;
			c.nome = "Pedro";
			
			c.creditar(150);
			
			c.consultarSaldo();
			System.out.println(c.saldo);
		}

}
