package com.Sofka.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OpenCartPage {

    public static final Target PRODUCTOS = Target.the("productos de OpenCart")
            .locatedBy(".product-thumb");

    public static final Target BOTON_AGREGAR_PRODUCTO = Target.the("botón agregar producto")
            .locatedBy(
                    "(//div[contains(@class,'product-thumb')])[{0}]//button[contains(@onclick,'cart.add')]"
            );

    public static final Target CART_TOTAL = Target.the("contador del carrito")
            .locatedBy("#cart-total");

    public static final Target VER_CARRITO = Target.the("enlace ver carrito")
            .locatedBy("a[href*='route=checkout/cart']");

    public static final Target PRODUCTOS_EN_CARRITO = Target.the("productos en el carrito")
            .locatedBy(".table-responsive tbody tr");

    public static final Target CHECKOUT = Target.the("botón Checkout")
            .locatedBy("//*[@id='content']/div[3]/div[2]/a");

    public static final Target GUEST_CHECKOUT = Target.the("opción Guest Checkout")
            .locatedBy(
                    "//*[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input"
            );

    public static final Target CONTINUAR_GUEST = Target.the("botón Continue de Guest Checkout")
            .locatedBy("//*[@id='button-account']");

    public static final Target FIRST_NAME = Target.the("nombre")
            .locatedBy("//*[@id='input-payment-firstname']");

    public static final Target LAST_NAME = Target.the("apellido")
            .locatedBy("//*[@id='input-payment-lastname']");

    public static final Target EMAIL = Target.the("correo electrónico")
            .locatedBy("//*[@id='input-payment-email']");

    public static final Target TELEPHONE = Target.the("teléfono")
            .locatedBy("//*[@id='input-payment-telephone']");

    public static final Target ADDRESS = Target.the("dirección")
            .locatedBy("//*[@id='input-payment-address-1']");

    public static final Target CITY = Target.the("ciudad")
            .locatedBy("//*[@id='input-payment-city']");

    public static final Target POSTCODE = Target.the("código postal")
            .locatedBy("//*[@id='input-payment-postcode']");

    public static final Target COUNTRY = Target.the("país")
            .locatedBy("//*[@id='input-payment-country']");

    public static final Target REGION = Target.the("región")
            .locatedBy("//*[@id='input-payment-zone']");

    public static final Target CONTINUAR_GUEST_FORM =
            Target.the("botón Continue del formulario")
                    .locatedBy("//*[@id='button-guest']");

    public static final Target CONTINUAR_SHIPPING_METHOD =
            Target.the("botón Continue de Delivery Method")
                    .locatedBy("//*[@id='button-shipping-method']");

    public static final Target TERMINOS_CONDICIONES =
            Target.the("términos y condiciones")
                    .locatedBy("//*[@id='collapse-payment-method']/div/div[3]/div/input[1]");

    public static final Target CONTINUAR_PAYMENT_METHOD =
            Target.the("botón Continue de Payment Method")
                    .locatedBy("//*[@id='button-payment-method']");

    public static final Target CONFIRMAR_ORDEN =
            Target.the("botón Confirm Order")
                    .locatedBy("//*[@id='button-confirm']");

    public static final Target MENSAJE_CONFIRMACION =
            Target.the("mensaje de confirmación de compra")
                    .locatedBy("//*[@id='content']/h1");
}