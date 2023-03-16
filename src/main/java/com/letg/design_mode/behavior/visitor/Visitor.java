package com.letg.design_mode.behavior.visitor;

import java.security.cert.Extension;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 15:37
 * @Description:
 */


public interface Visitor {
  int visit(Expression expression);
}
