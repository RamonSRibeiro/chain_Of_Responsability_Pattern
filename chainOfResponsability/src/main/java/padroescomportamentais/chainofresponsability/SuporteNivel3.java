package padroescomportamentais.chainofresponsability;

public class SuporteNivel3 extends Suporte {

    public SuporteNivel3(Suporte superior) {
        listaProblemas.add(TipoProblemaSoftware.getTipoProblemaSoftware());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte nível 3";
    }

}