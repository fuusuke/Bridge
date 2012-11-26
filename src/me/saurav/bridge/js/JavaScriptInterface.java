package me.saurav.bridge.js;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class JavaScriptInterface {
	private static final String TAG = JavaScriptInterface.class.getSimpleName();
	private Context mContext;

	public JavaScriptInterface(Context c) {
		mContext = c;
	}

	public void showToast(String toast) {
		Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
	}

	public void renderAnotherPage(String pageName) {

	}

	public void showHTML(String html) {
		Log.d(TAG, html);
		new AlertDialog.Builder(mContext).setTitle("HTML").setMessage(html)
				.setPositiveButton(android.R.string.ok, null)
				.setCancelable(false).create().show();
	}
}
