package com.just.agentwebX5.sample.fragment;

import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.just.agentwebX5.AgentWebX5;
import com.just.agentwebX5.AgentWebSettingsImpl;
import com.just.agentwebX5.DefaultWebClient;
import com.just.agentwebX5.sample.widget.CoolIndicatorLayout;

/**
 * Created by cenxiaozhong on 2017/5/26.
 * source code  https://github.com/Justson/AgentWeb
 */

public class CustomIndicatorFragment extends AgentWebFragment {
	public static CustomIndicatorFragment getInstance(Bundle bundle) {
		CustomIndicatorFragment mCustomIndicatorFragment = new CustomIndicatorFragment();
		if (bundle != null){
			mCustomIndicatorFragment.setArguments(bundle);
		}
		return mCustomIndicatorFragment;
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

//        CommonIndicator mCommonIndicator=new CommonIndicator(this.getActivity());
//        FrameLayout.LayoutParams lp=new FrameLayout.LayoutParams(-2,-2);
//        lp.gravity= Gravity.CENTER;
//        ProgressBar mProgressBar=new ProgressBar(this.getActivity());
//        mProgressBar.setBackground(this.getResources().getDrawable(R.drawable.indicator_shape));
//        mCommonIndicator.addView(mProgressBar,lp);


		CoolIndicatorLayout mCoolIndicatorLayout = new CoolIndicatorLayout(this.getActivity());
		this.mAgentWeb = AgentWebX5.with(this)//
				.setAgentWebParent((ViewGroup) view, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
				.setCustomIndicator(mCoolIndicatorLayout)
				.setAgentWebWebSettings(AgentWebSettingsImpl.getInstance())
				.setWebViewClient(mWebViewClient)
				.setPermissionInterceptor(mPermissionInterceptor)
				.setSecurityType(AgentWebX5.SecurityType.STRICT_CHECK)
				.interceptUnkownUrl()
				.setOpenOtherPageWays(DefaultWebClient.OpenOtherPageWays.ASK)
				.createAgentWeb()//
				.ready()//
				.go(getUrl());


		initView(view);
	}
}
