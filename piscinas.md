# Alogritmo en seudocodigo del sprint semana 2

algoritmo AreaPiscinas

var
lado1 : entero := 300
lado2 : entero := 300
lado3 : entero
ancho1 : entero := 150
ancho2 : entero := 80
ancho3 : entero
profundo1 : entero := 20
profundo2 : entero := 35
profundo3 : entero
area1 : entero
area2 : entero
area3 : entero
vol1 : entero
vol2 : entero
vol3 : entero
fvar

area1 := lado1 * ancho1
area2 := lado2 * ancho2
escribirPantalla("El area de la piscina 1 es: " + area1 +m2" )
escribirPantalla("El area de la piscina 2 es: " + area2 +"m2")

vol1 := area1 * profundo1
vol2 := area2 * profundo2
escribirPantalla("El volumen de la piscina 1 es: " + vol1 +m3" )
escribirPantalla("El volumen de la piscina 2 es: " + vol2 +"m3")

ancho3 := ancho1 + ancho2
lado3 := lado1
escribirPantalla("El lado de las piscinas juntas es: " + lado3 + "metros" )
escribirPantalla("El ancho de las piscinas juntas es: " + ancho3 +"metros")

area3 := area1 + area2
escribirPantalla("El area de las piscinas juntas es: " + area3 + "m2")

vol3 := vol1 + vol2
escribirPantalla("El volumen de las piscinas juntas es: " + vol3 + "m3")

profundo3 := profundo1
pronfundo1 := profundo2
profundo2:= profundo3
vol1 := area1 * profundo1
vol2 := area2 * profundo2
escribirPantalla("El volumen de la piscina 1 es: " + vol1 +m3" )
escribirPantalla("El volumen de la piscina 2 es: " + vol2 +"m3")