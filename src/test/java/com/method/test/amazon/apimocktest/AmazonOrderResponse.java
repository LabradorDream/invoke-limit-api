package com.method.test.amazon.apimocktest;

import com.method.invoke.base.BaseResponse;

/**
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class AmazonOrderResponse implements BaseResponse {
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
