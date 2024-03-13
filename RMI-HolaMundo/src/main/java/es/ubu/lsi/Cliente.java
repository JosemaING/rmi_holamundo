package es.ubu.lsi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Cliente remoto.
 */
public class Cliente {

	/**
	 * Constructor oculto,
	 */
	private Cliente() {
	}

	/**
	 * Método raíz.
	 *
	 * @param args host con el registro
	 */
	public static void main(String[] args) {

		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			// Resuelve el objeto remoto (la referencia a...)
			HolaMundo stub = (HolaMundo) registry.lookup("Hola");
			// llamada al metodo remoto decirHola()
			String respuesta = stub.decirHola();
			System.out.println("Respuesta del servidor remoto: " + respuesta);
			// llamada al metodo remoto decirFecha()
			String respuesta1 = stub.decirFecha();
			System.out.println("Respuesta del servidor remoto: " + respuesta1);
			// llamada al metodo remoto decirEstadoServidor()
			String respuesta2 = stub.decirEstadoServer();
			System.out.println("Respuesta del servidor remoto: " + respuesta2);
		} catch (Exception e) {
			System.err.println("Excepción en cliente: " + e.toString());
		} // try

	} // main

} // Cliente