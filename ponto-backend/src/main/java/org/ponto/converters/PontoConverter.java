package org.ponto.converters;

import org.ponto.enums.TipoAcaoPonto;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class PontoConverter implements AttributeConverter<TipoAcaoPonto, String> {
    @Override
    public String convertToDatabaseColumn(TipoAcaoPonto tipoAcaoPonto) {
        return (tipoAcaoPonto == null) ? null : tipoAcaoPonto.name();
    }

    @Override
    public TipoAcaoPonto convertToEntityAttribute(String dbTipoAcaoPonto) {
        return (dbTipoAcaoPonto == null) ? null : TipoAcaoPonto.valueOf(dbTipoAcaoPonto);
    }
}
