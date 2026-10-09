package com.Sofka.opencart.tasks;

import com.Sofka.opencart.userinterfaces.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IrAlCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(
                        OpenCartPage.CART_TOTAL,
                        isClickable()
                ),
                Click.on(
                        OpenCartPage.CART_TOTAL
                )
        );

        actor.attemptsTo(
                WaitUntil.the(
                        OpenCartPage.VER_CARRITO,
                        isClickable()
                ),
                Click.on(
                        OpenCartPage.VER_CARRITO
                )
        );
    }

    public static IrAlCarrito ahora() {
        return instrumented(IrAlCarrito.class);
    }
}