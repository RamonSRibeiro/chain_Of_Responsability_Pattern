package padroescomportamentais.chainofresponsability;

public class AdministradorSistema extends Suporte {

    public AdministradorSistema(Suporte superior) {
        listaProblemas.add(TipoProblemaServidor.getTipoProblemaServidor());
        setSuporteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Administrador do sistema";
    }

}