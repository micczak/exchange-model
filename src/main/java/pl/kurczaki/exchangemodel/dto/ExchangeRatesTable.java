package pl.kurczaki.exchangemodel.dto;

import lombok.Data;

import java.util.List;

@Data
public class ExchangeRatesTable {
    private String table;

    private String no;

    private String tradingDate;

    private String effectiveDate;

    private List<CurrencyInfoDto> rates;
}

