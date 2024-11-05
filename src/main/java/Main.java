public class Main {
    public static void main(String[] args) {
        Caneta CanetaAzul = new Caneta();

        CanetaAzul.modelo = "BIC";
        CanetaAzul.ponta = 0.7f;
        CanetaAzul.cor = "Azul";
        CanetaAzul.carga = 57;
        CanetaAzul.tampada = false;

        CanetaAzul.Estado();
        CanetaAzul.Riscar();
    }
}
