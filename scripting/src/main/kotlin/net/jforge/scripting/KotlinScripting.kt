/*
 * Copyright (c) 2019. Wolfgang Deifel, jforge.net, luzzifa.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License..
 *
 */

package net.jforge.scripting

//import org.jetbrains.kotlin.cli.common.repl.ScriptArgsWithTypes
import org.jetbrains.kotlin.cli.common.repl.ScriptArgsWithTypes
import org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine
import org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngineFactory
import javax.script.Bindings
import javax.script.ScriptContext
import javax.script.ScriptEngineManager
import kotlin.script.experimental.jvm.util.scriptCompilationClasspathFromContextOrStdlib

/**
 * purpose of this class?
 * @author wolle_d
 */
fun main(args: Array<String>) {

    System.setProperty("idea.use.native.fs.for.win", "false")
    val engine = ScriptEngineManager().getEngineByExtension("kts") as KotlinJsr223JvmLocalScriptEngine

    with(engine) {
        val res1 = eval("import net.jforge.greeting.goodbye")
        println(eval("this.javaClass.superclass"))
        val res2 = compile("""
import net.jforge.greeting.hello
println("hello✌✌😍❤")
hello()
""")
        val res3 = compile(
            "goodbye(9422)")
        val res4 = compile(
            "net.jforge.scripting.HelloScriptContext().hello()")
        val res5 = compile(
            "import net.jforge.scripting.helloMe\n" +
                "helloMe()")
        println(res2.eval())
        println(res3.eval())
        println(res4.eval())
        println(res5.eval())
        this.javaClass.superclass
    }

    val factory = KotlinJsr223JvmLocalScriptEngineFactory()
    val engine2 = KotlinJsr223JvmLocalScriptEngine(
        factory,
        scriptCompilationClasspathFromContextOrStdlib("kotlin-script-util.jar", wholeClasspath = true),
        MyScriptTemplate::class.qualifiedName!!,
        { ctx, types -> ScriptArgsWithTypes(arrayOf(ctx.getBindings(ScriptContext.ENGINE_SCOPE)), types ?: emptyArray()) },
        arrayOf(Bindings::class)
    )
    with(engine2) {
        val res1 = eval("import net.jforge.greeting.goodbye")
        val res2 = compile("helloYou()")
        val res3 = compile("goodbye(9422)")
        println(res2.eval())
        println(res3.eval())
        println(eval("this.javaClass.superclass"))
        this.javaClass.superclass
    }
}
