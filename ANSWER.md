# LABORATORIO 1 (ARSW) 📚

## INTEGRANTES:📋
* Johan Stiven Guerrero Pineda
* Jonathan Fabian Paez Torres


## Parte I - Introducción a Hilos en Java 📌

### 1. Implementacion clase CountThread

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/hiloParte1.PNG)

### 2. Método main de la clase CountMainThreads

#### Cambie el incio con 'start()' por 'run()'. Cómo cambia la salida?, por qué?. ❓

1. Ejecucion por start:

- La ejecucion por start hace que se ejecute el hilo, permitiendo que corran al tiempo los procesos

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/EjecucionStart.png)

2. Ejecucion por run:

- La ejecucion por run hace que se ejecute el metodo, logrando una ejecucion del metodo, y esto genera que los procesos seas iterativos

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/EjecucionRun.png)

## Parte II - Ejercicio Black List Search 📜

### 1. Cree una clase de tipo Thread que represente el ciclo de vida de un hilo que haga la búsqueda de un segmento del conjunto de servidores disponibles.

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/claseHilo2.PNG)

### 2. Modificando metodo checkHost 

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/checkHost2.PNG)

## Parte III - Evaluación de Desempeño 📐

### Desempeño para 1 Hilo

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/1Hilo.jpg)

### Procesamiento haciendo uso del Api Runtime

Usando la API podemos identificar que se cuenta con 8 nucleos de procesamiento

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/Nucleos.jpg)

### Desempeño para 8 Hilos

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/8Hilos.jpg)

### Desempeño para 16 Hilos

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/16Hilos.jpg)

### Desempeño para 50 Hilos

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/50Hilos.png)

### Desempeño para 100 Hilos

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/100Hilos.jpg)

## Gráfica de tiempo de solución vs. número de hilos 📊

![](https://github.com/Johannes26/ARSW-LAB01/blob/master/img/Grafica.PNG)

### Preguntas 	❓
1. Según la [ley de Amdahls](https://www.pugetsystems.com/labs/articles/Estimating-CPU-Performance-using-Amdahls-Law-619/#WhatisAmdahlsLaw?):

	![](img/ahmdahls.png), donde _S(n)_ es el mejoramiento teórico del desempeño, _P_ la fracción paralelizable del algoritmo, y _n_ el número de hilos, a mayor _n_, mayor debería ser dicha mejora. Por qué el mejor desempeño no se logra con los 500 hilos?, cómo se compara este desempeño cuando se usan 200?
	
Porque al tener en ejecucion tantos hilos es posible que durante la ejecucion se genere un cambio de contexto, lo que puede llevar a que el performance de la aplicacion afecte el rendimiento de velocidad. 

2. Cómo se comporta la solución usando tantos hilos de procesamiento como núcleos comparado con el resultado de usar el doble de éste?.

Al comparar el resultado en nucleos de procesamiento, en nuestro caso 8 nucleos se puede ver que con respecto al doble de hilos (16) el rendimiento en velocidad aumenta aproximadamente el doble e comparacion con 8 hilos.

3. De acuerdo con lo anterior, si para este problema en lugar de 100 hilos en una sola CPU se pudiera usar 1 hilo en cada una de 100 máquinas hipotéticas, la ley de Amdahls se aplicaría mejor?. Si en lugar de esto se usaran c hilos en 100/c máquinas distribuidas (siendo c es el número de núcleos de dichas máquinas), se mejoraría?. Explique su respuesta.

No seria mejor debido a que al implementarse en tantas maquinas, se estaaria generando un costo fisico adicional lo que generaria un incremento en la velocidad 

		  
