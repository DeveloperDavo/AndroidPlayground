package com.example.androidplayground.home;

class HomePresenter {
    private HomeContract.View homeView;

    public HomePresenter(HomeContract.View homeView) {
        this.homeView = homeView;
    }

    public void navigateToGitHubView() {
        homeView.showGitHubView();
    }
}
