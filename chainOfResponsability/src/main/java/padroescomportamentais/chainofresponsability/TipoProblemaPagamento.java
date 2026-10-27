package padroescomportamentais.chainofresponsability;

public class TipoProblemaPagamento implements TipoProblema {

    private static TipoProblemaPagamento tipoProblemaPagamento = new TipoProblemaPagamento();

    private TipoProblemaPagamento() {};

    public static TipoProblemaPagamento getTipoProblemaPagamento() {
        return tipoProblemaPagamento;
    }
}