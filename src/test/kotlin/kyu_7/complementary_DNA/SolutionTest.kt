package kyu_7.complementary_DNA

import kyu_7.complementary_DNA.Solution.makeComplement
import org.junit.Assert.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun test01() {
        assertEquals("TTTT", makeComplement("AAAA"));
    }

    @Test
    fun test02() {
        assertEquals("TAACG", makeComplement("ATTGC"));
    }
}