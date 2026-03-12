Feature Outline: Registro y creación de pedido por un administrador
  Como administrador, quiero registrar un perfil y crear un pedido, 
  para gestionar los productos de manera eficiente.

  Scenario Outline: Registro exitoso y creación de pedido
    Given el administrador esta en el home de la aplicacion
    When da click al boton "Agregar Usuario"
    And llena el formulario de registro con los datos:
      | Nombre completo | <nombre_completo> |
      | Correo electronico | <correo_electronico> |
      | Contraseña | <Contraseña> |
    And da click al boton "Registrar Administrador"
    Then ve un mensaje que dice "El usuario fue registrado correctamente."
    And vuelve al home de la aplicacion
    When da click al boton "Agregar pedido"
    And llena el formulario de nuevo pedido con los datos:
      | Email del usuario | <email_usuario> |
      | Nombre del Producto | <nombre_producto> |
      | Notas adicionales | <notas_adicionales> |
    And da click al boton "Crear Pedido"
    Then es redirigido al home de la aplicacion
    And puede ver su pedido en la lista de pedidos.

    Examples:
      | nombre_completo   | correo_electronico     | contrasena   | email_usuario       | nombre_producto | notas_adicionales |
      | Juan Perez        | juan.perez@email.com  | Admin1234   | juan.perez@email.com | Laptop          | Entregar urgente  |
      | Maria Gonzalez    | maria.gonzalez@email.com | Maria2023   | maria.gonzalez@email.com | Celular         |                   |Feature: Registro de usuario
  Como un nuevo usuario
  Quiero registrarme en la aplicación
  Para poder acceder a sus funcionalidades

  Scenario: Registro exitoso
    Given que el usuario está en la página de registro
    When el usuario ingresa sus datos válidos
    Then el sistema muestra un mensaje de registro exitoso