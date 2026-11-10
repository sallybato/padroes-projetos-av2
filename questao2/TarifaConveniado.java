package questao2;

public class TarifaConveniado implements TarifaStrategy {
    private static final double valorHora = 10.0;
    private static final double desconto = 0.20; 

    @Override
    public double calcular(int tempoMinutos) {
        if (tempoMinutos <= 30) {
            return 0.0; 
        }
        int minutosExcedentes = tempoMinutos - 30;
        int horas = (int) Math.ceil(minutosExcedentes / 60.0);
        double valorBruto = horas * valorHora;
        return valorBruto * (desconto); 
    }
}

