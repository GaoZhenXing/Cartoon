package com.jason.cartoon;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.jason.cartoon.model.UserModel;
import com.orhanobut.hawk.Hawk;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Jason on 2017/10/7.
 */

public class WelComeActivity extends AppCompatActivity {
    @BindView(R.id.splash_image)
    ImageView splashImage;
    @BindView(R.id.splash_app_name)
    TextView splashAppName;
    @BindView(R.id.splash_slogan)
    TextView splashSlogan;
    @BindView(R.id.splash_version_name)
    TextView splashVersionName;
    @BindView(R.id.splash_copyright)
    TextView splashCopyright;

    UserModel user;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        Animation animator= AnimationUtils.loadAnimation(this,R.anim.anim_welcom);
        splashImage.setAnimation(animator);
        animator.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
             handLogin();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    private void handLogin() {
        user= Hawk.get("user");
if (user!=null)        {
            login();
        }else
        {
            startActivity(new Intent(WelComeActivity.this,LoginActivity.class));
        }
    }

    private void login() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
 }
}
