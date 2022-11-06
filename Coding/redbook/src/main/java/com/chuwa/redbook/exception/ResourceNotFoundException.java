package com.chuwa.redbook.exception;

//@ResponseStatus cause Spring boot to respond with the specified HTTP status code
// whenever this exception is thrown from your controller.

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//Sometimes we have to define our own exception to show more specific information about the exception
//Why here we extend runtime exception rather than checked/compile exception?
// because this exception will only occur when we actually run this program (when we give a wrong api)
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private String resourceName;
    private String fieldName;
    private long fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
        // super is the father class RuntimeException
        // here we are just using the constructor of this super class RuntimeException
        // the parameter is an exception message (String) that we are trying to throw to upper level class
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public long getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(long fieldValue) {
        this.fieldValue = fieldValue;
    }
}
