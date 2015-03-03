package com.webwalker.webappdemo;

import webwalker.framework.widget.web.WebViewUtils;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;

import com.webwalker.webappdemo.common.Urls;
import com.webwalker.webappdemo.web.MyWebChromeClient;
import com.webwalker.webappdemo.web.MyWebViewClient;

public class HardwareSpeedupActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hardware_speedup);

		wv = aq.id(R.id.webView1).getWebView();
		WebSettings settings = WebViewUtils.initWebView(wv);
		wv.setWebViewClient(new MyWebViewClient());
		wv.setWebChromeClient(new MyWebChromeClient());
		wv.setLayerType(View.LAYER_TYPE_HARDWARE, null);

		wv.loadUrl(Urls.SINA);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK && wv.canGoBack()) {
			wv.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	@JavascriptInterface
	public void test() {

	}

}
