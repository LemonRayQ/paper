package com.pzhu.lemon.security.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: paper
 * @description: 处理器抽象类
 * @author: LemonQ
 * @create: 2020-03-18 21:55
 **/
public abstract class AbstractHandler<P,R> {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public R handle(P request){

        long start = System.currentTimeMillis();
        log.info("【handler start...】,cost:{}",start);
        doBefore(request);

        R result = doHandle(request);

        long duration = (System.currentTimeMillis() - start);

        log.info("【handler end...】,cost:{},result:{}",duration,result);

        return result;

    }

    protected  abstract  R doHandle(P request);

    protected void doBefore(P request){

        //参数处理
        preProcessParams(request);
    }

    protected abstract void preProcessParams(P request);





}
