package com.fasterxml.jackson.module.jsonSchema.validation;

import com.fasterxml.jackson.databind.BeanProperty;

/**
 * @author cponomaryov
 */
public interface ValidationConstraintResolver {

  String getTitle(BeanProperty prop);

  Boolean readonly(BeanProperty prop);

  Boolean hidden(BeanProperty prop);

  String formType(BeanProperty prop);

  Integer getArrayMaxItems(BeanProperty prop);

  Integer getArrayMinItems(BeanProperty prop);

  Double getNumberMaximum(BeanProperty prop);

  Double getNumberMinimum(BeanProperty prop);

  Integer getStringMaxLength(BeanProperty prop);

  Integer getStringMinLength(BeanProperty prop);

  String getStringPattern(BeanProperty prop);
}
