package com.letg.design_mode.cretor.builder;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 15:47
 * @Description:
 */


public class HttpRequest {
    private Map<String,Object> header;
    private String body;
    private String row;


    public Map<String, Object> getHeader() {
        return header;
    }

    public void setHeader(Map<String, Object> header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "header=" + header +
                ", body='" + body + '\'' +
                ", row='" + row + '\'' +
                '}';
    }
}
