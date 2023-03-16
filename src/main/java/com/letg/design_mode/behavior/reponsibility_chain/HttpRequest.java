package com.letg.design_mode.behavior.reponsibility_chain;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 15:14
 * @Description:
 */


public class HttpRequest extends Request {
    public HttpRequest(Handler head) {
        super(head);
    }

    @Override
    void progress() {
        Handler handler = head;
        while (null != handler) {
            if (handler.handle()) handler = handler.next;
            else handler = null;
        }
    }
}
