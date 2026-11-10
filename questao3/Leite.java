package questao3;

public class Leite extends ComplementoDecorator{
    public Leite(Bebida bebida){
         super(bebida); 
        }
    @Override
    public String getDescricao(){
         return super.getDescricao() + ", com Leite"; 
        }
    @Override
    public double getPreco(){
         return super.getPreco() + 2.0; 
        }
}