package padroescomportamentais.chainofresponsability;

public class TipoProblemaServidor implements TipoProblema {

    private static TipoProblemaServidor tipoProblemaServidor = new TipoProblemaServidor();

    private TipoProblemaServidor() {};

    public static TipoProblemaServidor getTipoProblemaServidor() {
        return tipoProblemaServidor;
    }
}