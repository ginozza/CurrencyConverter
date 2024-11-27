package com.aluracursos.converter.model;

public class ConvertedCurrency {
    private final double conversion;
    private final String sourceCurrencyCode;
    private final String targetCurrencyCode;
    private final int sourceAmount;

    public ConvertedCurrency(ConversionResult conversionResult, String sourceCurrencyCode, String targetCurrencyCode, int sourceAmount) {
        this.conversion = conversionResult.getConversionResult();
        this.sourceCurrencyCode = sourceCurrencyCode;
        this.targetCurrencyCode = targetCurrencyCode;
        this.sourceAmount = sourceAmount;
    }

    public double getConversion() {
        return conversion;
    }

    public String getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    public String getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    public int getSourceAmount() {
        return sourceAmount;
    }
}