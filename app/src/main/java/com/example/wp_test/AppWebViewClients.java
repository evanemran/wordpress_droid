package com.example.wp_test;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class AppWebViewClients extends WebViewClient {
    private ProgressBar progressBar;
    private WebView webView;

    public AppWebViewClients(ProgressBar progressBar, WebView webView) {
        this.progressBar=progressBar;
        this.webView=webView;
        progressBar.setVisibility(View.VISIBLE);
        webView.setVisibility(View.GONE);
    }
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // TODO Auto-generated method stub
        view.loadUrl(url);
        return true;
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        // TODO Auto-generated method stub
        super.onPageFinished(view, url);
        progressBar.setVisibility(View.GONE);
        webView.setVisibility(View.VISIBLE);
    }
}
