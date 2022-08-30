package developers3x2.proyecto;


import developers3x2.proyecto.entidad.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);

		Enterprise bancolombia = new Enterprise(2, "Bancolombia", "34.234.345", "312 344 2345", "cqaler 123", true);
		Usuario usuario = new Usuario(1, "admin@banclombia.com", RoleName.Admin, bancolombia, true);
		Profile perfil = new Profile("1", "fdsf.jpg","324342342", usuario, true);
		Transaction movimiento = new Transaction(12, "compra de equipos", 32434.4, usuario, bancolombia, true);
		System.out.println("\n"+bancolombia.toString());

		bancolombia.addUsers(usuario);
		bancolombia.addTransaction(movimiento);
		usuario.setEmail("juanito@tutu.com");
		bancolombia.setAddress("crr 35 #45 66");
		System.out.println("\n"+bancolombia.toString());
	}


}
