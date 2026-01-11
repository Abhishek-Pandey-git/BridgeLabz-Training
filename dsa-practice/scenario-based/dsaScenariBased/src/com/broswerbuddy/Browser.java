package com.broswerbuddy;

public class Browser {
    BrowserHistory history;
    ClosedTabStack closedTabs;
    
    public Browser() {
        history = new BrowserHistory();
        closedTabs = new ClosedTabStack();
    }
    
    public void openPage(String url) {
        history.visit(url);
    }
    
    public void goBack() {
        history.back();
    }
    
    public void goForward() {
        history.forward();
    }
    
    public void closeTab() {
        String currentUrl = history.getCurrentUrl();
        if (!currentUrl.equals("No page loaded")) {
            closedTabs.push(currentUrl);
            System.out.println("Tab closed: " + currentUrl);
        }
    }
    
    public void reopenLastTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to reopen!");
            return;
        }
        String url = closedTabs.pop();
        history.visit(url);
        System.out.println("Reopened tab: " + url);
    }
    
    public void showCurrentPage() {
        System.out.println("Current page: " + history.getCurrentUrl());
    }
}
