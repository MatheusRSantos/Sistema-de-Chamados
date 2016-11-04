/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Controle;

import controle.ControleChamados;
import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Tecnico;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

/**
 *
 * @author 31550576
 */
public class ControleChamadosTest {

    @Test
    public void AlterChamado() {
        Tecnico tecnico = new Tecnico("Mr Robot", 1);
        Empresa empresa = new Empresa(1, "EvilCorp");
        ClienteEmpresa cliente_empresa = new ClienteEmpresa(1, empresa, 111111, "", 22222222);
        Chamado chamado = new Chamado(1, "TestTitulo", "TestDesc", 9, tecnico, cliente_empresa, "SOTest", "SOVerTest", "ConecTest", "RedeTest");
        ControleChamados controleChamados = new ControleChamados();
        controleChamados.alterarChamado(chamado, "StatusTest", "CausaTest", "SolutionTest");
        assertEquals("StatusTest", chamado.getStatus());
        assertEquals("CausaTest", chamado.getCausaProblema());
        assertEquals("SolutionTest", chamado.getSolucaoProblema());
    }

    @Test
    public void GetChamado() {

        Tecnico tecnico = new Tecnico("TecTest", 1);
        Empresa empresa = new Empresa(1, "TestEmp");
        ClienteEmpresa cliente_empresa = new ClienteEmpresa(1, empresa, 111111, "", 22222222);
        Chamado chamado = new Chamado(1, "TestTitulo", "TestDesc", 9, tecnico, cliente_empresa, "SOTeste", "SOVerTest", "ConecTest", "RedeTest");

        ControleChamados controleChamados = new ControleChamados();
        controleChamados.setChamadoAlterado(chamado);
        assertSame(chamado, controleChamados.getChamadoAlterado());

    }
}


