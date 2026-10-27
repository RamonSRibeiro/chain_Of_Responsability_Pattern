package padroescomportamentais.chainofresponsability;

public class AtendenteSuporte extends Suporte {

    public AtendenteSuporte(Suporte superior) {
        listaProblemas.add(TipoProblemaAcesso.getTipoProblemaAcesso());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente de suporte";
    }

}