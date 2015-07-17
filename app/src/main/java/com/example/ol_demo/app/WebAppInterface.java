package com.example.ol_demo.app;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by wildchen on 15/4/25.
 */
public class WebAppInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c)
    {
        mContext = c;
    }

    /** Show a toast from the web page */
    // 如果target 大于等于API 17，则需要加上如下注解
    @JavascriptInterface
    public void showToast(String toast)
    {
        // Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
        Toast.makeText(mContext, toast, Toast.LENGTH_LONG).show();
    }
}
