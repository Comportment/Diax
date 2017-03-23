package io.bfnt.comportment.diax.api.command;

import java.lang.annotation.*;

/**
 * Created by Comporment on 23/03/2017 at 21:51
 * Dev'ving like a sir since 1998. | https://github.com/Comportment
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandDescription
{
    String emoji() default "";
    String name() default "";
    String args() default "";
}