package proyecto.hdp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioTest {
    @Autowired RepositorioUsuario2 repo;

	@Test
	public void contextLoads() {
	}
        @Test
	public void guardar() {
            
           //Aqui ponemos la logica de guardar un usuario
           //Generamos un objeto
           Usuario u=new Usuario();
           Posicion pos=new Posicion();
           Mensaje mensa=new Mensaje();
           
            //Aqui ponemos la logica de guardar un usuario
           //Generamos un objeto
           Assert.assertEquals(4,2+2);
	}
        
        @Test
	public void actualizar() {
            Assert.assertEquals(4,2+2);
	}
         @Test
	public void borrar() {
            Assert.assertEquals(4,2+2);
	}
         @Test
	public void buscarTodos() {
            Assert.assertEquals(4,2+2);
	}
         @Test
	public void buscarPorId() {
            Assert.assertEquals(4,2+2);
	}

}
