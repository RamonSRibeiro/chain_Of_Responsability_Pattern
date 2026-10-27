package padroescomportamentais.chainofresponsability;

public class TipoProblemaSoftware implements TipoProblema {

    private static TipoProblemaSoftware tipoProblemaSoftware = new TipoProblemaSoftware();

    private TipoProblemaSoftware() {};

    public static TipoProblemaSoftware getTipoProblemaSoftware() {
        return tipoProblemaSoftware;
    }
}