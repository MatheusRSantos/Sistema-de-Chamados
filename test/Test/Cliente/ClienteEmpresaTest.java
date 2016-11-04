/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Cliente;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author 31550576
 */
public class ClienteEmpresaTest {
    
    public ClienteEmpresaTest() {
    }
    
    @Test
    public void Cod(){
        Empresa empresa = new Empresa(1,"EmpTest");
        ClienteEmpresa cliente_empresa = new ClienteEmpresa(99,empresa,111,"EvilCorp",4534);
        cliente_empresa.setCodigo(-13);
        assertNotNull(cliente_empresa.getCodigo());
        
    }

   
}

