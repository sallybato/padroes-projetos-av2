package questao2;

public class TarifaRotativo implements TarifaStrategy {
    private static final double valorHora = 10.0;

    @Override
    public double calcular(int tempoMinutos) {
        int horas = (int) Math.ceil(tempoMinutos / 60.0); 
        return horas * valorHora;
    }
}

