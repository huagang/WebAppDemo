package com.webwalker.webappdemo.web;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * @author xu.jian
 * 
 */
public class MyWebViewClient extends WebViewClient {

	@Override
	public boolean shouldOverrideUrlLoading(WebView view, String url) {
		view.loadUrl(url);
		return true;
		// return super.shouldOverrideUrlLoading(view, url);

		// 自定义页面所有_blank标签的打开方式
		/*System.out.println(url);
		if (url.startsWith("newtab:")) {
			String realUrl = url.substring(7, url.length());
			Intent it = new Intent(Intent.ACTION_VIEW);
			it.setData(Uri.parse(realUrl));
			view.getContext().startActivity(it);
		} else {
			view.loadUrl(url);
		}
		return true;*/
	}

	@Override
	public void onPageStarted(WebView view, String url, Bitmap favicon) {
		super.onPageStarted(view, url, favicon);
	}

	@Override
	public void onPageFinished(WebView view, String url) {
		super.onPageFinished(view, url);

		// 自定义页面所有_blank标签的打开方式
		// view.loadUrl("javascript: var allLinks = document.getElementsByTagName('a'); if (allLinks) {var i;for (i=0; i<allLinks.length; i++) {var link = allLinks[i];var target = link.getAttribute('target'); if (target && target == '_blank') {link.setAttribute('target','_self');link.href = 'newtab:'+link.href;}}}");
	}

	@Override
	public void onLoadResource(WebView view, String url) {
		super.onLoadResource(view, url);
	}

	@Override
	public void onReceivedError(WebView view, int errorCode,
			String description, String failingUrl) {
		super.onReceivedError(view, errorCode, description, failingUrl);
	}

}
