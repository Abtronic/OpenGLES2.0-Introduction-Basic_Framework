package com.development.abtronic.openglesintroduction;

import android.content.Context;
import android.opengl.GLSurfaceView.Renderer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Abtronic on 19-07-15.
 */

public class GLRenderer implements Renderer{

    /** Where our context is stored */
    Context mContext;

    GLRenderer(Context c)
    {

        mContext = c;
    }

    /** A function that must be written when using the Renderer interface.
     * This function will be called to redraw the screen every frame
     *
     * @param unused    A reference to a GL10 handle which isn't needed as we are using
     *                  OpenGL ES 2.0. We still need to declare our interface functions with this reference.
     */
    @Override
    public void onDrawFrame(GL10 unused)
    {

    }

    /** A function that must be written when using the Renderer interface.
     * This function is called whenever the screen changes dimensions such
     * as caused by screen rotation. It is also called when focus returns on
     * the app.
     *
     * @param gl        A reference to an unused GL10 handle
     * @param width     The width of the display screen
     * @param height    The height of the display screen
     */
    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height)
    {

    }

    /**A function that must be written when using the Renderer interface.
     * This function is called at the beginning of rendering this OpenGl
     * application, similar to most init functions. In the same way textures
     * and other resources are set up here.
     * This function is called every time the EGL context is lost, which
     * happens when focus is lost or when the device goes to sleep.
     *
     * @param gl        A reference to an unused GL10 handle
     * @param config    An EGL context, it isn't used to do anything in our
     *                  program
     */
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config)
    {

    }


    public void onPause()
    {

    }

    public void onResume()
    {

    }

}
