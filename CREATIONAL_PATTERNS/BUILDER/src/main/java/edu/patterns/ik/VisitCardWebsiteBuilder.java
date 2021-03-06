package edu.patterns.ik;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    void buildName() {
        website.setName("Visit Card");
    }

    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    void buildPrice() {
        website.setPrice(500);
    }
}
