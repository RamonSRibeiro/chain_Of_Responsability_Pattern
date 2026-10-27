package padroescomportamentais.chainofresponsability;

public class SuporteNivel2 extends Suporte {

    public SuporteNivel2(Suporte superior) {
        listaProblemas.add(TipoProblemaConexao.getTipoProblemaConexao());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte nível 2";
    }
}