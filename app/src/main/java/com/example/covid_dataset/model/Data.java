package com.example.covid_dataset.model;

import java.util.List;

public class Data{


    private List<CasesTimeSeriesBean> cases_time_series;
    private List<StatewiseBean> statewise;
    private List<TestedBean> tested;

    public List<CasesTimeSeriesBean> getCases_time_series() {
        return cases_time_series;
    }

    public void setCases_time_series(List<CasesTimeSeriesBean> cases_time_series) {
        this.cases_time_series = cases_time_series;
    }

    public List<StatewiseBean> getStatewise() {
        return statewise;
    }

    public void setStatewise(List<StatewiseBean> statewise) {
        this.statewise = statewise;
    }

    public List<TestedBean> getTested() {
        return tested;
    }

    public void setTested(List<TestedBean> tested) {
        this.tested = tested;
    }

    public static class CasesTimeSeriesBean {
        /**
         * dailyconfirmed : 1
         * dailydeceased : 0
         * dailyrecovered : 0
         * date : 30 January
         * totalconfirmed : 1
         * totaldeceased : 0
         * totalrecovered : 0
         */

        private String dailyconfirmed;
        private String dailydeceased;
        private String dailyrecovered;
        private String date;
        private String totalconfirmed;
        private String totaldeceased;
        private String totalrecovered;

        public String getDailyconfirmed() {
            return dailyconfirmed;
        }

        public void setDailyconfirmed(String dailyconfirmed) {
            this.dailyconfirmed = dailyconfirmed;
        }

        public String getDailydeceased() {
            return dailydeceased;
        }

        public void setDailydeceased(String dailydeceased) {
            this.dailydeceased = dailydeceased;
        }

        public String getDailyrecovered() {
            return dailyrecovered;
        }

        public void setDailyrecovered(String dailyrecovered) {
            this.dailyrecovered = dailyrecovered;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTotalconfirmed() {
            return totalconfirmed;
        }

        public void setTotalconfirmed(String totalconfirmed) {
            this.totalconfirmed = totalconfirmed;
        }

        public String getTotaldeceased() {
            return totaldeceased;
        }

        public void setTotaldeceased(String totaldeceased) {
            this.totaldeceased = totaldeceased;
        }

        public String getTotalrecovered() {
            return totalrecovered;
        }

        public void setTotalrecovered(String totalrecovered) {
            this.totalrecovered = totalrecovered;
        }
    }

    public static class StatewiseBean {
        /**
         * active : 628301
         * confirmed : 2152020
         * deaths : 43453
         * deltaconfirmed : 65156
         * deltadeaths : 875
         * deltarecovered : 52135
         * lastupdatedtime : 08/08/2020 23:27:31
         * migratedother : 462
         * recovered : 1479804
         * state : Total
         * statecode : TT
         * statenotes :
         */

        private String active;
        private String confirmed;
        private String deaths;
        private String deltaconfirmed;
        private String deltadeaths;
        private String deltarecovered;
        private String lastupdatedtime;
        private String migratedother;
        private String recovered;
        private String state;
        private String statecode;
        private String statenotes;

        public String getActive() {
            return active;
        }

        public void setActive(String active) {
            this.active = active;
        }

        public String getConfirmed() {
            return confirmed;
        }

        public void setConfirmed(String confirmed) {
            this.confirmed = confirmed;
        }

        public String getDeaths() {
            return deaths;
        }

        public void setDeaths(String deaths) {
            this.deaths = deaths;
        }

        public String getDeltaconfirmed() {
            return deltaconfirmed;
        }

        public void setDeltaconfirmed(String deltaconfirmed) {
            this.deltaconfirmed = deltaconfirmed;
        }

        public String getDeltadeaths() {
            return deltadeaths;
        }

        public void setDeltadeaths(String deltadeaths) {
            this.deltadeaths = deltadeaths;
        }

        public String getDeltarecovered() {
            return deltarecovered;
        }

        public void setDeltarecovered(String deltarecovered) {
            this.deltarecovered = deltarecovered;
        }

        public String getLastupdatedtime() {
            return lastupdatedtime;
        }

        public void setLastupdatedtime(String lastupdatedtime) {
            this.lastupdatedtime = lastupdatedtime;
        }

        public String getMigratedother() {
            return migratedother;
        }

        public void setMigratedother(String migratedother) {
            this.migratedother = migratedother;
        }

        public String getRecovered() {
            return recovered;
        }

        public void setRecovered(String recovered) {
            this.recovered = recovered;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStatecode() {
            return statecode;
        }

        public void setStatecode(String statecode) {
            this.statecode = statecode;
        }

        public String getStatenotes() {
            return statenotes;
        }

        public void setStatenotes(String statenotes) {
            this.statenotes = statenotes;
        }
    }

    public static class TestedBean {
        /**
         * individualstestedperconfirmedcase : 75.64
         * positivecasesfromsamplesreported :
         * samplereportedtoday :
         * source : Press_Release_ICMR_13March2020.pdf
         * source1 :
         * testedasof : 13/03/2020
         * testpositivityrate : 1.20%
         * testsconductedbyprivatelabs :
         * testsperconfirmedcase : 83.33
         * testspermillion : 5
         * totalindividualstested : 5900
         * totalpositivecases : 78
         * totalsamplestested : 6500
         * updatetimestamp : 13/03/2020 00:00:00
         */

        private String individualstestedperconfirmedcase;
        private String positivecasesfromsamplesreported;
        private String samplereportedtoday;
        private String source;
        private String source1;
        private String testedasof;
        private String testpositivityrate;
        private String testsconductedbyprivatelabs;
        private String testsperconfirmedcase;
        private String testspermillion;
        private String totalindividualstested;
        private String totalpositivecases;
        private String totalsamplestested;
        private String updatetimestamp;

        public String getIndividualstestedperconfirmedcase() {
            return individualstestedperconfirmedcase;
        }

        public void setIndividualstestedperconfirmedcase(String individualstestedperconfirmedcase) {
            this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
        }

        public String getPositivecasesfromsamplesreported() {
            return positivecasesfromsamplesreported;
        }

        public void setPositivecasesfromsamplesreported(String positivecasesfromsamplesreported) {
            this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
        }

        public String getSamplereportedtoday() {
            return samplereportedtoday;
        }

        public void setSamplereportedtoday(String samplereportedtoday) {
            this.samplereportedtoday = samplereportedtoday;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getSource1() {
            return source1;
        }

        public void setSource1(String source1) {
            this.source1 = source1;
        }

        public String getTestedasof() {
            return testedasof;
        }

        public void setTestedasof(String testedasof) {
            this.testedasof = testedasof;
        }

        public String getTestpositivityrate() {
            return testpositivityrate;
        }

        public void setTestpositivityrate(String testpositivityrate) {
            this.testpositivityrate = testpositivityrate;
        }

        public String getTestsconductedbyprivatelabs() {
            return testsconductedbyprivatelabs;
        }

        public void setTestsconductedbyprivatelabs(String testsconductedbyprivatelabs) {
            this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
        }

        public String getTestsperconfirmedcase() {
            return testsperconfirmedcase;
        }

        public void setTestsperconfirmedcase(String testsperconfirmedcase) {
            this.testsperconfirmedcase = testsperconfirmedcase;
        }

        public String getTestspermillion() {
            return testspermillion;
        }

        public void setTestspermillion(String testspermillion) {
            this.testspermillion = testspermillion;
        }

        public String getTotalindividualstested() {
            return totalindividualstested;
        }

        public void setTotalindividualstested(String totalindividualstested) {
            this.totalindividualstested = totalindividualstested;
        }

        public String getTotalpositivecases() {
            return totalpositivecases;
        }

        public void setTotalpositivecases(String totalpositivecases) {
            this.totalpositivecases = totalpositivecases;
        }

        public String getTotalsamplestested() {
            return totalsamplestested;
        }

        public void setTotalsamplestested(String totalsamplestested) {
            this.totalsamplestested = totalsamplestested;
        }

        public String getUpdatetimestamp() {
            return updatetimestamp;
        }

        public void setUpdatetimestamp(String updatetimestamp) {
            this.updatetimestamp = updatetimestamp;
        }
    }
}