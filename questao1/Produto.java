package questao1;

import java.util.ArrayList;
import java.util.List;


public class Produto {
    private String nome;
    private int quantidade;
    private List<ObservadorEstoque> observadores = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public void adicionarObservador(ObservadorEstoque obs){
         observadores.add(obs); 
        }
    public void removerObservador(ObservadorEstoque obs){
        observadores.remove(obs);
    }    

   public void alterarEstoque(int novaQuantidade){
        if(this.quantidade != novaQuantidade){
            int qtdAntiga = this.quantidade;
            this.quantidade = novaQuantidade;
            notificarObservadores(qtdAntiga, novaQuantidade);
        }
   }
   private void notificarObservadores(int qtdAntiga, int qtdNova){
    for (ObservadorEstoque obs : observadores){
        obs.atualizar(this.nome,qtdAntiga,qtdNova);
    }
   }

}