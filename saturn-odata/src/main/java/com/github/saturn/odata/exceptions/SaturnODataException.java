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

package com.github.saturn.odata.exceptions;

import org.apache.olingo.commons.api.ex.ODataException;
import org.apache.olingo.commons.api.http.HttpStatusCode;

public class SaturnODataException extends ODataException {

    private int statusCode;

    public SaturnODataException(final String exceptionMessage, final Throwable cause) {
        super(exceptionMessage, cause);
    }

    public SaturnODataException(final String format, final Object... args) {
        super(String.format(format, args));
    }

    public SaturnODataException(final HttpStatusCode httpStatus, final String format, final Object... args) {
        super(String.format(format, args));
        this.statusCode = httpStatus.getStatusCode();
    }

    public SaturnODataException(final String exceptionMessage) {
        super(exceptionMessage);
    }

    public SaturnODataException(final Throwable cause) {
        super(cause);
    }

    public SaturnODataException(final HttpStatusCode httpStatus, final String exceptionMessage) {
        super(exceptionMessage);
        this.statusCode = httpStatus.getStatusCode();
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
