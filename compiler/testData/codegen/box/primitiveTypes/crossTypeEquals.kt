// TARGET_BACKEND: JS

fun <A: Double, T: Long> eqDL(a: A, b: T) = a == b

fun box(): String {
    assertTrue(eqDL(10.0, 10L))

    return "OK"
}