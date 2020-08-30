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

import com.github.saturn.odata.annotations.ODataEntitySet;
import com.github.saturn.odata.annotations.ODataEntityType;
import com.github.saturn.odata.exceptions.SaturnODataException;

import java.lang.reflect.Field;

public class ExceptionUtils {

    private ExceptionUtils() { }

    public static void assertNotNull(ODataEntityType oDataEntityType, Field field) throws SaturnODataException {
        if (oDataEntityType == null) {
            throw new SaturnODataException("Can't get the EntityType from the field with ODataNavigationProperty: " + field);
        }
    }

    public static void assertNotNull(ODataEntitySet oDataEntitySet, Field field) throws SaturnODataException {
        if (oDataEntitySet == null) {
            throw new SaturnODataException("Can't get the EntitySet from the field with ODataNavigationProperty: " + field);
        }
    }
}