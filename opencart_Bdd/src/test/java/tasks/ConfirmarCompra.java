package com.Sofka.opencart.tasks;

import com.Sofka.opencart.userinterfaces.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmarCompra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Delivery Method
        actor.attemptsTo(
                WaitUntil.the(
                        OpenCartPage.CONTINUAR_SHIPPING_METHOD,
                        isVisible()
                ),
                Click.on(
                        OpenCartPage.CONTINUAR_SHIPPING_METHOD
                )
        );

        // Términos y condiciones
        actor.attemptsTo(
                WaitUntil.the(
                        OpenCartPage.TERMINOS_CONDICIONES,
                        isVisible()
                ),
                Click.on(
                        OpenCartPage.TERMINOS_CONDICIONES
                )
        );

        // Payment Method
        actor.attemptsTo(
                WaitUntil.the(
                        OpenCartPage.CONTINUAR_PAYMENT_METHOD,
                        isVisible()
                ),
                Click.on(
                        OpenCartPage.CONTINUAR_PAYMENT_METHOD
                )
        );

        // Confirmar orden
        actor.attemptsTo(
                WaitUntil.the(
                        OpenCartPage.CONFIRMAR_ORDEN,
                        isVisible()
                ),
                Click.on(
                        OpenCartPage.CONFIRMAR_ORDEN
                )
        );
    }

    public static ConfirmarCompra ahora() {
        return instrumented(ConfirmarCompra.class);
    }
}