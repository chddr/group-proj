package com.example.challengeup;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.challengeup.databinding.ActivityMainBinding;
import com.example.challengeup.viewModel.MainActivityViewModel;
import com.example.challengeup.viewModel.factory.MainActivityFactory;

public class MainActivity extends AppCompatActivity implements ILoadable, IBlockingLoadable {

    private MainActivityViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);

        Container container = ((ApplicationContainer) getApplication()).mContainer;
        mViewModel = new ViewModelProvider(this, new MainActivityFactory(
                container.mRequestExecutor,
                null)
        ).get(MainActivityViewModel.class);
    }

    @Override
    public void startBlockingLoading(int timeoutMillis) {

    }

    @Override
    public void finishBlockingLoading() {

    }

    @Override
    public void startLoading() {

    }

    @Override
    public void finishLoading() {

    }
}