package pl.kurczaki.exchangemodel.dto;

import lombok.Data;

import java.util.List;

@Data
public class ArrayOfExchangeRatesTable {
    private List<ExchangeRatesTable> exchangeRatesTable;
}

