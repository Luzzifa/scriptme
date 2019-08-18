package net.jforge.scripting;

import org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine;

import javax.script.*;

/**
 * purpose of this class?
 *
 * @author wolle_d
 */
public class TestKotlinScripting
{
  public static void main(String[] argv) throws Exception {
    scriptingHost();
  }

  private static void runScriptEngine() throws ScriptException {
    System.setProperty("idea.home.path", "C:\\Develop\\Toolbox\\apps\\IDEA-JDK11\\ch-0\\191.7479.1");
    ScriptEngine kts = new ScriptEngineManager().getEngineByExtension("kts");
    System.out.println("result = "+kts.eval("3+3"));
  }

  private static void scriptingHost() throws ScriptException {
    KotlinJsr223JvmLocalScriptEngine engine =
            (KotlinJsr223JvmLocalScriptEngine) new ScriptEngineManager().getEngineByExtension("kts");

    CompiledScript compiledScript = engine.compile("3+3");

    System.out.println("result = "+compiledScript.eval());
  }
}
