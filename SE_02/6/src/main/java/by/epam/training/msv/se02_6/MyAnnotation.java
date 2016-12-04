package by.epam.training.msv.se02_6;

import java.lang.annotation.*;

@Documented
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.SOURCE)
public @interface MyAnnotation {
	String value();
}
