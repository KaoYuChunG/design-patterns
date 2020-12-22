package com.structural.flyweight;

public class Client {
    public static void main(String[] args){
        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite1 = factory.getWebSiteCategory("news");
        webSite1.use(new User("Kao"));

        WebSite webSite2 = factory.getWebSiteCategory("news");
        webSite1.use(new User("Brun"));

        WebSite webSite4 = factory.getWebSiteCategory("sport");
        webSite1.use(new User("Lucas"));

        WebSite webSite5 = factory.getWebSiteCategory("sport");
        webSite1.use(new User("Steve"));

        System.out.println("count of site-->"+ factory.getWebSiteCount());


    }
}
