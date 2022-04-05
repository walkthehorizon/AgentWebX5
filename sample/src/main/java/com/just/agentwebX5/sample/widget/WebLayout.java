package com.just.agentwebX5.sample.widget;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.tencent.smtt.sdk.WebView;

import com.just.agentwebX5.IWebLayout;
import com.just.agentwebX5.sample.R;

/**
 * Created by cenxiaozhong on 2017/7/1.
 * source code  https://github.com/Justson/AgentWeb
 */

public class WebLayout implements IWebLayout {

    private Activity mActivity;
    private final SmartRefreshLayout smartRefreshLayout;
    private WebView mWebView = null;

    public WebLayout(Activity activity) {
        this.mActivity = activity;
        smartRefreshLayout = (SmartRefreshLayout) LayoutInflater.from(activity).inflate(R.layout.fragment_twk_web, null);
        mWebView = smartRefreshLayout.findViewById(R.id.webView);
    }

    @NonNull
    @Override
    public ViewGroup getLayout() {
        return smartRefreshLayout;
    }
    @Nullable
    @Override
    public WebView getWebView() {
        return mWebView;
    }

}
