## 📄 Descripción

Este proyecto es un **Conversor de Monedas** en Java que consume la **Exchange Rate API** para obtener tasas de cambio en tiempo real. Fue desarrollado como desafío de Alura Latam en la ruta de aprendizaje Back-End de Java, aprovechando el acceso gratuito y sencillo de esta API para brindar conversiones precisas y actualizadas.

## 🚀 Características principales

* Conversión entre diferentes pares de divisas (USD, ARS, BRL, COP, y más).
* Opción de listar todas las divisas soportadas.
* Manejo de entradas inválidas y errores de comunicación.
* Uso de Java 17+, `HttpClient` y **Gson** para serialización/deserialización de JSON.

## 📋 Requisitos

* Java 17 o superior
* Conexión a Internet

## 🎯 Uso

Ejecuta la clase `Principal`


Al iniciar, verás un menú interactivo en consola:

```text
********** Bienvenidx al Sistema Conversor de Monedas **********
1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileño
4) Real brasileño =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Más opciones de divisas
8) Salir
******************* Elija una opción válida: *******************
```

* Elige la opción deseada y sigue las indicaciones para ingresar códigos de moneda y cantidad.
* Para la opción **7**, se listan todas las divisas soportadas y luego podrás ingresar cualquier par personalizado.
* Selecciona **8** para salir.


