#Test App

# Resp pregunta 1

En el caso de ya haber hecho push, realizo un nuevo commit + push y luego en la rama hago un squash de ambos push para que se unifiquen y asi 
se reflejen como un solo "cambio" en la rama.

Para el caso de no haber hecho push y tan solo tener el commit, lo que haria es agregar el archivo al commit anterior (git commit --amend) y luego mando el push.

# Resp pregunta 2

Si descargan y corren la app android podran ver una app, en Kotlin con una UI muy sencilla donde el usuario puede "probar" su suerte al darle al boton y saber si gana o no.

Basandonos en el planteamiento dado por mail, al darle tap al boton, este hace un random de un array que contiene las distintas manos de cartas planteadas 
y se evalua si la mano es escalera o no y se notifica si es una mano "ganadora" o "perdedora" y dicha mano se muestra en pantalla junto con el mensaje de ganador o perdedor

Tambien se creo un archivo de test donde se manejan los casos de pruebas tal y como se plantea por mail.


