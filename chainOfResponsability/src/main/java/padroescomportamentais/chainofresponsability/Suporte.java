package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Suporte {

    protected ArrayList listaProblemas = new ArrayList();
    private Suporte suporteSuperior;

    public Suporte getSuporteSuperior() {
        return suporteSuperior;
    }

    public void setSuporteSuperior(Suporte suporteSuperior) {
        this.suporteSuperior = suporteSuperior;
    }

    public abstract String getDescricaoCargo();

    public String atenderChamado(Chamado chamado) {
        if (listaProblemas.contains(chamado.getTipoProblema())) {
            return getDescricaoCargo();
        }
        else {
            if (suporteSuperior != null) {
                return suporteSuperior.atenderChamado(chamado);
            }
            else
            {
                return "Sem atendimento";
            }
        }
    }
}