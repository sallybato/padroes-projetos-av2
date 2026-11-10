package questao3;

public class Chantilly extends ComplementoDecorator {
    public Chantilly(Bebida bebida){
         super(bebida); 
        }
    @Override
    public String getDescricao(){
         return super.getDescricao() + ", com Chantilly"; 
        }
    @Override
    public double getPreco(){
         return super.getPreco() + 3.0; 
        }
}
