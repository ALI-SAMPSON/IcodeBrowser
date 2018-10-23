package io.icode.browser.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BrowserActivity extends AppCompatActivity {

    private WebView _webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        _webview = findViewById(R.id.webView);
        _webview.setWebViewClient(new WebViewClient());
        _webview.loadUrl("http://google.com");

        // add setting to the webView
        WebSettings webSettings = _webview.getSettings();
        webSettings.getBuiltInZoomControls();
        webSettings.setDisplayZoomControls(true);
        webSettings.getDefaultFontSize();
        webSettings.getDefaultFixedFontSize();
        webSettings.setAllowFileAccess(true);
        webSettings.setGeolocationEnabled(false);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.getSansSerifFontFamily();


    }

    @Override
    public void onBackPressed() {
        // checks if webView can go back
        if(_webview.canGoBack()){
            _webview.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
