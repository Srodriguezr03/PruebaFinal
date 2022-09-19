Feature: Crear cuenta

  Scenario: Crear cuentas de Email
    Given Como un usuario que no tiene cuenta de Email
    When Quiero crear una Cuenta Con mis datos personales
    And Un passwd correcto
    Then Validar que la cuenta se pueda Crear
