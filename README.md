# Conversor de Monedas

Este proyecto es un **Conversor de Monedas** que permite a los usuarios convertir entre diferentes monedas utilizando la API de tasas de cambio. Está diseñado para ser fácil de usar y ofrece un menú interactivo para seleccionar las monedas de conversión.

## Funcionalidades

- Conversión entre las siguientes monedas predefinidas:
    - Dólar Americano (USD) a Peso Argentino (ARS)
    - Peso Argentino (ARS) a Dólar Americano (USD)
    - Dólar Americano (USD) a Real Brasileño (BRL)
    - Real Brasileño (BRL) a Dólar Americano (USD)
    - Dólar Americano (USD) a Peso Colombiano (COP)
    - Peso Colombiano (COP) a Dólar Americano (USD)
- Opción para ingresar cualquier par de monedas mediante códigos de moneda.
- Interacción sencilla a través de un menú en la consola.

## Requisitos

Para ejecutar este proyecto, necesitarás tener instalado Java y las siguientes dependencias:

- **Gson** para el manejo de JSON. Asegúrate de incluir la librería Gson en tu proyecto. Puedes añadirlo a tu proyecto Maven o Gradle.

## Instalación

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/tu_usuario/conversor-de-monedas.git
    ```
   

2.  Navega al directorio del proyecto:

   
```
cd conversor-de-monedas
```

3. Asegúrate de que tienes las dependencias necesarias en tu proyecto.

4. Ejecuta el programa:

```
java -jar conversor-de-monedas.jar
```

## Uso

1. Al iniciar el programa, verás un menú con opciones de conversión.
2. Selecciona una opción válida ingresando el número correspondiente.
3. Si eliges la opción "Otra", se te pedirá que ingreses los códigos de la moneda base y de la moneda destino.
4. El programa mostrará la tasa de cambio y el resultado de la conversión.
5. Puedes salir del programa seleccionando la opción de salir. 

### Ejemplo de uso



    ******************************************************
    ** Sea bienvenido/a al conversor de Monedas **

    1 - Dolar Americano =>> Peso Argentino
    2 - Peso Argentino =>> Dolar Americano
    3 - Dolar Americano =>> Real Brasileño
    4 - Real Brasileño =>> Dolar Americano
    5 - Dolar Americano =>> Peso Colombiano
    6 - Peso Colombiano =>> Dolar Americano
    7 - Otra
    9 - Salir

    Selecciona una opción válida

    ******************************************************

## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama ( git checkout -b feature/Mejora).
3. Realiza tus cambios y haz un commit ( git commit -m 'Añadir nueva funcionalidad').
4. Envía tus cambios al repositorio remoto ( git push origin feature/Mejora).
5. Abre un Pull Request. 

## Licencia

Este proyecto está bajo la Licencia MIT. Para más información, consulta el archivo LICENSE .

## Contacto

Si tienes alguna pregunta o comentario, no dudes en contactar conmigo a través de mi correo electrónico o por mensaje 
directo. 
