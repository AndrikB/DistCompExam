package com.blagij.calculator;

import java.rmi.Remote;
import java.util.List;

public interface Calculator extends Remote {
    List<Double> calculate(double a, double xFrom, double xTo, double step);
}
