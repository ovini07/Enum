package Enum;

public class PrincipalPedido {

	public static void main(String[] args) {
	StatusPedido status = StatusPedido.ABERTO;
	StatusPedido status1 = StatusPedido.CANCELADO;
	StatusPedido status2 = StatusPedido.EM_ANDAMENTO;
	StatusPedido status3 = StatusPedido.ENTREGUE;
	System.out.println (status);
	System.out.println (status1);
	System.out.println (status2);
	System.out.println (status3);

	}

}
