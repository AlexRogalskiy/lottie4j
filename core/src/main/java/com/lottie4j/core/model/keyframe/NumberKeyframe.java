package com.lottie4j.core.model.keyframe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumberKeyframe extends BigDecimal implements Keyframe {

    public NumberKeyframe(Integer val) {
        super(val);
    }

    public NumberKeyframe(Double val) {
        super(val);
    }
}

