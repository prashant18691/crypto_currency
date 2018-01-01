package com.zebpay.domain;
import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "market",
        "buy",
        "sell",
        "currency",
        "volume"
})
public class Zebpay {

    @JsonProperty("market")
    private Double market;
    @JsonProperty("buy")
    private Double buy;
    @JsonProperty("sell")
    private Double sell;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("volume")
    private Double volume;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("market")
    public Double getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(Double market) {
        this.market = market;
    }

    @JsonProperty("buy")
    public Double getBuy() {
        return buy;
    }

    @JsonProperty("buy")
    public void setBuy(Double buy) {
        this.buy = buy;
    }

    @JsonProperty("sell")
    public Double getSell() {
        return sell;
    }

    @JsonProperty("sell")
    public void setSell(Double sell) {
        this.sell = sell;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("volume")
    public Double getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Zebpay{" +
                "market=" + market +
                ", buy=" + buy +
                ", sell=" + sell +
                ", currency='" + currency + '\'' +
                ", volume=" + volume +
                '}';
    }
}
