/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Tecnico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */
public class ChamadoTest {
    
    public ChamadoTest() {
    }
    
 
    @Test
    public void testConstructorPriority(){
            Tecnico tecnico = new Tecnico("TecTeste",1);
            Empresa empresa = new Empresa(1,"TestEmp");
            ClienteEmpresa cliente_empresa= new ClienteEmpresa(1,empresa,222222,"",1111111);
            Chamado chamado = new Chamado(1,"TestTitulo","TestDesc",-4,tecnico,cliente_empresa,"SOTeste","SOVerTest","ConecTest","RedeTest");
            assertNotNull(chamado);
        
    }
    @Test
    public void testaConstructorCod(){
        Tecnico tecnico = new Tecnico("TecTest",1);
            Empresa empresa = new Empresa(1,"TestEmp");
            ClienteEmpresa cliente_empresa= new ClienteEmpresa(1,empresa,222222,"",1111111);
            Chamado chamado = new Chamado(-1,"TestTitulo","TestDesc",6,tecnico,cliente_empresa,"SOTeste","SOVerTest","ConecTest","RedeTest");
            assertNotNull(chamado);
    }
}
