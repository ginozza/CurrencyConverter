package com.aluracursos.converter.model;

public record ConversionRequest(String uri, String sourceCurrencyCode, String targetCurrencyCode, int amount) {
}