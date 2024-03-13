# RMI-HolaMundo

## Descripción
Este proyecto es una aplicación Java RMI básica que permite la comunicación entre un cliente y un servidor de manera remota. El cliente envía una solicitud al servidor para obtener un mensaje de "Hola mundo", la fecha actual del servidor y el estado del servidor (3 objetos que son listados desde el cliente RMI).

## Requisitos
- Java JDK instalado y configurado correctamente.
- Maven instalado para gestionar las dependencias y el proceso de construcción del proyecto.

## Configuración
Antes de ejecutar la aplicación, asegurarse de que Maven esté instalado y que tanto `JAVA_HOME` como `MAVEN_HOME` estén configurados correctamente en el sistema.

## Ejecución desde línea de comandos
1. Asegurar que los scripts `registro.bat`, `servidor.bat` y `cliente.bat` estén presentes y correctamente configurados:
    - `CLASSPATH` debe apuntar a las clases compiladas (usualmente dentro de `target\classes`).
    **NOTA**: Aunque tanto al cliente como al servidor se les pasa el parámetro `java.security.policy`, en el ejemplo de "HolaMundo", no aplica porque no se recupera la política de seguridad.

2. Arrancar `registro.bat` y espere unos segundos. Acepte la excepción del Firewall si es solicitada.
   
3. Arrancar `servidor.bat` para iniciar el servidor RMI.
    
4. Editar `cliente.bat` y asegurarse de que tenga `pause` al final del script. Esto le permite ver la respuesta del servidor antes de que la ventana de comando se cierre.

5. Arrancar `cliente.bat`. (se puede editar el archivo `.bat` y sustituir `%1` por `localhost`. Si se omite, se toma por defecto `localhost`).


