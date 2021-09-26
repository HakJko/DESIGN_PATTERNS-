package edu.patterns.ik;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    void buildName() {
        website.setName("Enterprise Website");
    }

    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    void buildPrice() {
        website.setPrice(10000);
    }
}
