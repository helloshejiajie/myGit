package com.framestudy.staticProxy.impl;

import com.framestudy.staticProxy.IManService;
import com.framestudy.staticProxy.beans.Girl;

/**
 * 代理男人类
 *
 * @author Administrator
 */
public class ProxyMan implements IManService {

    private RealMan man = null;

    public ProxyMan() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ProxyMan(Girl girl) {
        man = new RealMan(girl);
    }

    public void writeLetter() {
        // TODO Auto-generated method stub
        man.writeLetter();
    }

    public void getFlower() {
        // TODO Auto-generated method stub
        man.getFlower();
    }

}
