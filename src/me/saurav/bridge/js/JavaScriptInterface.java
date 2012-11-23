package me.saurav.bridge.js;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

public class JavaScriptInterface {
	private Context mContext;

	JavaScriptInterface(Context c) {
		mContext = c;
	}

	public void showToast(String toast) {
		Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
	}

	public void renderAnotherPage(String pageName) {

	}

	public void showHTML(String html) {
		new AlertDialog.Builder(mContext).setTitle("HTML").setMessage(html)
				.setPositiveButton(android.R.string.ok, null)
				.setCancelable(false).create().show();
	}
}
