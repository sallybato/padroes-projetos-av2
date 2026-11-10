package questao1;

public class AreaCompras implements ObservadorEstoque {
    @Override
    public void atualizar(String nomeProduto, int qtdAntiga, int qtdNova) {
        if(qtdNova < 5){
            System.out.println("ALERTA - COMPRAS: Estoque atual do produto " + 
            nomeProduto +" está crítico (" + qtdNova + ")");
        }
    }
}