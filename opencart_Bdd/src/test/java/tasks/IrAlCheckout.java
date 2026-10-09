package com.Sofka.opencart.tasks;

import com.Sofka.opencart.userinterfaces.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAlCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OpenCartPage.CHECKOUT)
        );
    }

    public static IrAlCheckout ahora() {
        return instrumented(IrAlCheckout.class);
    }
}