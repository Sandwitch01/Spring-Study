package com.xiao;

public class Proxy implements Rent{
    private Host host;
    public  Proxy(){}
    public Proxy(Host host){
        this.host=host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public void rent() {
        contract();
        host.rent();
        fee();
    }
    public void fee(){
        System.out.println("收取中介费");
    }
    public void contract(){
        System.out.println("签订租赁合同");
    }
}
