Feature: Validaciones de campos

  Scenario Outline: : Validaciones de campos de Email
    Given Como un usuario que no tiene cuenta de Email
    When Validar <username> de correos
    And  Validar <pass> y <Ppass>
    Then Validar que la cuenta se pueda Crear
    Examples:

      |      username     |       pass         |        Ppass          |
      |   "luiselmejor++" |     "123456"       |        "123456"       |
      |"comolombiamindia" |   "nosevamundial"  |    "nosevamundial99"  |
      |"juanescantante884"|"coloqueloquequier2"|  "coloqueloquequier2" |