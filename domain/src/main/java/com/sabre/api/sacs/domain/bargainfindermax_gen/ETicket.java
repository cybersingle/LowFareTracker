
package com.sabre.api.sacs.domain.bargainfindermax_gen;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Ind"
})
public class ETicket {

    @JsonProperty("Ind")
    private Boolean Ind;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Ind
     */
    @JsonProperty("Ind")
    public Boolean getInd() {
        return Ind;
    }

    /**
     * 
     * @param Ind
     *     The Ind
     */
    @JsonProperty("Ind")
    public void setInd(Boolean Ind) {
        this.Ind = Ind;
    }

    public ETicket withInd(Boolean Ind) {
        this.Ind = Ind;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ETicket withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
