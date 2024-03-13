package es.ubu.lsi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 * Servidor remoto.
 *
 */
public class Servidor implements HolaMundo {

	/**
	 * Devuelve un texto con un saludo.
	 *
	 * @return texto de saludo
	 * @throws RemoteException problema en acceso remoto
	 */
	public String decirHola() {
		return "Hola mundo!";
	}

	/**
	 * Devuelve un texto con la fecha actual.
	 *
	 * @return texto con la fecha
	 * @throws RemoteException problema en acceso remoto
	 */
	public String decirFecha() throws RemoteException {
		return new Date().toString();
	}

	/**
	 * Devuelve un texto con el estado actual del server.
	 *
	 * @return tecto con el estado actual del servidor.
	 * @throws RemoteException problema en acceso remoto
	 */
	public String decirEstadoServer() throws RemoteException {
		// TODO Auto-generated method stub
		return "El servidor está corriendo exitosamente...";
	}

	/**
	 * Método raíz.
	 *
	 * @param args argumentos
	 */
	public static void main(String args[]) {

		try {
			// nueva instancia del servidor
			Servidor obj = new Servidor();

			// si no hereda de UnicastRemoteObject es necesario exportar
			HolaMundo stub = (HolaMundo) UnicastRemoteObject.exportObject(obj, 0);

			// Liga el resguardo de objeto remoto en el registro
			Registry registro = LocateRegistry.getRegistry();
			registro.bind("Hola", stub);

			System.out.println("Servidor preparado");
		} catch (Exception e) {
			System.err.println("Excepción de servidor: " + e.toString());
		}
	} // main

} // Servidor