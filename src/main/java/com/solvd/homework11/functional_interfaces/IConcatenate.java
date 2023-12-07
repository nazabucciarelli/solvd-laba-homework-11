package com.solvd.homework11.functional_interfaces;

@FunctionalInterface
public interface IConcatenate<T> {
    String concatenate(T firstElement, T secondElement, T thirdElement);
}
