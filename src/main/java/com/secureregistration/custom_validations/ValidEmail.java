package com.secureregistration.custom_validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { ValidEmailValidator.class })
public @interface ValidEmail {

    String message() default "Email has invalid format";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
