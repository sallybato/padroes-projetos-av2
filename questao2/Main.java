package questao2;

public class Main {
    public static void main(String[] args) {
        Ticket t = new Ticket("ABC-1234", 100); 

        System.out.println("--- Perfil Rotativo ---");
        t.setTarifa(new TarifaRotativo());
        t.imprimirValor(); 

        System.out.println("--- Perfil Mensalista ---");
        t.setTarifa(new TarifaMensalista());
        t.imprimirValor(); 

        System.out.println("--- Perfil Conveniado ---");
        t.setTarifa(new TarifaConveniado());
        t.imprimirValor(); 
    }
}