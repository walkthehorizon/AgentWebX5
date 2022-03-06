package com.just.agentwebX5.sample.widget;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.just.agentwebX5.sample.tkrefreshlayout.TwinklingRefreshLayout;
import com.tencent.smtt.sdk.WebView;

import com.just.agentwebX5.IWebLayout;
import com.just.agentwebX5.sample.R;

/**
 * Created by cenxiaozhong on 2017/7/1.
 * source code  https://github.com/Justson/AgentWeb
 */

public class WebLayout implements IWebLayout {

    private Activity mActivity;
    private final TwinklingRefreshLayout mTwinklingRefreshLayout;
    private WebView mWebView = null;

    public WebLayout(Activity activity) {
        this.mActivity = activity;
        mTwinklingRefreshLayout = (TwinklingRefreshLayout) LayoutInflater.from(activity).inflate(R.layout.fragment_twk_web, null);
        mTwinklingRefreshLayout.setPureScrollModeOn();
        mWebView = mTwinklingRefreshLayout.findViewById(R.id.webView);
    }

    @NonNull
    @Override
    public ViewGroup getLayout() {
        return mTwinklingRefreshLayout;
    }
    @Nullable
    @Override
    public WebView getWebView() {
        return mWebView;
    }



}
