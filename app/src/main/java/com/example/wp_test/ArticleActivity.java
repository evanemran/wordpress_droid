package com.example.wp_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.wp_test.models.PostsResponse;

import org.jsoup.Jsoup;
import org.w3c.dom.Document;

import java.io.IOException;

public class ArticleActivity extends AppCompatActivity {

    TextView textView_article;
    PostsResponse selected_post;
    WebView webView_article;
    String url;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        textView_article = findViewById(R.id.textView_article);
        webView_article = findViewById(R.id.webView_article);

        progressBar = findViewById(R.id.progressBar);

        selected_post = (PostsResponse) getIntent().getSerializableExtra("data");
        url = selected_post.content.rendered;
//        textView_article.setText(selected_post.content.rendered);

        webView_article.setWebViewClient(new WebViewClient());
        webView_article.loadUrl(selected_post.link);
//        webView_article.setWebViewClient(new AppWebViewClients(progressBar, webView_article));
        WebSettings webSettings = webView_article.getSettings();
        webSettings.setJavaScriptEnabled(true);

//        new MyAsynTask().execute();

        textView_article.setText(Html.fromHtml(selected_post.content.rendered, Html.FROM_HTML_MODE_LEGACY));
    }

    @Override
    public void onBackPressed() {
        if (webView_article.canGoBack())
        {
            webView_article.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }


//    private class MyAsynTask extends AsyncTask<Void, Void, Document> {
//        @Override
//        protected Document doInBackground(Void... voids) {
//
//            Document document = null;
//            try {
//                document= (Document) Jsoup.connect(url).get();
//                document.getElementsByClass("main-navigation").remove();
//                document.getElementsByClass("custom-header-image").remove();
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return document;
//        }
//
//        @Override
//        protected void onPostExecute(Document document) {
//            super.onPostExecute(document);
//            webView_article.loadDataWithBaseURL(url,document.toString(),"text/html","utf-8","");
//            webView_article.getSettings().setCacheMode( WebSettings.LOAD_CACHE_ELSE_NETWORK );
//
//            webView_article.setWebViewClient(new WebViewClient(){
//                @Override
//                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//                    view.loadUrl(url);
//                    return super.shouldOverrideUrlLoading(view, request);
//                }
//            });
//        }
//    }
}