package com.tistory.ykyh.kotlin31dayssample

import org.junit.Assert
import org.junit.Test

class Day1 {

    @Test
    fun letTest() {
        println("== let ==")
        val string = "a"
        val result = string.let {
            println("this = $this, it = $it")
            2
        }
        println("result $result")
        Assert.assertEquals(2, result)
    }

    @Test
    fun applyTest() {
        println("== apply ==")
        val string = "a"
        val result = string.apply {
            println("this = $this, it = none")
            2
        }
        println("result $result")
        Assert.assertEquals("a", result)
    }

    @Test
    fun withTest() {
        println("== with ==")
        val string = "a"
        val result = with(string) {
            println("this = $this, it = none")
            2
        }
        println("result $result")
        Assert.assertEquals(2, result)
    }

    @Test
    fun runTest() {
        println("== run ==")
        val string = "a"
        val result = string.run {
            println("this = $this, it = none")
            2
        }
        println("result $result")
        Assert.assertEquals(2, result)

        val result2 = run {
            println("this = $this, it = none")
            1
        }
    }
}
