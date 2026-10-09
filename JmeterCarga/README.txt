Proyecto: Prueba de carga del servicio de login con Apache JMeter
Fecha de documentación: 08/10/2026

1. OBJETIVO
-----------
Ejecutar una prueba de carga del endpoint:
POST https://fakestoreapi.com/auth/login

Criterios solicitados por el ejercicio:
- Alcanzar al menos 20 TPS.
- Tiempo de respuesta máximo permitido: 1,5 segundos.
- Tasa de error menor al 3% del total de peticiones.
- Parametrizar usuarios y contraseñas desde un archivo CSV.
- Conservar los insumos necesarios para reproducir la prueba.

2. VERSIONES DE TECNOLOGÍAS
----------------------------
- Apache JMeter: 5.5
- Java: Microsoft Build of OpenJDK 21.0.12.8-hotspot (Java 21.0.12), versión previamente reportada en el entorno del usuario.