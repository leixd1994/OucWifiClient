package com.example.john.autodenglu;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    Button button;
    CheckBox checkBox;
    CheckBox checkBox2;
    SharedPreferences sp;
    EditText in1;EditText in2;
    public Handler handler;
    String htmldate2 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "<head>\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
            "<title>这是晓东建立在腾讯云上的网站</title>\n" +
            "<style>\n" +
            "body{text-align:center} \n" +
            "\n" +
            "</style>\n" +
            "\n" +
            "</head>\n" +
            "\n" +
            "\n" +
            "\n" +
            "<body>\n" +
            "\n" +
            "\n" +
            "<form name=\"f3\" style=\"height:100%\" onsubmit=\"return true\" action=\"http://10.100.29.2:801/eportal/?c=ACSetting&a=Login&wlanuserip=null&wlanacip=null&wlanacname=null&port=&iTermType=1&mac=000000000000&redirect=null&session=null\" method=\"post\"> <input name=\"DDDDD\" class=\"edit_lobo_cell\" style=\"top: 15px; left: 129px; width: 184px; height: 28px; border-radius: 2px; border: 1px solid rgb(159, 154, 154); text-align: left; color: rgb(127, 127, 127); padding: 4px; position: absolute; background-color: rgb(255, 255, 255);\" type=\"text\" maxlength=\"16\" placeholder=\"\" autocomplete=\"off\" value=\"21160233092\"><input name=\"upass\" class=\"edit_lobo_cell\" style=\"top: 62px; left: 129px; width: 184px; height: 28px; color: rgb(127, 127, 127); border-radius: 2px; border: 1px solid rgb(159, 154, 154); text-align: left; padding: 4px; position: absolute; background-color: rgb(255, 255, 255);\" type=\"password\" maxlength=\"16\" placeholder=\"\" autocomplete=\"off\" value=\"243918\"> <input name=\"0MKKey\" class=\"edit_lobo_cell\" style='top: 103px; left: 131px; width: 77px; height: 26px; color: rgb(255, 255, 255); border-radius: 2px; text-align: center; padding: 4px; position: absolute; background-image: url(\"http://10.100.29.2:801/eportal/extern/20160708/ip/1/extern/0601/ip/1/20160601195414_47544.gif\"); background-color: rgb(85, 167, 208);' type=\"submit\" value=\"登录\">  </form>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "</body>\n" +
            "</html>";

    String htmldate ="<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "<head>\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
            "<title>这是晓东建立在腾讯云上的网站</title>\n" +
            "<style>\n" +
            "form{text-align:center} \n" +
            "\n" +
            "</style>\n" +
            "\n" +
            "\n" +
            "</head>\n" +
            "\n" +
            "\n" +
            "\n" +
            "<body>\n" +
            "\n" +
            "\n" +
            "<form name=\"f3\" id=\"form1\" style=\"height:100%\" onsubmit=\"return true\" action=\"http://10.100.29.2:801/eportal/?c=ACSetting&a=Login&wlanuserip=null&wlanacip=null&wlanacname=null&port=&iTermType=1&mac=000000000000&redirect=null&session=null\" method=\"post\"> <input name=\"DDDDD\"  id= \"username\" class=\"edit_lobo_cell\" style=\"top: 15px; left: 129px; width: 184px; height: 28px; border-radius: 2px; border: 1px solid rgb(159, 154, 154); text-align: left; color: rgb(127, 127, 127); padding: 4px; position: absolute; background-color: rgb(255, 255, 255);\" type=\"text\" maxlength=\"16\" placeholder=\"\" autocomplete=\"off\" ><input name=\"upass\" id=\"passw\" class=\"edit_lobo_cell\" style=\"top: 62px; left: 129px; width: 184px; height: 28px; color: rgb(127, 127, 127); border-radius: 2px; border: 1px solid rgb(159, 154, 154); text-align: left; padding: 4px; position: absolute; background-color: rgb(255, 255, 255);\" type=\"password\" maxlength=\"16\" placeholder=\"\" autocomplete=\"off\" > <input name=\"0MKKey\" class=\"edit_lobo_cell\" style='top: 103px; left: 131px; width: 77px; height: 26px; color: rgb(255, 255, 255); border-radius: 2px; text-align: center; padding: 4px; position: absolute; background-image: url(\"http://10.100.29.2:801/eportal/extern/20160708/ip/1/extern/0601/ip/1/20160601195414_47544.gif\"); background-color: rgb(85, 167, 208);' type=\"submit\" value=\"登录\">  </form>\n" +
            "\n" +
            "<script>\n" +
            "function sn(t)\n" +
            "{\n" +
            "var x=document.getElementById(\"username\");\n" +
            "x.value=t;\n" +
            "}\n" +
            "function spass(t)\n" +
            "{\n" +
            "var x=document.getElementById(\"passw\");\n" +
            "x.value=t;\n" +
            "}\n" +
            "function sb()\n" +
            "{\n" +
            "document.getElementById(\"form1\").submit();\n" +
            "}\n" +

            "\n" +
            "</script>\n" +
            "\n" +
            "\n" +
            "</body>\n" +
            "</html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        in1=(EditText)findViewById(R.id.in1);
        in2=(EditText)findViewById(R.id.in2);
        button=(Button)findViewById(R.id.test);
        webView = (WebView) findViewById(R.id.webview);
        checkBox=(CheckBox)findViewById(R.id.chec);
        checkBox2=(CheckBox)findViewById(R.id.xinghao);
        sp= getPreferences(MODE_PRIVATE);

        handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                if (msg.what==1)
                {

                    in2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                super.handleMessage(msg);
            }
        };

        String username=sp.getString("username",null);
        if (username!=null) in1.setText(username);
        String password=sp.getString("password",null);
        if (password!=null) in2.setText(password);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (checkBox2.isChecked() == true)
                      //  in2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    handler.sendEmptyMessage(1);
                        try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadData(htmldate, "text/html; charset=UTF-8", null);
        //String newhdata = htmldate.replaceAll("21160233092", "123456789");
       // webView.loadData(newhdata, "text/html; charset=UTF-8", null);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {


        if (checkBox.isChecked()==true)
        {
            SharedPreferences.Editor editor=sp.edit();
            editor.putString("username",in1.getText().toString());
            editor.putString("password",in2.getText().toString());
          editor.commit();
                    }

        String call = "javascript:sn(\""+in1.getText().toString()+"\")";
        webView.loadUrl(call);
        String call2="javascript:spass(\""+in2.getText().toString()+"\")";
        webView.loadUrl(call2);
        String call3="javascript:sb()";
        webView.loadUrl(call3);
    }
});



    }
}