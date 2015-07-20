package com.development.abtronic.openglesintroduction;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

    private GLSurfaceView glSurfaceView;
    final GLRenderer mRenderer = new GLRenderer(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Instantiate our glSurfaceView - we are passing a reference to the MainActivity
        // which is used as a Context, as Activity is a subclass of Context
        glSurfaceView = new GLSurfaceView(this);

        // Set the Activity to run full screen; this means hiding the status bar at the
        // top of the screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Keep the screen on while this app is running and in focus
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // function to setup the glSurfaceView
        setupGLSurfaceView();

        // Set our view
        setContentView(R.layout.activity_main);

        // Retrieve the Relative Layout setup in the main layout for this Activity
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.gamelayout);

        // Attach our surfaceView to the Relative Layout we just retrieved
        RelativeLayout.LayoutParams glParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        layout.addView(glSurfaceView, glParams);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        glSurfaceView.onPause();
        mRenderer.onPause();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        glSurfaceView.onResume();
        mRenderer.onResume();
    }

    private void setupGLSurfaceView()
    {
        // Create an OpenGL ES 2.0 context
        glSurfaceView.setEGLContextClientVersion(2);
        // Set the renderer for the glSurfaceView
        glSurfaceView.setRenderer(mRenderer);
        // Tell the renderer to redraw the screen continuously
        glSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);

    }


/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
