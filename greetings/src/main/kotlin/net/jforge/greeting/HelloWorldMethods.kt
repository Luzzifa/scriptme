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

package net.jforge.greeting

/**
 * purpose of this class?
 * @author wolle_d
 */
fun hello(): Int {
    println("Hello World")
    return 42
}

fun goodbye(value: Int): Int {
    println("Good bye World")
    return value/2
}
