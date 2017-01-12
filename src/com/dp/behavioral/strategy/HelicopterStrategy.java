package com.dp.behavioral.strategy;

/**
 * Created by Administrator on 2017/1/12.
 */
public class HelicopterStrategy implements AbstractStrategy {
    @Override
    public String getTakeOffFeature() {
        return "Helicopter: VerticalTakeOff";
    }

    @Override
    public String getFlyFeature() {
        return "Helicopter: SubSonicFly";
    }
}
