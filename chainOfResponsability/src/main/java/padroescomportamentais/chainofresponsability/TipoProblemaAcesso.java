package padroescomportamentais.chainofresponsability;

public class TipoProblemaAcesso implements TipoProblema {

    private static TipoProblemaAcesso tipoProblemaAcesso = new TipoProblemaAcesso();

    private TipoProblemaAcesso() {};

    public static TipoProblemaAcesso getTipoProblemaAcesso() {
        return tipoProblemaAcesso;
    }

}