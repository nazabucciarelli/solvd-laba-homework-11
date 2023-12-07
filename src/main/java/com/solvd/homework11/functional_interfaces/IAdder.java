package com.solvd.homework11.functional_interfaces;

@FunctionalInterface
public interface IAdder<N> {
    N sum(N firstNumber, N secondNumber, N thirdNumber);
}
