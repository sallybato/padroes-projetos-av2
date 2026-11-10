package questao3;

public class Calda extends ComplementoDecorator {
    public Calda(Bebida bebida){
         super(bebida); 
        }
    @Override
    public String getDescricao(){
         return super.getDescricao() + ", com Calda";
        }
    @Override
    public double getPreco(){
         return super.getPreco() + 1.5; 
        }
}