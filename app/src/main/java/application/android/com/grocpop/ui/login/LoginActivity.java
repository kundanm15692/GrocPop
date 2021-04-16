package application.android.com.grocpop.ui.login;

import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import application.android.com.grocpop.Network.Models.LoginRequest;
import application.android.com.grocpop.R;
import application.android.com.grocpop.Utils.BaseActivity;
import application.android.com.grocpop.databinding.LoginActivityBinding;

public class LoginActivity extends BaseActivity {

    LoginActivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        LoginRequest loginRequest = new LoginRequest();

        binding.getStartBtn.setOnClickListener(v -> {
            binding.welcomeMsg.setVisibility(View.GONE);
            binding.mobileNoLayout.setVisibility(View.VISIBLE);

            loginRequest.setAction("doLogin");
            loginRequest.setMobileNo("9108650221");
            doLogin(loginRequest);

        });

        binding.getOtpBtn.setOnClickListener(v->{

            binding.mobileNoLayout.setVisibility(View.GONE);
            binding.otpLayout.setVisibility(View.VISIBLE);

            loginRequest.setAction("doLogin");
            loginRequest.setMobileNo("9108650221");
            doLogin(loginRequest);

        });

        binding.verifyOtpBtn.setOnClickListener(v->{

            binding.posterImageLayout.setVisibility(View.GONE);
            binding.verificationLayout.setVisibility(View.GONE);
            binding.registerLayout.setVisibility(View.VISIBLE);

        });
    }


    private void doLogin(LoginRequest loginRequest){

    }

}
