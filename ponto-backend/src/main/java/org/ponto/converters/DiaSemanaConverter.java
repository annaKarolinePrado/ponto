package org.ponto.converters;
import org.ponto.enums.DiaSemana;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class DiaSemanaConverter implements AttributeConverter<DiaSemana, String> {

    @Override
    public String convertToDatabaseColumn(DiaSemana diaSemana) {
        return (diaSemana == null) ? null : diaSemana.name();
    }

    @Override
    public DiaSemana convertToEntityAttribute(String diaSemana) {
        return (diaSemana == null) ? null : DiaSemana.valueOf(diaSemana);
    }
}
