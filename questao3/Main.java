package questao3;

public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Espresso();
        System.out.println(pedido1.getDescricao() + " = R$ " + pedido1.getPreco());

        Bebida pedido2 = new Cha();
        pedido2 = new Leite(pedido2);      
        pedido2 = new Chantilly(pedido2);  
        System.out.println(pedido2.getDescricao() + " = R$ " + pedido2.getPreco());

        Bebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3); 
        pedido3 = new Leite(pedido3); // leite em dobro prof
        System.out.println(pedido3.getDescricao() + " = R$ " + pedido3.getPreco());
    }
}