package com.westlund.animalownerbackend.exception;

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L; //Används gör versionskontroll av våra objekt
    private String objClass;
    private String field;
    private Object value;

    public ResourceNotFoundException(String objClass, String field, Object value) {
        super(String.format("%s not found with %s : '%s'", objClass, field, value));
        this.objClass = objClass;
        this.field = field;
        this.value = value;
    }

    public String getObjClass() {
        return objClass;
    }

    public String getField() {
        return field;
    }

    public Object getValue() {
        return value;
    }
}
