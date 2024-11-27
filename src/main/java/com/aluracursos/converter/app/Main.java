package com.aluracursos.converter.app;

import com.aluracursos.converter.controller.CurrencyController;

public class Main {
    public static void main(String[] args) {
        CurrencyController currencyController = new CurrencyController();

        currencyController.initialize();
    }
}
