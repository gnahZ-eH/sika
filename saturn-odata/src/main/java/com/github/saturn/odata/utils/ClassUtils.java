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

import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ClassUtils {

    private ClassUtils() { }

    public static List<Field> getFields(Class<?> clazz) {
        return getFields(clazz, true);
    }

    public static List<Field> getFields(Class<?> clazz, boolean superClass) {
        List<Field> fields = new ArrayList<>(Arrays.asList(clazz.getDeclaredFields()));
        if (superClass) {
            Class<?> superClazz = clazz.getSuperclass();
            if (superClazz != null) {
                fields.addAll(Arrays.asList(superClazz.getDeclaredFields()));
            }
        }
        return fields;
    }

    public static ClassPathScanningCandidateComponentProvider createComponentScanner(Iterable<Class<? extends Annotation>> annotations) {
        ClassPathScanningCandidateComponentProvider provider =
                new ClassPathScanningCandidateComponentProvider(false);
        for (Class<? extends Annotation> annotation : annotations) {
            provider.addIncludeFilter(new AnnotationTypeFilter(annotation));
        }
        return provider;
    }
}
