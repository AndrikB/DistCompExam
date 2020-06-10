package com.blagij.client;

import com.blagij.rmi.Calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class RmiClient {
    private final Calculator calculator;

    public RmiClient() throws RemoteException, NotBoundException, MalformedURLException {
        String remoteURL = "//127.0.0.1:1234/calc";
        calculator = (Calculator) Naming.lookup(remoteURL);
        System.out.println("RMI object found");
    }

    public List<Double> calculate(double a, double xFrom, double xTo, double step) throws RemoteException {
        return calculator.calculate(a,xFrom,xTo,step);
    }
}
