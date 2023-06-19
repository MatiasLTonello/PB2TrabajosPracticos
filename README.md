
# Project Title

Trabajos Practicos realizados para la materia Programación Básica 2 de la tecnicatura en Desarrollo Web de la Universidad de La Matanza.



## TPS

- Sistema
- Futsal
- Cuenta



## Sistema

Sistema 

a.Desarrolle un constructor de la clase Sistema que cumpla con la siguiente firma: 

```public Sistema(String nombreDelSistema, int cantidadMaximaDeUsuarios) ```

b.Desarrolle un método en la clase Sistema que le permita incorporar un usuario a su lista de usuarios. Dicho método devolverá true si el usuario se puede ingresar en el sistema o false en caso contrario (no se puede ingresar un nombre de usuario que ya exista). 

``` public boolean ingresarUsuario (Usuario nuevoUsuario) ```

c.Desarrolle el método calcularLaCantidadDeUsuariosLogueados.  

d.Desarrolle el método calcularLaCantidadDeUsuariosBloqueados.  

e.Desarrolle el método calcularElPorcentajeDeUsuariosLogueados. 

f.Desarrolle el método calcularEdadPromedio para conocer a qué público está dirigido el sistema.

g.En la clase Sistema desarrolle el método loguearUsuario, el cual devolverá true si se logra loguear al usuario y false en caso contrario:

``` public boolean loguearUsuario (String usuario, String contraseña) ```

h.Desarrolle un menú para los administradores del sistema que permita: i.Registrar nuevos usuarios en el Sistema ii.Ver las estadísticas del sistema (Cantidad de usuarios logueados, bloqueados, porcentaje de usuarios logueados y edad promedio de los usuarios) iii.Probar el login. Esto es, como administrador se verifica el acceso al sistema de un usuario determinado. Al salir, el usuario utilizado quedará como logueado para poder evaluar las estadísticas. 
## Futsal

La asociación argentina de futsal está queriendo realizar un salto de calidad en sus competiciones. Para eso nos contrata para desarrollar el software que les permita anotar las estadísticas de los partidos que se juegan en sus torneos. Nos comentan que estos torneos están compuestos por 25 equipos que coinciden con los equipos de primera división de AFA (Asociación de Fútbol Argentino). Para simplificar las pruebas de nuestra primera versión del software acordamos que sólo se cargarán 5 jugadores por equipo, siendo información relevante el precio y la edad de los jugadores que competirán. Las funcionalidades principales que debe tener el software son las siguientes: 

1.Agregar los jugadores a los equipos (los equipos no es necesario dar de alta porque se conforman previo al inicio de la competencia, es decir contaremos de antemano con esa información).

 2.Calcular el valor del equipo, esto es la sumatoria del precio de cada jugador. 
 
3.Calcular la edad promedio del equipo. 

4.Registrar un nuevo partido. En él se debe poder incorporar al local y al visitante. Una vez creado el partido, se nos solicita poder registrar los siguientes eventos: 

a.Gol, se interesa conocer el autor y el minuto en el que ocurrió 

b.Amonestados, se desea conocer el jugador amonestado y en qué minuto (cuando un jugador es amonestado en dos oportunidades automáticamente debe ser expulsado, y se espera que el sistema informes esta situación). 

c.Expulsados, ya sea por doble amonestación o por expulsión directa, se debe conocer los jugadores que son expulsados del partido. Ver el resumen. En este resumen se espera conocer el resultado del partido, y el detalle de los autores de los goles, amonestados y expulsados 


## Cuenta 

Tipos de cuentas
Vamos a establecer, para el contexto de este ejercicio, tres tipos de cuentas: la Cuenta
Sueldo, la Caja de Ahorros y la Cuenta Corriente. Cada una cumple con ciertas reglas de
negocio, las cuales se detallan a continuación.

Cuenta Sueldo
Es el tipo de cuenta más simple, ya que se rige por la premisa de que en tanto y en
cuanto se tenga tanto o más dinero en cuenta del que se quiere extraer, la operación
se debe efectuar correctamente.

Caja de Ahorros
Similar a la anterior, pero se pide que luego de la quinta extracción de dinero se
cobre un costo adicional por extracción de $ 6

Cuenta Corriente
La más compleja de las cuentas, ésta permite establecer una cantidad de dinero a
girar en descubierto. Es por ello que cada vez que se desee extraer dinero, no sólo
se considera el que se posee, sino el límite adicional que el banco estará brindando.
Por supuesto esto no es gratis, ya que el banco nos cobrará un 5% como comisión
sobre todo el monto en descubierto consumido en la operación.
Por ejemplo, si tuviéramos $ 100 en la cuenta, y quisiéramos retirar $ 200 (con un
descubierto de $ 150), podremos hacerlo. Pasaremos a deberle al banco $ 105 en
total: los $ 100 que nos cubrió, más el 5% adicional sobre el descubierto otorgado.

