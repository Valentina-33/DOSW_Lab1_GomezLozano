\# Maratón Git 2026-1 LAB 1

\## Integrantes 

* Paula Valentina Lozano 
* Ángela Gómez 

---

\## Retos completados

\### Reto: Configuración y creación de rama

![Creation of branches](images/setting_up_github.png)

\*\*Descripción\*\*

Para la creación del repositorio y la creación y uso correcto de ramas y carpetas, primero creamos en GitHub el repositorio, en donde la creadora le compartió a la otra integrante el link. De acá se clonó el repo y se comenzamos a crear las ramas correspondientes siguiendo el formato y diseño previamente planteado de Git Flow, el cual usa ramas como develop, feature y hotfix, aparte de la rama principal.


---

\### Reto: Commit colaborativo 


![Results of using git commands for GitHub](images/results_in_github.png)

\*\*Descripción\*\*

Después de habernos familiarizado más con los comandos usados desde la terminal, logramos establecer de forma correcta las ramas a nivel local y global para asegurar prácticas eficientes y profesionales. 

---
\## Reto 1: La Bienvenida


![Code + results](images/welcome_message.png)

\*\*Descripción\*\*

A partir de unas investigaciones sobre los principios de las funciones Lambda, pudimos resolver el problema de forma exitosa, en donde hacemos uso de 3 clases principales (Student, WelcomeMessage, Main) junto con herramientas como lo son format y map, por ejemplo. 

---

\## Reto 2: Carrera en Paralelo 


![Git commands](images/image.png)

![Git commands](images/image-1.png)

![Git commands](images/image-2.png)

Primer choque:

![Error message](images/image-3.png)

![Git commands](images/image-4.png)

![Git commands](images/image-5.png)

Nuevo choque:

![Error message](images/image-6.png)

![Fixing fail](images/image-7.png)

Otro choque:

![Fixing fail](images/image-8.png)

Cierre:

![Git commands](images/image-9.png)


\*\*Descripción\*\*

Para este reto procuramos hacer la mayor cantidad de acciones desde la terminal directamente para reforzar y practicar comandos de Git. Acá nuevamente con el uso de Streams y lambdas aprendimos a obtener valores máximos y mínimos de una lista de números. 

Asimismo, en este reto también generamos varios choques a la hora del merge, en donde algunos erores tuvieron que ser arreglados por ambas integrantes al hacerles pull a las ramas individuales del reto y así subir las versiones corregidas a la rama develop. 


\## Reto 3: El eco misterioso

![Git commands](images/image-10.png)

![Git commands](images/image-11.png)

![Git commands](images/image-12.png)

Mensaje de choque:

![Error message](images/image-13.png)


\*\*Descripción\*\*

En este reto aprendimos de nuevos tipos de datos como el StringBuilder y el StringBuffer, los cuales nos facilitaron la aplicación de los ejercicios planteados de repetir un mensaje y de invertir otro. Nuevamente trabajamos con los conceptos de merge, y cómo lidiar con los choques al editar mismas líneas de código de los ejercicios. 


\## Reto 4: El tesoro de las llaves duplicadas

![Git commands](images/image-14.png)


\*\*Descripción\*\*

Aunque ya estábamos familiarizadas con las estructuras de datos de HashTable HashMap, con este ejercicio logramos implementar estas estructuras junto con el uso de Streams, es decir, cómo aplicar estas herramientas dentro de la programación funcional. 

En adición seguimos trabajando con los comandos git, en dónde algunas veces también realizamos pull request desde el GitHub para aprender de las diferentes formas en las que se puede realizar una misma acción. 


\## Reto 5: Batalla de Conjuntos 

![Git commands](images/image-15.png)

![Git commands](images/image-16.png)

Terminando reto 5:

![Git commands](images/image-17.png)

![Git commands](images/image-18.png)


\*\*Descripción\*\*

En este reto seguimos mirando y reforzando cómo usar algunas esctructuras de datos como HashTable y HashMap dentro del mundo de la programación funcional; acá también manejamos herramientas como .filter para obtener resultados con condiciones específicas dentro de una lista de valores, por ejemplo. 


\## Reto 6: La máquina de decisiones 

![Git commands](images/image-19.png)

![Git commands](images/image-20.png)

![Git commands](images/image-21.png)

![Git commands](images/image-22.png)

\*\*Descripción\*\*

Para este último reto hacemos uso del comando switch el cuál nos ayuda a sintetizar código respecto a qué mensaje debería imprimir el programa, dependiendo de la frase clave que escriba el usuario. Acá usamos Runnable como lo pide la instrucción, ya que además este es ideal para este tipo de ejercicios. 



# Preguntas parte final 


1. ¿Cuál es la diferencia entre git merge y git rebase?

Mientras ue git merge combina dos ramas manteniendo el historial del merge, el git rebase replica los commits de una rama sobre otra, reescribiendo su historial. 

2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?

Git detecta un choque entre versiones de archivo, por lo que una persona debe hacer pull y mirar manualmente qué cambios se conversan y cuales se borran. 


3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

Para ver el árbol de merges y commits entre ramas, se usa el siguiente commando:

git log --oneline --graph --all


4. Explica la diferencia entre un commit y un push.

Un commit es tomarle una "foto" al trabajo que quieres guardar, es decir, este guardo cambios localmente en el repo. Por otro lado, un push envía esos commits al repositorio remote o local, como GitHub. 


5. ¿Para qué sirven git stash y git pop?

Mientras que git stash guarda cambios temporales sin hacer commit, el git pop recupera esos cambios y los vuelve a aplicar en la rama actual. 

6. ¿Qué diferencia hay entre HashMap y HashTable?

Un HashMap es sincronizado, permite un valor null y es más rápido; por otro lado, el HashTable es sincronizado, pero n permite null y es obsoleto.  

7. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?

Este permite un código más punctual, es decir, tiene menos líneas de Código el cual facilita la programación funcional, reduciendo posibles errores. 


8. Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?

Este proceso que se describe se llama operación intermedia de transformación, en donde map() transforma cada elementos del stream en otro tipo de dato sin la necesidad de modificar la lista original. 

9. ¿Qué hace el método stream().filter() y qué retorna?

Este se encarga de filtrar elementos según una condición de forma de Streams. 

10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.

Para crear una rama desde la de develop, se deben aplicar los siguientes comandos:

git checkout develop
git pull origin develop
git checkout -b feature/nueva-rama

11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?

Mientras que git branch nombre-rama solo crea la rama, git checkout -b nombre-rama crea la rama y se cambia a esta nueva rama. 

12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?

Porque así protegemos la rama main, facilitamos el trabajo remoto en equipo, y mejora el control de versiones y trabajo en equipo. 


## Referencias

Chacon, S., & Straub, B. (2014). Pro Git (2nd ed.). Apress.

Git Documentation. (s.f.). Git Reference Manual. https://git-scm.com/docs

Oracle. (2023). Java Platform, Standard Edition Documentation. https://docs.oracle.com/en/java/

Bloch, J. (2018). Effective Java (3rd ed.). Addison-Wesley.

---



































