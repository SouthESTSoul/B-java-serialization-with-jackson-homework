package com.thoughtworks.capability.gtb.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;

public  class PersonVoSerializer extends StdSerializer<PersonVo> {

    protected PersonVoSerializer() {
        super(PersonVo.class);
    }

    @Override
    public void serialize(PersonVo value, JsonGenerator gen, SerializerProvider provider)
            throws IOException {
        gen.writeNumber(0);
    }
}