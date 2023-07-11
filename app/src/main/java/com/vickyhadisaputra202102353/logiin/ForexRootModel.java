package com.vickyhadisaputra202102353.logiin;

import com.google.gson.annotations.SerializedName;

public class ForexRootModel {
    @SerializedName("rates")
    private ForexRatesModel ratesModel;

    public ForexRootModel() {}

    public ForexRatesModel getRatesModel() { return ratesModel; }

    public void setRatesModel(ForexRatesModel ratesModel) {this.ratesModel = ratesModel; }
}
