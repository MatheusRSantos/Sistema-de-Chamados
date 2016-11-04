/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Controle;

import Persistencia.ClienteDAO;
import controle.ControleClientes;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author 31550576
 */
public class ControleClienteTest {
    @Test
  public void testaIncluiUmClienteNovo(){
      Empresa empresa = new Empresa(1,"EvilCorp");
      ClienteEmpresa clienteEmpresa = new ClienteEmpresa(99,empresa,1111111,"Mr Robot",2222222);
      ControleClientes controle_clientes = new ControleClientes();
      assertEquals(true,controle_clientes.incluiNovoCliente(empresa, 0,clienteEmpresa.getNome(), 0) instanceof ClienteEmpresa);
      
  }
  
  @Test
  public void testaGetClienteDAO(){
      ClienteDAO dao = new ClienteDAO();
      ControleClientes cc = new ControleClientes();
      
      
      assertEquals(true,cc.getClienteDAO() instanceof ClienteDAO);
  }
    
}
