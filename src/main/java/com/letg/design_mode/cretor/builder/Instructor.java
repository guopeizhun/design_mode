package com.letg.design_mode.cretor.builder;

import java.util.Map;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 16:14
 * @Description:
 */


public class Instructor {
    private HttpRequestBuilder builder;

    public Instructor() {
        builder = new HttpRequestBuilder();
    }

    public HttpRequest concreateReq(Map<String, Object> headers, String body, String row) {
        builder.buildRow(row);
        builder.buildHeader(headers);
        builder.buildBody(body);
        return builder.build();
    }
}
