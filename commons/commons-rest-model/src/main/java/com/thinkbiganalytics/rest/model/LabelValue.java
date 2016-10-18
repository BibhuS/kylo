package com.thinkbiganalytics.rest.model;

/**
 * Created by sr186054 on 3/15/16.
 */
public class LabelValue {
    private String label;
    private String value;
    private String hint;

    public LabelValue(){

    }

    public LabelValue(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public LabelValue(String label, String value, String hint) {
        this.label = label;
        this.value = value;
        this.hint = hint;
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}
