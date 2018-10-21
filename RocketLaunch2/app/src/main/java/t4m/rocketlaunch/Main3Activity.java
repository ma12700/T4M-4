package t4m.rocketlaunch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main3Activity extends AppCompatActivity {
    private int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        WebView myWebView = new WebView(this);
        setContentView(myWebView);
        id = Integer.parseInt(getIntent().getStringExtra("type"));
        if (id == R.id.schedule) {
            // Handle the camera action
            myWebView.loadUrl("https://www.nasa.gov/launchschedule/");
        } else if (id == R.id.port) {
            myWebView.loadUrl("https://en.wikipedia.org/wiki/List_of_rocket_launch_sites?fbclid=IwAR3ktrqWc9aLQjGrf2Ww2yud6a1gMKazIIFyTDpsIqGmIM6eCSUjE41qbiE#Launches_at_sea");

        } else if (id == R.id.locations) {
            myWebView.loadUrl("https://spotthestation.nasa.gov/?fbclid=IwAR07RIufElYS2La-FVxaVLmMlHlUHvI3JhVN_SQZgbTL40x23088EukFjFk");
        } else if (id == R.id.live) {
            myWebView.loadUrl("https://www.nasa.gov/multimedia/nasatv/index.html?channel=iss#public");

        } else if (id == R.id.help) {
            myWebView.loadUrl("https://www.nasa.gov/missions/highlights/schedule101.html");

        } else if (id == R.id.informations) {
            myWebView.loadUrl("https://www.nasa.gov/multimedia/podcasting/nasaedge/NE00050813_102_go_launch.html?fbclid=IwAR1rHt0GpD");

        } else if (id == R.id.video) {
            myWebView.loadUrl("https://www.nasa.gov/exploration/systems/sls/multimedia/videos.html");

        }else if (id == R.id.news) {
            myWebView.loadUrl("https://www.nasa.gov/mission_pages/station/main/index.html");

        }
    }
}
