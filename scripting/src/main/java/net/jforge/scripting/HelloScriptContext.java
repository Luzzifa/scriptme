package net.jforge.scripting;

import javax.script.SimpleScriptContext;

/**
 * purpose of this class?
 *
 * @author wolle_d
 */
public class HelloScriptContext extends SimpleScriptContext {
    public Integer hello() {
        System.out.println("Hello World!");
        return 21;
    }
}
