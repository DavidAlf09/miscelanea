# miscelanea
# PROYECTO MISCELANEA 
 David Felipe Alfonso Espinosa - Estudiante de ingenieria de sistemas de la universitaria de Colombia

# Ejercicio Base:
Un dueño de una miscelánea requiere de un programa que permita colocar en base a unos productos que tiene listados en su establecimiento, los productos que desea llevar el comprador, y el programa devuelva la lista de estos productos seleccionados con su valor, y el total a pagar para poder llevar los productos. 
Aclaraciones:
La aplicacion se puede usar para que un unico cliente compre varios productos de la tienda.
La aplicacion no almacena datos de usuario, solo da el total a pagar.

# Historia de usuario:
![image](https://github.com/DavidAlf09/miscelanea/assets/133126275/480bcd97-2dee-4cac-a3df-87ea8a9b43f9)

![image](https://github.com/DavidAlf09/miscelanea/assets/133126275/4a2e0c98-16f6-466e-a5de-99614e0c1b9a)


# Caso de uso:

![Caso de uso MiscelaneaDA](https://github.com/DavidAlf09/miscelanea/assets/133126275/87a34262-dd88-4f15-8a0e-5087523b5f60)


# Diagrama de flujo:

![_Diagrama de flujo miscelanea](https://github.com/DavidAlf09/miscelanea/assets/133126275/da1c6814-bd6c-4e4f-bf97-c2bfb5a9091f)


# Pseudocódigo:
Inicio:

Escribir "Bienvenid@ a nuestra miscelanea"

Escribir "Estos son algunos de nuestros principales productos"

productosM = {"1. Cartulina", "2. Papel contact", "3. Lapiz", "4. Esfero", "5. Tajalapiz"}

preciosM = {500, 2500, 1200, 1800, 1000}

cantidad = [50] 

Para i desde 0 hasta longitud(productosM)-1

   Escribir productosM[i] + " - $" + preciosM[i]
   
Fin Para

Escribir "Digite el numero del producto que desea llevar // Pulse 0 para cancelar compra"

opcion = scanner.nextInt()

Mientras opcion != 0

Si opcion < 1 o opcion > 5

 Escribir "Lo sentimos, no tenemos ese producto en el momento."
 
 Escribir "Digite el numero del producto que desea llevar // Pulse 0 para cancelar compra"
 
 opcion = scanner.nextInt()
 
 Continuar mientras
 
Fin Si

Escribir "Ingrese la cantidad que desea comprar: "

cantidadT = scanner.nextInt()

cantidad[opcion - 1] += cantidadT

Escribir "Si desea llevar mas productos, digite el numero del producto que desea llevar // Pulse 0 para generar su factura: "

opcion = scanner.nextInt()

Fin Mientras

total = 0

Para i desde 0 hasta longitud(productosM)-1

 Si cantidad[i] > 0
 
  Escribir productosM[i] + " x " + cantidad[i] + "  $" + (preciosM[i] * cantidad[i])
  
  total += preciosM[i] * cantidad[i]
  
  Fin Si
  
 Fin Para
 
Escribir "El total de su compra es: $" + total

Fin

