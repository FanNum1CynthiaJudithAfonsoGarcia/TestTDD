- ReOrdenar

Este proyecto es una función en Java que recibe un número entero positivo (o cero) y devuelve el mismo número pero con los dígitos ordenados de mayor a menor. Así se consigue el número más grande posible con esos mismos dígitos.

- Ejemplos

42145 → 54421  
145263 → 654321  
123456789 → 987654321  

- ¿Para qué sirve este ejercicio?

La idea es practicar cómo se hacen pruebas en Java con JUnit. En lugar de escribir el código directamente, primero escribimos los tests (esto se llama TDD o desarrollo guiado por pruebas), y luego programamos la función para que los tests pasen correctamente.

- ¿Qué es assertEquals?

Es una función que compara dos valores: el esperado y el que devuelve tu código. Si son iguales, el test pasa. También hay otras funciones como assertTrue, assertFalse, assertNull, etc.

- Casos que conviene probar

Además de los números normales, es útil probar casos como:
- 0 → debe devolver 0
- Números con una sola cifra, como 7
- Números con cifras repetidas, como 11111
- Números grandes como 2147483647 (el mayor int en Java)

- Archivos que contiene este proyecto

ReOrdenar.java que contiene la función principal  
ReOrdenarTest.java que contiene los tests con JUnit  


- Vícitor Pérez Sosa

