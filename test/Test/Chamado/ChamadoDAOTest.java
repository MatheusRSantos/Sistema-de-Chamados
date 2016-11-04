/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Chamado;

import Persistencia.ChamadoDAO;
import entidade.Chamado;
import entidade.RegistroChamado;
import java.util.Collection;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31550576
 */
public class ChamadoDAOTest {
    
    @Test
    public void ConstructorChamadoDAO() {
        ChamadoDAO dao = new ChamadoDAO();
        HashMap<Integer, Chamado> cashChamado = new HashMap<>();
        HashMap<Integer, Chamado> cashRegistroChamado = new HashMap<>();
        assertNotNull(dao);
    }

    @Test
    public void GetChamadosTest() {
        ChamadoDAO dao = new ChamadoDAO();
        Collection<Chamado> chamados = dao.getChamados();
        assertNotNull(chamados);
    }

    @Test
    public void GetRegistrosNotNullTest() {
        ChamadoDAO dao = new ChamadoDAO();
        Collection<RegistroChamado> registros = dao.getRegistros();
        assertNotNull(registros);
    }
}