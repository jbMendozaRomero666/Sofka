# Karate PetStore Tests

Este proyecto contiene pruebas automatizadas para la API REST de PetStore (https://petstore.swagger.io/) utilizando Karate Framework.

## Requisitos previos

- Java 21 o superior (Tu versión: OpenJDK 21.0.12.1)
- Apache Maven 3.8+ (Recomendado 3.9.x)

## Descargar e instalar Maven

### Opción 1: Descargar Apache Maven

Enlace de descarga oficial (apache-maven-3.9.10):
- **Windows ZIP**: https://dlcdn.apache.org/maven/maven-3/3.9.10/binaries/apache-maven-3.9.10-bin.zip
- **Windows Binary ZIP** (recomendado): https://archive.apache.org/dist/maven/maven-3/3.9.10/binaries/apache-maven-3.9.10-bin.zip

Si el enlace de arriba no funciona, usar mirror:
- https://downloads.apache.org/maven/maven-3/3.9.10/binaries/apache-maven-3.9.10-bin.zip

### Opción 2: Instalación en Windows

1. Descargar apache-maven-3.9.10-bin.zip
2. Extraer a una carpeta, por ejemplo: C:\apache-maven-3.9.10\
3. Configurar variable de entorno MAVEN_HOME = C:\apache-maven-3.9.10
4. Agregar %MAVEN_HOME%\bin a la variable Path del sistema
5. Abrir CMD/PowerShell y verificar: mvn -v

Deberías ver algo similar a:
`
Apache Maven 3.9.10 ...
Java version: 21.0.12.1 ...
`

## Estructura del proyecto

`
KaratePetStoreTests/
├── pom.xml
├── readme.txt
├── conclusiones.txt
├── src/
│   └── test/
│       └── java/
│           ├── com/example/
│           │   └── UserCrudTest.java
│           ├── features/
│           │   └── UserCrud.feature
│           └── util/
│               └── common.js
└── target/ (generado tras ejecución)
`

## Funcionalidades probadas

El escenario ejecuta el ciclo completo de usuario:

1. **Crear un usuario** (POST /user)
2. **Buscar el usuario creado** (GET /user/{username})
3. **Actualizar nombre y correo del usuario** (PUT /user/{username})
4. **Buscar el usuario actualizado** (GET /user/{username})
5. **Eliminar el usuario** (DELETE /user/{username})

## Instrucciones de ejecución paso a paso

### 1. Verificar prerequisitos
`cmd
java --version
mvn -v
`
Ambos deben devolver información (Java 21+ y Maven 3.8+).

### 2. Ir al directorio del proyecto
`cmd
cd C:\Users\Documents\KaratePetStoreTests
`

### 3. Ejecutar las pruebas
`cmd
mvn clean test
`

### 4. Ejecutar solo el test de usuarios
`cmd
mvn test -Dtest=UserCrudTest
`

## Reportes

Tras la ejecución, los reportes HTML se generan en:
- 	arget/karate-reports/karate-summary.html (Resumen general)
- 	arget/karate-reports/com.example.UserCrudTest.html (Reporte detallado)

Para abrir el reporte, haz doble clic en karate-summary.html o ábrelo en tu navegador.