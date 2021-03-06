package com.mbh.fractals.functions;

import com.mbh.fractals.common.FunctionParams;
import com.mbh.fractals.common.FunctionResult;
import com.mbh.math.Complex;

public class Mandelbrot implements IFunction {

    @Override
    public FunctionResult f(FunctionParams params) {
        Complex z = params.arg.getCopyOf();
        Complex z0 = params.arg.getCopyOf();
        int n = 1;
        while(z.getLengthSquared()<4.0 && n < params.maxIterations) {
            z.multiply(z);
            z.add(z0);
            n++;
        }
        return new FunctionResult(z, n, params);
    }
}
