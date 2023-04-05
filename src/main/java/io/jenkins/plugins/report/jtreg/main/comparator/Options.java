package io.jenkins.plugins.report.jtreg.main.comparator;

public class Options {
    private Operations operation;
    private String jobsPath;
    private String queryString;
    private String nvrQuery;
    private int numberOfBuilds;
    private boolean skipFailed;
    private boolean forceVagueQuery;

    public Options() {
        this.queryString = "";
        this.nvrQuery = "";
        this.numberOfBuilds = 1;
        this.skipFailed = true;
        this.forceVagueQuery = false;
    }

    public Operations getOperation() {
        return operation;
    }

    public void setOperation(Operations operation) {
        this.operation = operation;
    }

    public String getJobsPath() {
        return jobsPath;
    }

    public void setJobsPath(String jobsPath) {
        this.jobsPath = jobsPath;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getNvrQuery() {
        return nvrQuery;
    }

    public void setNvrQuery(String nvr) {
        this.nvrQuery = nvr;
    }

    public int getNumberOfBuilds() {
        return numberOfBuilds;
    }

    public void setNumberOfBuilds(int numberOfBuilds) {
        this.numberOfBuilds = numberOfBuilds;
    }

    public boolean isSkipFailed() {
        return skipFailed;
    }

    public void setSkipFailed(boolean skipFailed) {
        this.skipFailed = skipFailed;
    }

    public boolean isForceVagueQuery() {
        return forceVagueQuery;
    }

    public void setForceVagueQuery(boolean forceVagueQuery) {
        this.forceVagueQuery = forceVagueQuery;
    }

    // enum of all available operations
    public enum Operations {
        List, Enumerate, Compare, Print
    }
}