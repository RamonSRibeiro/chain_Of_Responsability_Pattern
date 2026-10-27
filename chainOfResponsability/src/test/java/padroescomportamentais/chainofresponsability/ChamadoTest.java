package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    AdministradorSistema administrador;
    SuporteNivel3 nivel3;
    SuporteNivel2 nivel2;
    AtendenteSuporte atendente;

    @BeforeEach
    void setUp() {
        administrador = new AdministradorSistema(null);
        nivel3 = new SuporteNivel3(administrador);
        nivel2 = new SuporteNivel2(nivel3);
        atendente = new AtendenteSuporte(nivel2);
    }

    @Test
    void deveRetornarAtendenteParaAtendimentoAcesso() {
        assertEquals("Atendente de suporte", atendente.atenderChamado(new Chamado(TipoProblemaAcesso.getTipoProblemaAcesso())));
    }

    @Test
    void deveRetornarNivel2ParaAtendimentoConexao() {
        assertEquals("Suporte nível 2", atendente.atenderChamado(new Chamado(TipoProblemaConexao.getTipoProblemaConexao())));
    }

    @Test
    void deveRetornarNivel3ParaAtendimentoSoftware() {
        assertEquals("Suporte nível 3", atendente.atenderChamado(new Chamado(TipoProblemaSoftware.getTipoProblemaSoftware())));
    }

    @Test
    void deveRetornarAdministradorParaAtendimentoServidor() {
        assertEquals("Administrador do sistema", atendente.atenderChamado(new Chamado(TipoProblemaServidor.getTipoProblemaServidor())));
    }

    @Test
    void deveRetornarSemAtendimentoParaAtendimentoPagamento() {
        assertEquals("Sem atendimento", atendente.atenderChamado(new Chamado(TipoProblemaPagamento.getTipoProblemaPagamento())));
    }

}