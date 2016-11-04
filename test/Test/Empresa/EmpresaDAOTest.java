/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Empresa;

import Persistencia.EmpresaDAO;
import entidade.Empresa;
import java.util.Collection;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author 31550576
 */
public class EmpresaDAOTest {
    @Test
   public void GetEmpresasTest(){
       EmpresaDAO dao = new EmpresaDAO();
       Collection<Empresa> empresas = dao.getEmpresas();
       assertNotNull(empresas);
   }
   
   @Test
   public void EmpresaTest(){
       EmpresaDAO dao = new EmpresaDAO();
       assertNotNull(dao.voltaEmpresa());
   }
   
   @Test 
   public void EmpresaDAOConstructTest(){
       EmpresaDAO dao = new EmpresaDAO();
       assertNotNull(dao);
   }
}
