# Loc Counting
# Profesor: Luis Daniel Benavides
# ARSW - Arquitectura de Software 2020-I

El proyecto Loc Counting tiene como fin realizar el conteo de lineas de codigo de uno o varios archivos ubiacados en un directorio, este directorio puede contener otros directorios, vale aclarar que esta busqueda de archivos se hace de manera recurrente, hay dos tipos de conteo "phy" y "loc", en el tipo "phy", se cuentan las lineas fisicas del archivo, y en el tipo "loc" se cuentan todas las lineas a excepcion de las lineas que sean comentarios y espacios, teniendo en cuenta claro los caracteres especiales, el fin de realizar estos medidas se da debido a que las lineas de codigo  a menudo se utilizan como métricas de software para comparar la complejidad y medir la productividad, que quiere decir que se medira la productividad en este caso por la linea de codigo sobre el tiempo invertido en escribirlas en realizar este proyecto se realizaron al rededor de 301 lineas de codigo y el tiempo total invertido fue 12 horas por lo que tenemos: 

301LOCS / 12Hours = 25.083 LOC/hour .

## Prerrequisitos

Como primera medida se debera intalar el JDK y maven y si es necesario un editor como ECLIPSE,NETBEANS,etc. Si solo se quiere ejecutar el proyecto de manera local solo se necesitara el JDK y maven. Para el JDK JAVA se instala la versión 8, a continuacion se adjuntara el link donde muestran las instrucciones detalladas de como descargar este y ademas en esta mismo link se podra realizar la descarga y futura instalacion, de igual forma se adjunta el link de la pagina oficial de maven en el cual esta el instructivo detallado y los paquetes necesarios para la version del sistema operativo en el cual se ejecutara, y por ultimo es recomdable descargar la aplicacion git tambien se anexara el link desde la pagina oficial, se anexan los links debido a que se especifican mas en cada uno con respecto a cada sistema operativo y no uno en especifico.

### Instalacion

Descargar JDK e instrucciones de instalacion
https://www.oracle.com/technetwork/es/java/javase/downloads/index.html
Descargar maven e instrucciones de instalacion
https://maven.apache.org/download.cgi
Descargar Git e instrucciones de instalacion
https://git-scm.com/downloads

## Construccion
Este proyecto basicamente esta construido en maven y el editor que se utilizo fue Eclipse, teniendo el JDK antes mencionado, especificamente se utilizo el lenguaje Java.

## Diseño

![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/DiagramaDeClases.PNG)

## Descripcion del diseño

Basicamente el diagrama consta de cuatro clases y una interfaz en la parte del modelo o lógica de negocio. La clase APP es la clase principal en la cual se encuentra en el paquete edu.escuelaing.arsw.intro, la cual delega por variables con lector archivo esta clase lee los archivos del directorio de forma recurrente, y ademas guarda el conteo final, esta utliza la interface Contador por linea esta sera la encargada de contar las lineas de codigo de dos formas diferentes para ello estan las dos clases que implementan esta interfaz y sobrescriben los metodos correspondientes a esta para realizar el conteo por phy en este caso que es LineasFisicasPHY y por loc que es LineasEncontradasLOC

## Como usar el Proyecto
Lo que primero se debe realizar para poder hacer uso o ejecutar el proyecto es ir al repositorio https://github.com/JuanRomero11/ARSW-2020I-lab1 y clonar o descargar el proyecto a traves de la aplicacion git ya instalada en su compuador, recomendacion si se clonara utilizar el comando :

        git clone https://github.com/JuanRomero11/ARSW-2020I-lab1
        
Despues de que el proyecto esta clona se accede a la consola del computador en este caso accedemos a la terminal de comandos de Windows(cmd) y entramos directamente en la carpeta en donde esta nuestro proyecto y como primer paso compilamos con el comando 

        mvn package
![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/mvnPackage.PNG)

Para probar directamente en esta terminal de comandos se puede realizar con cualquier carpeta que se encuentre en el proyecto en este caso yo lo lo hice con la carpeta que se encuentra en la direccion edu/escuelaing/arsw/intro, ya que en esta existe 1 clase y 1 una carpeta que contiene 4 diferentes clases con comentarios y demas, para probarlo se genera un archivo .jar con la direccion donde esta ubicada la clase principal que es App.java y se ingresa la lista, en la primera posicion de esta ira como queremos que cuente si todas las lineas fisicas o las lineas solo de codigo en este caso primero probamos con "phy" que es lineas fisicas.

      java -cp target/miprimera-app-1.0-SNAPSHOT.jar edu.escuelaing.arsw.intro.App phy src/main/java/edu/escuelaing/arsw/intro
      
![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/PHYintro.PNG)

Evidenciamos una parte del resultado

![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/PHYintro2.PNG)

Ahora lo probamos para que cuente las lineas a excepcion de las que tienen comentarios y los espacios para esto en vez de "phy" colocamos "loc"

      java -cp target/miprimera-app-1.0-SNAPSHOT.jar edu.escuelaing.arsw.intro.App loc src/main/java/edu/escuelaing/arsw/intro
      
![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/LOCintro.PNG)

Evidenciamos una parte del resultado

![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/PHYintro2.PNG)

## Ejecución de Pruebas

Para ejecutar las pruebas sencillamente se utliza el comando 

          mvn package
          
Despues de ello se ejecutan todas las pruebas realizadas 

![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/PruebamvnPackage.PNG)

Detallaremos mas las pruebas. En primera parte se realizaron varias pruebas entre ellas se puede decir que hay dos unitarias, en las que en cada una se prueba como tal la case App que se encuentra en el paquete edu.escuelaing.arsw.intro, en la cual le pasamos como parámetro una lista de longitud 2, la cual en la primera posición tiene una de las dos opciones “loc” o “phy” y en la segunda posición se encuentra una dirección del directorio en el que quiero encontrar todos los archivos y contar las líneas según la elección en este primer caso del testAppLoc se dio la dirección del directorio donde se encuentran las 4 clases que están dentro de este, además en la prueba siguiente de testAppPHY se encuentra la dirección donde se encuentra la clase App y el directorio siguiente “linecounter”, estas muestran un resultado satisfactorio y además imprimen los archivos encontrados y el numero de líneas de cada uno

![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/DosPrimerasPruEBAS.png)

Tambien se realizaron dos pruebas para que estas erraran si se ingresaba una opción que no fueran “phy” o “loc” y otra prueba en la que no se tuviera una clase de tipo lectorArchivo, cuyo resultado como estaba propuesto fue errado queriendo decir que esta bien, a continuación se muestra su resultado:

![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/teceraPrueba.png)
![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/teceraprueba2.png)

Y por ultimo se realizaron otras dos pruebas de tipo integración ya que aquí miramos que esté funcionando el ensamblaje de las clases propuestas, estas dos pruebas obtuvieron un resultado satisfactorio como se muestra a continuación:

![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/CuartaPrueba.png)
![alt text](https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/imagenes/CuartaPrueba2.png)

## Autor
Juan Guillermo Romero 
## License
Este codigo tiene una licencia Apache License 2.0 la cual se detalla en https://github.com/JuanRomero11/ARSW-2020I-lab1/blob/master/LICENSE.txt
