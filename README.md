<h1><a href="https://github.com/PratikSurela/DraggableView">DraggableView</a></h1>

<p>Using DragableView you can&nbsp;merge various views into one layout with dragg and drop animation. For example if you have 3 ImageViews(fb,google,linkedin) and one MainImageView(Login with) and you want to implement drag-drop animation to drag one of the imageview(source) and drop on MainImageView(destination view).</p>

<img src="https://thumbs.gfycat.com/FlawedUnsungAuk-max-1mb.gif" width="300" height="500" /><p>&nbsp;</p>

<p><strong>Step 1 : </strong>Import module / add dependency into build.gradle &quot;draggable-view&quot;.</p>

<pre>
<code>compile &#39;com.app:draggable-views:1.0.0&#39;</code></pre>

<p><strong>Step 2 : </strong>initlialize &quot;DragableViewMain&quot; class.</p>

<pre>
<code>DraggableViewMain draggableViewMain = new DraggableViewMain(this, relativeLayoutObject);</code></pre>

<p><strong>Step 3 : </strong>Add views, that is source views.</p>

<pre>
<code>        draggableViewMain.addView(imgFacebook);
        draggableViewMain.addView(imgGoogle);
        draggableViewMain.addView(imgLinkedIn);</code></pre>

<p><strong>Step 4 : </strong>implements &quot;OnViewSelection&quot; interface. <strong>Step 5 : </strong>Override method &quot;viewSelectedPosition(int position)&quot;.</p>

<pre>
<code>@Override
    public int viewSelectedPosition(int position) {

        if (position == 0) {
            //do after view one dragged
            Toast.makeText(this, &quot;Login with Facebook&quot;, Toast.LENGTH_SHORT).show();
        } else if (position == 1) {
            //do after view two dragged
            Toast.makeText(this, &quot;Login with Google&quot;, Toast.LENGTH_SHORT).show();
        } else if (position == 2) {
            //do after view three dragged
            Toast.makeText(this, &quot;Login with LinkedIn&quot;, Toast.LENGTH_SHORT).show();
        }
        return position;
    }</code></pre>

<p><strong>That&#39;s it...Enjoy...:)</strong></p>
