Feature: Calculadora básica

  Scenario: Suma de dos valores
    Given la calculadora está encendida
    When sumo 5 y 3
    Then el resultado debe ser 8

  Scenario: Resta de dos valores
    Given la calculadora está encendida
    When resto 10 y 4
    Then el resultado debe ser 6

  Scenario: Multiplicación de dos valores
    Given la calculadora está encendida
    When multiplico 7 y 6
    Then el resultado debe ser 42

  Scenario: División de dos valores
    Given la calculadora está encendida
    When divido 20 y 5
    Then el resultado debe ser 4
