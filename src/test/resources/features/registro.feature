Feature: Registro de usuario
  Como un nuevo usuario
  Quiero registrarme en la aplicación
  Para poder acceder a sus funcionalidades

  Scenario: Registro exitoso
    Given que el usuario está en la página de registro
    When el usuario ingresa sus datos válidos
    Then el sistema muestra un mensaje de registro exitoso