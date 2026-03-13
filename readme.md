#  AUTO_FRONT_SCREENPLAY

## Misión

Construir un test de pruebas automatizadas para el frontend, usando el patrón **Screenplay (Actores, Tareas, Acciones, Preguntas)**

### Caso: Automatización para un flujo end-to-end de creación de un pedido en una aplicación de generacion de pedido de mercancía

- **IDE** VSCode + Git Hub Copilot
- **Patron** Screenplay (Actores, Tareas, Acciones, Preguntas)
- **Framework de automatización** Serenity BDD
- **Gestion de dependencias** Gradle
- **Cumplir con el princpio de responsabilidad única para las Task**
- Test runner para cucumber

# ¿Cómo ejecutar este test?

## 1. Descargar el proyecto

Para ejecutar este test, usa tu cuenta de Sofka y accede al link
[Link de Google Drive de Sofka](https://drive.google.com/drive/folders/1fd5ftB2JeUtMxE3gc8sRAP8xQPv2_wLGON9dXGmKDNyYz4goqadB95OrTliKVbVzhv7Pj2xt)

En este link encontrarás un archivo comprimido llamado **Diagnostico-Semana0.zip**

puedes descargarlo descomprimirlo en tu entorno local para obtener el repositorio

*(opcional)*

También tienes la opción de descargar el proyewcto directamente desde nuestro repositorio

[Diagnostico-Semana0](https://github.com/Sofka-U/Diagnostico-Semana0.git)

En el enlace encontrarás las descripciones para armar el dockerizado y levantar el proyecto, pero si quieres más practicidad puedes descargar el repositorio desde el enlace adjunto

## 2. Ejecutar el proyecto en tu entorno local

### Instrucciones para el dockerizado - levantamiento del backend

1. **Generar Maven Wrapper** en cada servicio (necesario para build dentro del contenedor):
   ```bash
   cd Backend/usuario-service && mvn -N wrapper:wrapper
   cd Backend/pedido-service && mvn -N wrapper:wrapper
   ```

2. **Levantar todo con Docker Compose:**
   ```bash
   docker compose -f backend/docker-compose.yml up -d --build
   ```

#### Cómo detener Docker Compose

Para detener los servicios levantados con Docker Compose, ejecuta el siguiente comando:

```bash
docker compose -f backend/docker-compose.yml down
```

#### Inicializar sin Docker Desktop

Si no tienes Docker Desktop instalado, puedes usar Docker Compose desde la línea de comandos con Docker Engine. Asegúrate de tener Docker Engine y Docker Compose instalados correctamente.

1. **Verifica la instalación de Docker Engine y Compose:**
   ```bash
   docker --version
   docker compose version
   ```

2. **Levanta los servicios:**
   ```bash
   docker compose -f backend/docker-compose.yml up -d --build
   ```

3. **Detén los servicios:**
   ```bash
   docker compose -f backend/docker-compose.yml down
   ```

### Levantamiento del frontend (independiente)

En el repositorio de Diagnostico-Semana0 Entra a la carpeta del frontend y corre el proyecto

```bash
cd Frontend
cp .env.template .env
npm install
npm run dev
```

Frontend disponible en `http://localhost:3000` (o el puerto que indique Vite).


## URLs verificadas

| Servicio | URL |
|---|---|
| Usuarios | http://localhost:8083/users |
| Pedidos | http://localhost:8082/orders |
| RabbitMQ | http://localhost:15672 |
| pgAdmin | http://localhost:5050 |
| Frontend | http://localhost:3000 |

Siguiendo estas instrucciones estarás listo para ejecutar tu prueba automatizada

## 3. Ejecutar la prueba 

**Windows**

Abre una terminal (cmd o PowerShell) en la raíz del proyecto y ejecuta:

```
gradlew.bat clean test
```

**macOS / Linux**

Abre una terminal en la raíz del proyecto y ejecuta:

```
./gradlew clean test
```

**Comandos útiles adicionales:**

- Para compilar el proyecto sin ejecutar los tests:
   - Windows: `gradlew.bat build`
   - macOS/Linux: `./gradlew build`

- Para limpiar los archivos generados por Gradle:
   - Windows: `gradlew.bat clean`
   - macOS/Linux: `./gradlew clean`

Al finalizar, los reportes de Serenity estarán disponibles en la carpeta `target/site/serenity/`.

