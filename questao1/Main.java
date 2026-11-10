package questao1;
public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 10);
        
        AreaCompras compras = new AreaCompras();
        AreaVendas vendas = new AreaVendas();
        AreaAuditoria auditoria = new AreaAuditoria();

        p.adicionarObservador(compras);
        p.adicionarObservador(vendas);
        p.adicionarObservador(auditoria);

        System.out.println("--- Alterando para 4 ---");
        p.alterarEstoque(4); 

        System.out.println("--- Alterando para 0 ---");
        p.alterarEstoque(0); 

        System.out.println("--- Voltando para 5 ---");
        p.alterarEstoque(5); 

        System.out.println("--- Removendo Compras e alterando para 2 ---");
        p.removerObservador(compras);
        p.alterarEstoque(2); 
    }
}