http://localhost:8080/api/
endpoint de usuarios: /api/usuarios
endpoint de productos /api/productos
endpoint de pedidos /api/pedidos

hay en casos que el proyecto no se porque borra y sobrescribe todo lo de application.properties asi que aquí dejo lo que debería ir ahi
spring.datasource.url=jdbc:mysql://localhost:3306/ecomarket_db?useSSL=false
spring.datasource.username=root
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true