package pl.kurczaki.exchangemodel.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;


@Getter
@Builder
public class CurrencyInfoDto {

    private String currency;
    private String code;
    private BigDecimal bid;
    private BigDecimal ask;

}
