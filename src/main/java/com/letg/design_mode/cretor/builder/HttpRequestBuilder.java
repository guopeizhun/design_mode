package com.letg.design_mode.cretor.builder;

import java.util.Map;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 15:54
 * @Description:
 */


public class HttpRequestBuilder {
  private HttpRequest request;
  public HttpRequestBuilder(){
      this.request = new HttpRequest();
  }
  public HttpRequestBuilder buildHeader(Map<String,Object> headers){
        this.request.setHeader(headers);
        return this;
  }
  public HttpRequestBuilder buildBody(String body){
      this.request.setBody(body);
      return this;
  }

  public HttpRequestBuilder buildRow(String row){
      this.request.setRow(row);
      return this;
  }
  public HttpRequest build(){
      return this.request;
  }


}
