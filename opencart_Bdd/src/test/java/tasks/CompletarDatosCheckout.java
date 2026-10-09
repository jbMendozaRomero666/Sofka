package com.Sofka.opencart.tasks;

import com.Sofka.opencart.userinterfaces.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompletarDatosCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(OpenCartPage.FIRST_NAME, isVisible()),

                Enter.theValue("pruebas")
                        .into(OpenCartPage.FIRST_NAME),

                Enter.theValue("sofka")
                        .into(OpenCartPage.LAST_NAME),

                Enter.theValue("pruebasSofka@gmail.com")
                        .into(OpenCartPage.EMAIL),

                Enter.theValue("11111111111")
                        .into(OpenCartPage.TELEPHONE),

                Enter.theValue("cr 22 # 30 - 60")
                        .into(OpenCartPage.ADDRESS),

                Enter.theValue("Bogota")
                        .into(OpenCartPage.CITY),

                Enter.theValue("11111")
                        .into(OpenCartPage.POSTCODE),

                SelectFromOptions.byVisibleText("Colombia")
                        .from(OpenCartPage.COUNTRY),

                SelectFromOptions.byVisibleText("Bogota D.C.")
                        .from(OpenCartPage.REGION),

                WaitUntil.the(
                        OpenCartPage.CONTINUAR_GUEST_FORM,
                        isClickable()
                ),

                Click.on(OpenCartPage.CONTINUAR_GUEST_FORM)
        );
    }

    public static CompletarDatosCheckout ahora() {
        return instrumented(CompletarDatosCheckout.class);
    }
}