package com.example.androidplayground.home;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class HomePresenterTest {

    private HomePresenter homePresenter;

    @Mock
    private HomeContract.View homeView;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        homePresenter = new HomePresenter(homeView);
    }
    @Test
    public void shouldShowGitHubView_whenClickingButton() {
        homePresenter.navigateToGitHubView();

        verify(homeView).showGitHubView();
    }
}
