package com.github.korosuke613.example.publish;

import java.util.ArrayList;

public class Sample {
    private ArrayList<String> calcLog = new ArrayList<>();

    public int sum(int a, int b) {
        var result = a + b;
        calcLog.add(String.valueOf(result));

        return result;
    }

    public String sum(String a, String b) {
        var result = a + b;
        calcLog.add(result);

        return a + b;
    }

    public ArrayList<String> getCalcLog() {
        return calcLog;
    }
}
