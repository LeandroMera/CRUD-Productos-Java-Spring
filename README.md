1. Estructura recomendada del proyecto
CrudYProduct/           <-- raíz del proyecto
│
├── src/main/java/org/gorditodev/crudy/
│   ├── CrudYApplication.java
│   ├── product/
│   │   ├── Product.java
│   │   ├── ProductController.java
│   │   ├── ProductService.java
│   │   └── ProductRepository.java
│
├── src/main/resources/
│   ├── application.properties
│
├── .gitignore
└── README.md

2. Contenido del README.md
# CRUD de Productos con Spring Boot

Este proyecto es un **CRUD (Crear, Leer, Actualizar, Eliminar) de productos** desarrollado con **Spring Boot**, utilizando JPA/Hibernate para persistencia en base de datos.  

El proyecto permite gestionar productos con los siguientes campos:

- `id`: Identificador único (auto-generado)
- `name`: Nombre del producto (único)
- `price`: Precio del producto
- `fecha`: Fecha de creación o fabricación
- `antiguedad`: Calculada en años desde la fecha (opcional)

---

## **Tecnologías utilizadas**

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Lombok
- Base de datos H2 / MySQL (según configuración)
- Maven

---

## **Endpoints disponibles**

| Método | Endpoint                  | Descripción                     |
|--------|---------------------------|---------------------------------|
| GET    | `/api/v1/productos`       | Lista todos los productos       |
| POST   | `/api/v1/productos`       | Crea un nuevo producto          |
| PUT    | `/api/v1/productos`       | Actualiza un producto existente|
| DELETE | `/api/v1/productos/{id}`  | Elimina un producto por ID      |

**Ejemplo de JSON para POST/PUT:**
```json
{
  "name": "Producto A",
  "price": 25.5,
  "fecha": "2025-09-10"
}

Ejecución del proyecto

Clonar el repositorio:

git clone https://github.com/TU_USUARIO/CrudYProduct.git


Entrar al proyecto:

cd CrudYProduct


Ejecutar con Maven:

mvn spring-boot:run


El servidor correrá en:

http://localhost:8080

Notas

El proyecto permite manejar productos de manera simple.

Para producción, se recomienda usar MySQL o PostgreSQL en lugar de H2.

El campo antiguedad se puede calcular dinámicamente a partir de la fecha.
