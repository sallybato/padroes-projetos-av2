package questao1;
public class AreaVendas implements ObservadorEstoque {
    @Override
    public void atualizar(String nomeProduto, int qtdAntiga, int qtdNova) {

        if(qtdAntiga == 0 && qtdNova >0){
            System.out.println("ALERTA - VENDAS: O produto " + nomeProduto + " voltou ao estoque!");
        }
    }
}
