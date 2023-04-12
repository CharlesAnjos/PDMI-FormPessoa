package br.edu.ifto.formpessoa.enums;

import org.apache.commons.lang3.StringUtils;

public enum Sexo {
    MASCULINO,
    FEMININO,
    OUTRO;
    
    public String toFormattedString(){
        return StringUtils.capitalize(this.toString().toLowerCase());
    }
}
