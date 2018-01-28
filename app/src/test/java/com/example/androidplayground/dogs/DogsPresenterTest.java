package com.example.androidplayground.dogs;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class DogsPresenterTest {

    @Mock
    private DogsContract.View dogsView;

    @Mock
    private BreedsService breedsService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void name() throws Exception{
        DogsPresenter dogsPresenter = new DogsPresenter(dogsView, breedsService);

        dogsPresenter.populateBreeds();

        verify(breedsService).getBreedsListResponse();
    }
}
