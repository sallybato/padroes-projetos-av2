package questao2;

public class TarifaMensalista implements TarifaStrategy {
    private static final double valorFixo = 200.0;

    @Override
    public double calcular(int tempoMinutos) {
        return valorFixo;
    }
}
