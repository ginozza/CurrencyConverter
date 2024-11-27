package com.aluracursos.converter.controller;

import com.aluracursos.converter.model.*;
import com.aluracursos.converter.view.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CurrencyController {
    private String APIkey = "650b3f9aab1efc30dc526c96";
    private String[] currencyCodes = {
            "USD", "COP", "BWP", "BYN", "BZD", "CAD", "CDF", "PEN",
            "ARS", "EUR", "BRL", "MXN", "CNY", "JPY"};
    private int currenciesQuantity = currencyCodes.length;
    private Gson gson = new Gson();
    LookAndFeel lf = new LookAndFeel();

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        String uriCurrencies = "https://openexchangerates.org/api/currencies.json";
        String currencyNames = ApiHttpClient.FetchHTTP(uriCurrencies);
        JsonObject currencyNamesJson = gson.fromJson(currencyNames, JsonObject.class);

        String proceed = "y";
        while (proceed.equals("y")) {
            Menu menu = new Menu();
            menu.showMenu();
            showAvailableCurrencies(currencyNamesJson);

            ConversionRequest request = getConversionRequest();
            String conversionResult = ApiHttpClient.FetchHTTP(request.uri());
            ConversionResult result = gson.fromJson(conversionResult, ConversionResult.class);
            ConvertedCurrency convertedCurrency = new ConvertedCurrency(
                    result,
                    request.sourceCurrencyCode(),
                    request.targetCurrencyCode(),
                    request.amount()
            );

            System.out.println(
                    lf.green(String.format(
                            "%d %s = %f %s",
                            convertedCurrency.getSourceAmount(),
                            convertedCurrency.getSourceCurrencyCode(),
                            convertedCurrency.getConversion(),
                            convertedCurrency.getTargetCurrencyCode()
                    ))
            );

            System.out.println(lf.cyan("¿Do you want to do it again? [y/n]"));
            proceed = scanner.nextLine().toLowerCase();
        }
        scanner.close();
        System.out.println(lf.blue("Good bye!~"));
    }

    @NotNull
    private ConversionRequest getConversionRequest() {
        InputHandler inputHandler = new InputHandler();
        int sourceCurrency = inputHandler.Numero(
                lf.cyan("Enter the number of the currency you want to convert: "),
                lf.red("Invalid option!"),
                currenciesQuantity);
        int targetCurrency = inputHandler.Numero(
                lf.cyan("Enter the number of the currency you want to convert to: "),
                lf.red("Invalid option!"),
                currenciesQuantity);
        int amount = inputHandler.Numero(
                lf.cyan("Enter the amount you want to convert: "),
                lf.red("Invalid option!"),
                0);

        String sourceCurrencyCode = currencyCodes[sourceCurrency - 1];
        String targetCurrencyCode = currencyCodes[targetCurrency - 1];
        String uriConversion =
                "https://v6.exchangerate-api.com/v6/"
                        + APIkey
                        + "/pair/"
                        + sourceCurrencyCode
                        + "/"
                        + targetCurrencyCode
                        + "/"
                        + amount;

        return new ConversionRequest(uriConversion, sourceCurrencyCode, targetCurrencyCode, amount);
    }

    public void showAvailableCurrencies(JsonObject currencyNamesJson) {
        for (int i = 0; i < currenciesQuantity; i++) {
            try {
                String currencyName = currencyNamesJson.get(currencyCodes[i]).getAsString();
                System.out.println(lf.cyan((i + 1) + ". " + currencyName));
            } catch (NullPointerException e) {
                System.out.println(lf.red("Currency not found"));
            }
        }
    }
}