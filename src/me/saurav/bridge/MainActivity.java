package me.saurav.bridge;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends DroidGap {

	private String TAG = MainActivity.class.getSimpleName();

	// @Override
	// public void onCreate(Bundle savedInstanceState) {
	// super.onCreate(savedInstanceState);
	// setContentView(R.layout.activity_main);
	// final WebView webView = (WebView) findViewById(R.id.webView1);
	// webView.addJavascriptInterface(new JavaScriptInterface(this), "HTMLOUT");
	// webView.setWebViewClient(new WebViewClient() {
	//
	// @Override
	// public void onPageFinished(WebView view, String url) {
	// Toast.makeText(MainActivity.this, "onPageFinished",
	// Toast.LENGTH_SHORT).show();
	// Log.d(TAG, "onPageFinished");
	// webView.loadUrl("javascript:window.HTMLOUT.showHTML('<head>'+document.getElementsByTagName('html')[0].innerHTML+'</head>');");
	// }
	//
	// @Override
	// public boolean shouldOverrideUrlLoading(WebView view, String url) {
	// view.loadUrl(url);
	// return true;
	// }
	// });
	// webView.getSettings().setPluginState(PluginState.ON);
	// webView.getSettings().setJavaScriptEnabled(true);
	// webView.getSettings().setLoadWithOverviewMode(true);
	// webView.getSettings().setUseWideViewPort(true);
	// // webView.loadDataWithBaseURL("file:///android_asset/", ""
	// // + getHTMLData(), "text/html", "UTF-8", null);
	//
	// webView.loadUrl("file:///android_asset/www/index.html");
	//
	// }

	// private String getHTMLData() {
	// InputStream is;
	// String src = "";
	// try {
	// is = getAssets().open("www/index.html");
	// int size = is.available();
	// byte[] buffer = new byte[size];
	// is.read(buffer);
	// is.close();
	// src = new String(buffer);
	// } catch (Exception e) {
	// Log.e(TAG, "", e);
	// }
	// Log.d(TAG, src);
	// return src;
	// }
	//
	// public boolean onCreateOptionsMenu(Menu menu) {
	// getMenuInflater().inflate(R.menu.activity_main, menu);
	// return true;
	// }
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
		Log.d(TAG, "Loaded URL");
	}
}
