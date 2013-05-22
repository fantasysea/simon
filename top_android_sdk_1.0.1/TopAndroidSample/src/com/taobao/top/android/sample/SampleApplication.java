/**
 * 
 */
package com.taobao.top.android.sample;

import com.taobao.top.android.TopAndroidClient;
//import com.taobao.top.android.TopAndroidClient.Env;

import android.app.Application;

/**
 * @author junyan.hj
 *
 */
public class SampleApplication extends Application {
	@Override  
	public void onCreate() {  
		super.onCreate();
		TopAndroidClient.registerAndroidClient(getApplicationContext(), "21406151", "a7e496121a3e83cfe736a01b294f1518", "callback://com.sea.ximen");
		//TopAndroidClient.registerAndroidClient(getApplicationContext(), "519255", "988d57871c1fb8767a9b0875b28e5c17", "callback://authresult",Env.DAILY);
		
	}
}
