package com.Sofka.opencart.tasks;

import com.Sofka.opencart.userinterfaces.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarGuestCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Seleccionar Guest Checkout
        actor.attemptsTo(
                WaitUntil.the(
                        OpenCartPage.GUEST_CHECKOUT,
                        isVisible()
                ),
                Click.on(
                        OpenCartPage.GUEST_CHECKOUT
                )
        );

        // Esperar el Continue y hacer clic
        actor.attemptsTo(
                WaitUntil.the(
                        OpenCartPage.CONTINUAR_GUEST,
                        isClickable()
                ),
                Click.on(
                        OpenCartPage.CONTINUAR_GUEST
                )
        );
    }

    public static SeleccionarGuestCheckout ahora() {
        return instrumented(SeleccionarGuestCheckout.class);
    }
}