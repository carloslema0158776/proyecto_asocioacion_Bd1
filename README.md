# Sistema de gestión para una asociación de agricultores

**Asignatura:** Base de Datos I  
**Tipo de proyecto:** Proyecto académico de modelado e implementación de base de datos, acompañado de una aplicación de escritorio.

## Descripción

Este proyecto modela y gestiona información de una asociación de agricultores. La base de datos permite representar miembros, proveedores, insumos, maquinaria, capacitaciones, membresías, pagos, cultivos, productos, contratos y convenios, entre otras entidades relacionadas.

Incluye una aplicación de escritorio en Java Swing conectada a PostgreSQL que ofrece operaciones de registro y consulta, además de reportes.

## Funcionalidades implementadas

- Registro de miembros y búsqueda por cédula.
- Registro o simulación de pagos de membresías.
- Importación de información desde Excel.
- Consulta de miembros por beneficio y contratos por monto.
- Funciones SQL, vistas y triggers para operaciones y reglas en la base de datos.

## Tecnologías

- **PostgreSQL** y **SQL:** tablas relacionadas, claves primarias y foráneas, funciones, vistas y triggers.
- **Java** y **Swing:** interfaz de escritorio.
- **JDBC:** comunicación con la base de datos.
- **Maven:** dependencias de la aplicación, incluidas Apache POI y OpenCSV.

## Organización

- [`sql/`](sql/): scripts de creación de tablas, funciones, vistas y triggers.
- [`app/`](app/): proyecto Maven de la aplicación Java y sus recursos.

## Ejecución local (orientativa)

1. Instalar PostgreSQL, JDK 11 o posterior y Maven.
2. Crear en PostgreSQL una base de datos llamada `proyecto_bd1`.
3. Ejecutar el script `sql/Creacion de Tablas.sql` y las funciones, vistas y triggers necesarios de `sql/`. Revisar el orden de dependencias antes de ejecutarlos.
4. Definir la contraseña de PostgreSQL mediante la variable de entorno `BD1_DB_PASSWORD`. Opcionalmente definir `BD1_DB_USER` y `BD1_DB_URL`.
5. Abrir la carpeta `app/` como proyecto Maven en IntelliJ IDEA y ejecutar `org.asociacion.App`.

> **Nota:** La aplicación requiere que la base PostgreSQL esté configurada y que existan las funciones que invoca. El procedimiento no ha sido probado de extremo a extremo en este paquete.

## Alcance del repositorio público

Se comparten el código fuente de la aplicación y los scripts SQL correspondientes a **Base de Datos I**. No se incluyen hojas de cálculo de datos originales, documentos administrativos ni archivos compilados, para evitar divulgar información potencialmente personal o innecesaria. Las credenciales de conexión se configuran localmente y no deben publicarse en GitHub.
