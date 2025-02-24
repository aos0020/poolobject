/**
 * 
 */
package ubu.gii.dass.c01;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;



/**
 * @author alumno
 *
 */
public class ReusablePoolTest {

	private static ReusablePool pool;
	
	@BeforeAll
	//@BeforeEach
	public static void setUp(){
		//Obtenemos la instancia de Pool.
		pool = ReusablePool.getInstance();
	}

	
	@AfterAll
	//@AfterEach
	public static void tearDown() throws Exception {
		pool = null;

	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.

	 *   
	 */
        @Test
        @DisplayName("testGetInstance")
        @Disabled("Not implemented yet")
	public void testGetInstance() {
            // Obtenemos la primera instancia
            ReusablePool instance1 = ReusablePool.getInstance();
            assertNotNull(instance1, "La primera instancia no debería ser null");

            // Obtenemos una segunda instancia
            ReusablePool instance2 = ReusablePool.getInstance();
            assertNotNull(instance2, "La segunda instancia no debería ser null");

            // Verificamos que ambas instancias son la misma (patrón Singleton)
            assertSame(instance1, instance2, "Ambas instancias deberían ser la misma (Singleton)");

            // Verificamos que el pool tiene el tamaño correcto (2 en este caso)
            try {
                Reusable r1 = instance1.acquireReusable();
                assertNotNull(r1, "Debería poder adquirir el primer objeto");

                Reusable r2 = instance1.acquireReusable();
                assertNotNull(r2, "Debería poder adquirir el segundo objeto");

                // Intentar adquirir un tercer objeto debería lanzar una excepción
                assertThrows(NotFreeInstanceException.class, () -> instance1.acquireReusable(),
                             "Debería lanzar NotFreeInstanceException al intentar adquirir un tercer objeto");

                // Liberamos los objetos para dejar el pool en su estado original
                instance1.releaseReusable(r1);
                instance1.releaseReusable(r2);
            } catch (Exception e) {
                fail("No deberían ocurrir excepciones durante la prueba de tamaño del pool: " + e.getMessage());
            }		
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 * 	 Debe retornar un objeto reusable disponible en el pool
	 *   Si no hay objetos de la instancia poolobjet disponibles,debe notificarlo.
	 *   En la clase principal crea dos instancias.
	 */
	@Test
        @DisplayName("testAcquireReusable")
       // @Disabled("Not implemented yet")

	public void testAcquireReusable() {
		try {
        // Adquirir 2 objetos (el pool tiene tamaño 2)
        Reusable r1 = pool.acquireReusable();
        assertNotNull(r1, "El primer objeto no debería ser null");

        Reusable r2 = pool.acquireReusable();
        assertNotNull(r2, "El segundo objeto no debería ser null");

        // Intentar adquirir un tercer objeto debería fallar
        assertThrows(NotFreeInstanceException.class, () -> pool.acquireReusable(),
                     "No debería haber más objetos disponibles");

        // Liberamos uno de los objetos adquiridos
        pool.releaseReusable(r1);

        // Adquirimos de nuevo (debería ser el mismo que liberamos)
        Reusable r3 = pool.acquireReusable();
        assertNotNull(r3, "Después de liberar, debería poder adquirir un objeto nuevamente");
        assertEquals(r1, r3, "El objeto reutilizado debería ser el mismo que se liberó");

    } catch (Exception e) {
        fail("No debería lanzarse una excepción inesperada: " + e.getMessage());
		
	}
	}
	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
        @DisplayName("testReleaseReusable")
        @Disabled("Not implemented yet")
	public void testReleaseReusable() {
		
	}

}

