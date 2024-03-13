package es.ubu.lsi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface remota.
 */
public interface HolaMundo extends Remote {

	/**
	 * Devuelve un texto con un saludo.
	 *
	 * @return texto de saludo
	 * @throws RemoteException problema en acceso remoto
	 */
	String decirHola() throws RemoteException;

	/**
	 * Devuelve un texto con la fecha actual.
	 *
	 * @return texto con la fecha
	 * @throws RemoteException problema en acceso remoto
	 */
	String decirFecha() throws RemoteException;

	/**
	 * Devuelve un texto con el estado actual del server.
	 *
	 * @return tecto con el estado actual del servidor.
	 * @throws RemoteException problema en acceso remoto
	 */
	String decirEstadoServer() throws RemoteException;

} // HolaMundo