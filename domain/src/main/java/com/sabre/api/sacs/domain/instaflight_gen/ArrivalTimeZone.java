
package com.sabre.api.sacs.domain.instaflight_gen;

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
    "GMTOffset"
})
public class ArrivalTimeZone {

    @JsonProperty("GMTOffset")
    private Integer GMTOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The GMTOffset
     */
    @JsonProperty("GMTOffset")
    public Integer getGMTOffset() {
        return GMTOffset;
    }

    /**
     * 
     * @param GMTOffset
     *     The GMTOffset
     */
    @JsonProperty("GMTOffset")
    public void setGMTOffset(Integer GMTOffset) {
        this.GMTOffset = GMTOffset;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
