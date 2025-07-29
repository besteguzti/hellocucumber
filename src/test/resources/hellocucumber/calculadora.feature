Feature: Calculadora básica

  Scenario: Suma de dos valores
    Given la calculadora está encendida
    When sumo 77 y 3
    Then el resultado debe ser 80

  Scenario: Resta de dos valores
    Given la calculadora está encendida
    When resto 99 y 4
    Then el resultado debe ser 95

  Scenario: Multiplicación de dos valores
    Given la calculadora está encendida
    When multiplico 7 y 7
    Then el resultado debe ser 49

  Scenario: División de dos valores
    Given la calculadora está encendida
    When divido 100 y 5
    Then el resultado debe ser 20
