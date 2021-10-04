/**
 * 
 */
package TiendaWeb55_GroupG.TiendaWeb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kthor
 *
 */

@RestController
public class Controller {

	@RequestMapping("/hola")
	public String saludar() {
		return "Esto es una prueba de Spring Boot";
	}
	
}
