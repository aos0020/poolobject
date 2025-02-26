poolobject
==========


Java code example of creational design pattern pool object

Workshop to use good practices in software development: testing, ci and measurement.

Authors:
- Ángel Ortiz de Lejarazu Sánchez : aos0020@alu.ubu.es
- Mario Marcilla Moreno : mmm1058@alu.ubu.es
- Santiago Peris Bartual: spb1007@alu.ubu.es
- Jose Carlos Chico Mena : jcm1020@alu.ubu.es

## URL Proyecto
### Fork
	https://github.com/aos0020/poolobject/
 
## Objetivos
Comprender, aplicar y analizar técnicas de medición sobre entidades de productos software relacionados con conjuntos de pruebas de software e integración continua
Comprender, aplicar y analizar medidas relacionadas sobre entidades de proceso y recursos de prueba del software e integración continua

## Enunciado
En la práctica se va simular un pequeño desarrollo de un producto software para realizar mediciones sobre él. 
El objetivo es establecer un caso de estudio dummy que sirva para caracterizar y evaluar tanto el producto desarrollado como el proceso seguido.

### Descripción del caso de estudio
Dado un código de ejemplo del patrón diseño creacional Pool Object, se debe crear una batería de pruebas tal que las coberturas de sus clases sean del 100%. 
El código de las clases se puede obtener en el repositorio https://github.com/clopezno/poolobject. La batería de pruebas JUnit debe estar contenida en la clase 
test.java.ubu.gii.dass.c01.ReuseblePoolTest.java.

## Requisitos

### Requisitos Tecnológicos
- Stack tecnológico para el desarrollo de pruebas en Java con Eclipse IDE, maven, git
- Stack tecnológico para el desarrollo de pruebas en Java con Visual Code IDE, maven, git
- Integración continua del ciclo de desarrollo maven con github actions.
- Integración continua de cobertura de pruebas con codecov.io y github actions https://codecov.io/

### Requisitos Teóricos
- Conocimiento de sistemas que permitan la ejecución de tareas del proceso de desarrollo software (ant o maven)
- Conocimiento del proceso de prueba y sus tareas asociadas (Junit)
- Conocimiento de métricas de producto y de proceso
- Conocimiento del patrón de diseño Pool Object
- Conocimiento de gestión ágil en repositorios de proyectos software (Github o GitLab)
- Conocimiento de sistemas de control de versiones (git)
- Conocimientos de sistemas integración continua on cloud (git actions y codecov)


## Preguntas

### 1. ¿Se ha realizado trabajo en equipo?
	Si, aunque ha sido muy complicado coordinar reuniones entre los cuatro miembros del equipo. 
	Hemos hecho sesions de trabajo por Teams, en las que alguna estabamos todos los componentes y en otra menos. 
	Nos hemos repartido el trabajo por un grupo de Tems.
	
	->	Imagen kpi de GitHub en informe.
	
	

### 2. ¿Tiene calidad el conjunto de pruebas disponibles?
	Según Codecov tenemos una cobertura de código superior al ..... sobre reusablePool.java
	Podemos ver en la imagen clases que no estan probadas.

 (SUBIR CAPTURA DE CODECOV)
	

### 3. ¿Cuál es el esfuerzo invertido en realizar la actividad?
	Cada participante ha invertido en el estudio de los videos aportados por el profesor y ejecución de la práctica 
	aproximadamente 4 h.
	

### 4. ¿Cuál es el número de fallos encontrados en el código original?

	En la clase ReusablePoolTest , objeto de esta práctica , no se han encontrado errores. Sin embargo en la clase Client.java 
	podemos apreciar errores como vemos en jacoco.
 
(SUBIR ÚLTIMA CAPTURA)
 ![image](https://github.com/user-attachments/assets/16b527e6-c42d-490d-9061-566aa941534e)


### 5. ¿El proceso de integración continua realizado ha sido de calidad?

