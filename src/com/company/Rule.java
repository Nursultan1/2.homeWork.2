package com.company;

public class Rule {
    private int ruleSize;
    private String companyName;

    public Rule(int ruleSize, String companyName) {
        this.ruleSize = ruleSize;
        this.companyName = companyName;
    }

    public int getRuleSize() {
        return ruleSize;
    }

    public void setRuleSize(int ruleSize) {
        this.ruleSize = ruleSize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

