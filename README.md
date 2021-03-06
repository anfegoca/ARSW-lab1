# LOC Counting

LOC Counting es un programa que ofrece el servicio de contar las lineas que hay en un archivo, esto incluye los comentarios, o contar las líneas de código que hay en un archivo.
* Total de horas trabajadas = 5 horas
* LOC = 168
* **LOC/h** = 33,6 

## Getting Started

Para hacer uso del proyecto solo debe clonar el repositorio o descargarlo directamente, para ejectarlo lo hacemos por medio de la consola usando el siguiente comandos, la opción la cambiamos por la que queremos y la ruta es la del archivo al cual le queremos contar las líneas:

```bash
java -cp target/miprimera-app-1.0-SNAPSHOT.jar edu.escuelaing.arsw.intro.App <opcion> <ruta>
```
Entre las opciones que se pueden elegír son:
* **phy** con el cual podemos contar las líneas físicas
* **loc** con el cual podemos contar las líneas de código

### Prerequisites

Para usar el proyecto se necesitan tener las siguientes versiones de java o superior:


```
java version "1.8"
javac version "1.8"
Apache Maven 3.6.3
```

### Installing

Para usar el proyecto decargamos directamente el proyecto o lo clonamos de la siguiente manera:

En la consola nos vamos al directorio donde vamos a clonar el repositorio y ponemos el siguiente comando:

```bash
git clone https://github.com/anfegoca/ARSW-lab1.git

```
![clone](https://github.com/anfegoca/ARSW-lab1/blob/master/resources/1.png)

En el direcctorio nos quedará la carpeta del proyecto y dentro veremos las siguiente carpetas

![direc](https://github.com/anfegoca/ARSW-lab1/blob/master/resources/2.png)

Para modificar abrimos el proyecto con cualquier editor, en este caso usamos NetBeans

![edit](https://github.com/anfegoca/ARSW-lab1/blob/master/resources/3.png)
![edi2t](https://github.com/anfegoca/ARSW-lab1/blob/master/resources/4.png)

Y ya podemos modificar cualquier clase del proyecto

![class](https://github.com/anfegoca/ARSW-lab1/blob/master/resources/5.png)

## Running the tests

Para ejecutar los test del proyecto usamos el siguiente codigo desde la ruta del proyecto

```bash
mvn test

```
![test](https://github.com/anfegoca/ARSW-lab1/blob/master/resources/6.png)

Para información más detallada de los test se puede consultar el siguiente 
[reporte](https://github.com/anfegoca/ARSW-lab1/blob/master/resources/Reporte%20de%20pruebas.pdf)


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Versioning

El versionamiento se realizó a través de [github](https://github.com/anfegoca/ARSW-lab1.git)

## Authors

* **Andrés González** - [anfegoca](https://github.com/anfegoca)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Design

Para mas información del diseño del proyecto puede ver el siguiente [documento](https://github.com/anfegoca/ARSW-lab1/blob/master/resources/LOC%20Counting.pdf)

## JavaDoc

La documentación del proyecto la puede econtrar [aquí](https://github.com/anfegoca/ARSW-lab1/tree/master/site/apidocs)
