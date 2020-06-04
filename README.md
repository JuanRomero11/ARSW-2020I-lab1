# Loc Counting
# Profesor: Luis Daniel Benavides
# ARSW - Arquitectura de Software 2020-I

El proyecto Loc Counting tiene como fin realizar el conteo de lineas de codigo de uno o varios archivos ubiacados en un directorio, este directorio puede contener otros directorios, vale aclarar que esta busqueda de archivos se hace de manera recurrente, hay dos tipos de conteo "phy" y "loc", en el tipo "phy", se cuentan las lineas fisicas del archivo, y en el tipo "loc" se cuentan todas las lineas a excepcion de las lineas que sean comentarios y espacios, teniendo en cuenta claro los caracteres especiales, el fin de realizar estos medidas se da debido a que las lineas de codigo  a menudo se utilizan como métricas de software para comparar la complejidad y medir la productividad, que quiere decir que se medira la productividad en este caso por la linea de codigo sobre el tiempo invertido en escribirlas en realizar este proyecto se realizaron al rededor de 301 lineas de codigo y el tiempo total invertido fue 12 horas por lo que tenemos: 

301LOCS / 12Hours = 25.083 LOC/hour .

### Prerrequisitos

Como primera medida se debera intalar el JDK y maven y si es necesario un editor como ECLIPSE,NETBEANS,etc. Si solo se quiere ejecutar el proyecto de manera local solo se necesitara el JDK y maven. Para el JDK JAVA se instala la versión 8, a continuacion se adjuntara el link donde muestran las instrucciones detalladas de como descargar este y ademas en esta mismo link se podra realizar la descarga y futura instalacion, de igual forma se adjunta el link de la pagina oficial de maven en el cual esta el instructivo detallado y los paquetes necesarios para la version del sistema operativo en el cual se ejecutara.

#### Instalacion

Descargar JDK e instrucciones de instalacion
https://www.oracle.com/technetwork/es/java/javase/downloads/index.html
Descargar maven e instrucciones de instalacion
https://maven.apache.org/download.cgi

### Construido con
Este proyecto basicamente esta construido en maven y el editor que se utilizo fue Eclipse, teniendo el JDK antes mencionado, especificamente se utilizo el lenguaje Java.

### Diseño

