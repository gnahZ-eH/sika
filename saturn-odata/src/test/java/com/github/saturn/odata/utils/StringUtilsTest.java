/*
 * MIT License
 *
 * Copyright (c) [2020] [He Zhang]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished
 *  to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.saturn.odata.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void equalsTest() {
        String s1 = "aa";
        String s3 = "";
        String s4 = "aa";

        assertTrue(StringUtils.equals(s4, s1));
        assertFalse(StringUtils.equals(null, s1));
        assertFalse(StringUtils.equals(s3, s1));
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    void testFirst2LowerCase() {
        String s = "ABCD";
        String t = "aBCD";
        assertEquals(StringUtils.first2LowerCase(s), t);

        String s1 = "";
        String t1 = "";
        assertEquals(StringUtils.first2LowerCase(s1), t1);

        String s2 = "abcd";
        String t2 = "abcd";
        assertEquals(StringUtils.first2LowerCase(s2), t2);

        String s3 = "a";
        String t3 = "a";
        assertEquals(StringUtils.first2LowerCase(s3), t3);
    }
}