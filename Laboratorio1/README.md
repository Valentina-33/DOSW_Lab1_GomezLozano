\# Maratón Git 2026-1



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



&nbsp;

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





\*\*Descripción\*\*



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


































