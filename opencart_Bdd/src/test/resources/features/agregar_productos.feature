Feature: Compra de productos en OpenCart

  Scenario: Comprar dos productos como invitado
    Given que el usuario ingresa a OpenCart
    When agrega dos productos aleatorios al carrito
    And visualiza el carrito
    Then el carrito debe contener dos productos
    When procede al checkout
    And selecciona Guest Checkout
    And completa los datos del checkout
    And confirma la compra
    Then la compra debe mostrar el mensaje de confirmación