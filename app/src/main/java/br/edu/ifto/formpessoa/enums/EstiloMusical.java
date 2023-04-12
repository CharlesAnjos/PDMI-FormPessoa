package br.edu.ifto.formpessoa.enums;

import org.apache.commons.lang3.StringUtils;

public enum EstiloMusical {
    ROCK,
    SERTANEJO,
    PAGODE,
    FORRO,
    OUTROS;
    public String toFormattedString(){
        return StringUtils.capitalize(this.toString().toLowerCase());
    }
}
