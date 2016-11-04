/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Cliente;

import Persistencia.ClienteDAO;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author 31550576
 */
public class ClienteDAOTest {
    
   @Test
   public void CPF(){
       ClienteDAO dao = new ClienteDAO();
       assertTrue(dao.validarCPF(1111111111));
       
   }
   
   @Test 
   public void Cash(){
       ClienteDAO dao = new ClienteDAO();
       assertNotNull(dao.voltaCashCliente());
   }
   
   @Test
   public void GenerateCod(){
      ClienteDAO dao = new ClienteDAO();
      assertNotNull(dao.gerarCodigo());
   }

  
}
