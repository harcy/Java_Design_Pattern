package com.dp.behavioral.strategy;

/**
 * Created by Administrator on 2017/1/12.
 */
public class HarrierStrategy implements AbstractStrategy {
    @Override
    public String getTakeOffFeature() {
        return "Harrier: VerticalTakeOff";
    }

    @Override
    public String getFlyFeature() {
        return "Harrier: SuperSonicFly";
    }
}
