Feature: Registro y creacion de pedido por un administrador
  Como administrador, quiero registrar un perfil y crear un pedido,
  para gestionar los productos de manera eficiente.

  Scenario Outline: Registro exitoso y creacion de pedido
    Given el administrador esta en el home de la aplicacion
    When da click al boton "Agregar Usuario"
    And llena el formulario de registro con los datos:
      | Nombre completo | <nombre_completo> |
      | Correo electronico | <correo_electronico> |
      | Contrasena | <Contrasena> |
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
    And puede ver su pedido en la lista de pedidos con los siguientes datos:
      | ID | <id> |
      | Nombre | <nombre> |
      | Descripcion | <descripcion> |
      | ID Usuario | <id_usuario> |
      | Estado | <estado> |
      | Activo | <activo> |

    Examples:
      | nombre_completo | correo_electronico | Contrasena | email_usuario | nombre_producto | notas_adicionales | id | nombre | descripcion | id_usuario | estado | activo |
      | Juan Perez | juan.perez@email.com | Admin1234 | juan.perez@email.com | Laptop | Entregar urgente | 1 | Pedido A | Descripcion del pedido A | 1 | PROCESSING | true |