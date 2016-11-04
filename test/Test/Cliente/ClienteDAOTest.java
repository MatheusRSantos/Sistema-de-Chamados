package Test.Cliente;

import Persistencia.ClienteDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
