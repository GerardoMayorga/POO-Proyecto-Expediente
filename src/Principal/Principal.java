package Principal;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		/*Denunciado denunciado = new Denunciado();
		Ofendido ofendido = new Ofendido();
		Testigo testigo = new Testigo();*/
		
		boolean centinelaPrincipal = true;
		boolean centinelaDenunciado = true;
		boolean centinelaOfendido = true;
		boolean centinelaTestigo = true;
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		int agregarDenunciado;
		
		LinkedList<Expediente> lstExpediente = new LinkedList<>();
		
		while(centinelaPrincipal) {
		
		System.out.println("Bienvenido\nSeleccione la accion a realizar:");
		
		System.out.println("1. Crear nuevo expediente");
		System.out.println("2. Ver expediente");
		System.out.println("3. Eliminar expediente");
		System.out.println("4. Salir");
		
		i = Integer.parseInt(sc.nextLine());
		
		switch(i){
			
			case 1:
				
				Expediente expediente = new Expediente();
				
			while (centinelaDenunciado) {
				
				System.out.println("Ingrese el nombre del denunciado");
				String nombreDenunciado = sc.nextLine();
				System.out.println("Ingrese el sexo del denunciado");
				String sexoDenunciado = sc.nextLine();
				System.out.println("Ingrese numero de indentidad del denunciado");
				String numIdentidadDenunciado = sc.nextLine();
				System.out.println("Ingrese la direccion del denunciado");
				String direccionDenunciado = sc.nextLine();
				System.out.println("Ingrese la descripcion del denunciado");
				String descripcionDenunciado = sc.nextLine();
				
				Denunciado denunciado = new Denunciado(nombreDenunciado, sexoDenunciado, numIdentidadDenunciado,
						direccionDenunciado, descripcionDenunciado);
				
				expediente.setDenunciado(denunciado);
				
				System.out.println("Agregar denunciado?");
				System.out.println("1. Si   2. No");
				agregarDenunciado = Integer.parseInt(sc.nextLine());
				
				
				if(agregarDenunciado != 1) {
					centinelaDenunciado = false;
				}
				
			}
			
			
				System.out.println("\nIngrese el nombre del denunciante");
				String nombreDenunciante = sc.nextLine();
				System.out.println("Ingrese el sexo del denunciante");
				String sexoDenunciante = sc.nextLine();
				System.out.println("Ingrese numero de indentidad del denunciante");
				String numIdentidadDenunciante = sc.nextLine();
				System.out.println("Ingrese la nacionalidad del denunciante");
				String nacionalidadDenunciante = sc.nextLine();
				System.out.println("Ingrese la direccion del denunciante");
				String direccionDenunciante = sc.nextLine();
				System.out.println("Ingrese el telefono del denunciante");
				String telefonoDenunciante = sc.nextLine();
				
				Denunciante denunciante = new Denunciante(nombreDenunciante, sexoDenunciante, numIdentidadDenunciante,
						nacionalidadDenunciante, direccionDenunciante, telefonoDenunciante);
				
				expediente.setDenunciante(denunciante);
				
				System.out.println("\nEs el denunciante un ofendido?");
				System.out.println("1. Si   2. No");
				int esOfendido = Integer.parseInt(sc.nextLine());
				
				if (esOfendido == 1) {

					Ofendido ofendido = new Ofendido(nombreDenunciante, sexoDenunciante, numIdentidadDenunciante,
							nacionalidadDenunciante, direccionDenunciante, telefonoDenunciante);

					expediente.setOfendido(ofendido);

				} else {

					while (centinelaOfendido) {
						
						System.out.println("\nIngrese el nombre del ofendido");
						String nombreOfendido = sc.nextLine();
						System.out.println("Ingrese el sexo del ofendido");
						String sexoOfendido = sc.nextLine();
						System.out.println("Ingrese numero de indentidad del ofendido");
						String numIdentidadOfendido = sc.nextLine();
						System.out.println("Ingrese la nacionalidad del ofendido");
						String nacionalidadOfendido = sc.nextLine();
						System.out.println("Ingrese la direccion del ofendido");
						String direccionOfendido = sc.nextLine();
						System.out.println("Ingrese el telefono del ofendido");
						String telefonoOfendido = sc.nextLine();
						
						Ofendido ofendido = new Ofendido(nombreOfendido, sexoOfendido, numIdentidadOfendido,
								nacionalidadOfendido, direccionOfendido, telefonoOfendido);
						
						expediente.setOfendido(ofendido);
						
						System.out.println("Agregar ofendido?");
						System.out.println("1. Si   2. No");
						int agregarOfendido = Integer.parseInt(sc.nextLine());
						
						if(agregarOfendido != 1) {
							centinelaOfendido = false;
						}
					}
				} 
			
			System.out.println("¿Hay testigos?");
				System.out.println("1. Si   2. No");
				int testigos = Integer.parseInt(sc.nextLine());
				
				if(testigos == 1) {
					
					while (centinelaTestigo) {
						System.out.println("\nIngrese el nombre del testigo");
						String nombreTestigo = sc.nextLine();
						System.out.println("Ingrese el sexo del testigo");
						String sexoTestigo = sc.nextLine();
						System.out.println("Ingrese numero de indentidad del testigo");
						String numIdentidadTestigo = sc.nextLine();
						System.out.println("Ingrese la nacionalidad del testigo");
						String nacionalidadTestigo = sc.nextLine();
						System.out.println("Ingrese la direccion del testigo");
						String direccionTestigo = sc.nextLine();
						System.out.println("Ingrese el telefono del testigo");
						String telefonoTestigo = sc.nextLine();
						
						Testigo testigo = new Testigo(nombreTestigo, sexoTestigo, numIdentidadTestigo, nacionalidadTestigo,
								direccionTestigo, telefonoTestigo);
						
						expediente.setTestigo(testigo);
						
						System.out.println("Agregar testigo?");
						System.out.println("1. Si   2. No");
						int agregarTestigo = Integer.parseInt(sc.nextLine());
						
						if(agregarTestigo != 1) {
							centinelaTestigo = false;
						}
						
					}
					
				}
				
				System.out.println("Delitos a denunciar:");
				System.out.println("Seleccione el numero que indica el delito, si hay mas de uno escriba los numeros separados por coma.");
				System.out.println("1. Robo  2. Homicidio  3. Asesinato  4. Amenaza  5. Agresion  6. Fraude");
				String delitos = sc.nextLine();
				
				LinkedList<String> lstDelitos = new LinkedList<>();
				
				String [] del = delitos.split(",");
				
				for (String val : del) {
					switch(val) {
					 case "1":
						lstDelitos.add("Robo");
						break;
						
					 case "2":
						 lstDelitos.add("Homicidio");
						 break;
						 
					 case "3":
						 lstDelitos.add("Asesinato");
						 break;
						 
					 case "4":
						 lstDelitos.add("Amenaza");
						 break;
						 
					 case "5":
						 lstDelitos.add("Agresión");
						 break;
					
					 case "6":
						 lstDelitos.add("Fraude");
						 break;
						 
					}
				}
				
				expediente.setDelitos(lstDelitos);
				
				System.out.println("Describa como ocurrieron los hechos: ");
				String descripcion = sc.nextLine();
				
				expediente.setDescripcion(descripcion);
				
				System.out.println("Ingrese la fecha: ");
				String fecha = sc.nextLine();
				
				expediente.setFecha(fecha);
				
				lstExpediente.add(expediente);
				
				break;
			
				
			case 2:
				
				System.out.println(lstExpediente);
/*				System.out.println(expediente.toString());
				System.out.println(expediente.getDescripcion());
*/				
				
				break;
				
			case 4:
				
				centinelaPrincipal = false;
				
				break;
				
			}
		

		}
	}

}
