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
	Si hemos trabajado en equipo, aunque ha sido muy complicado coordinar reuniones entre los cuatro miembros del equipo, ya que cada uno llevavamos un horario diferente, pero al final no hemos podido organizar. 
	Hemos hecho reuniones de trabajo por Teams, en las que alguna estabamos todos los componentes y en otra no todos, pero siempre informabamos a todos de los cambio o de lo que ibamos a hacer. 
	Nos hemos repartido el trabajo por un grupo creado en la plataforma Teams.
	
	![image](https://github.com/user-attachments/assets/a62136ba-c39b-4632-a011-a7b73a8457be)

	
	

### 2. ¿Tiene calidad el conjunto de pruebas disponibles?
	Según Codecov tenemos una cobertura de código del 100% sobre la clase reusablePool.java
	Podemos ver en la imagen la valoración que nos da el propio Codecov.

 ![26Febre 1](https://github.com/user-attachments/assets/20d9e4ae-2daf-48ee-a6b7-8b0790a9aa87)
 ![image](https://github.com/user-attachments/assets/c41579c7-6661-4852-872d-64a4e919c22d)



	

### 3. ¿Cuál es el esfuerzo invertido en realizar la actividad?

	Cada componente del grupo a debido previamente dedicar tiempo a ver los videos aportados por el profesor y seguir los pasos para 
	poder realizar práctica lo que más o menos podría a ser aproximadamente 4 h invertidas .
	

### 4. ¿Cuál es el número de fallos encontrados en el código original?

	En la clase ReusablePoolTest, que forma parte de esta práctica, no se han encontrado errores. Todas las pruebas unitarias se han ejecutado correctamente,
        lo que indica que la funcionalidad relacionada con el pool de objetos reutilizables está bien implementada y cumple con las expectativas.

	Sin embargo, al analizar la cobertura de código con Jacoco, hemos detectado que en la clase Client.java existen errores o fragmentos de código que no están siendo cubiertos adecuadamente por las pruebas. 
 
![image](https://github.com/user-attachments/assets/e9760df0-9c75-4c3f-b03f-8cd7715300c0)


### 5. ¿El proceso de integración continua realizado ha sido de calidad?

	Tras analizar el proceso de integración continua realizado, podemos concluir que ha sido de calidad y ha cumplido con los estándares esperados. La integración del código se ha 	llevado a cabo de manera frecuente, lo que ha permitido detectar posibles errores con uficiente tiempo para solucionarlos.

	Además, la ejecución de pruebas ha sido efectiva y el tiempo de ejecución ha sido óptimo.
	Por último, la gestión de errores ha sido adecuada, proporcionando reportes claros y permitiendo la rápida corrección de incidencias. 	

