package com.kuang.demo01;

public class Proxy implements Rent{
    private Host host;

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        contract();
        fare();
    }

    public void seeHouse(){
        System.out.println("中介带你看房子");
    }
    public void contract(){
        System.out.println("和中介签定租赁合同");
    }
    public void fare(){
        System.out.println("收中介费");
    }

}
