<h1><a href="https://github.com/PratikSurela/DragableView">DragableView</a></h1>

Using DragableView you can&nbsp;merge various views into one layout with dragg and drop animation.

For example if you have 3 ImageViews(source view) and one MainImageView(destination view) and you want to implement drag-drop animation to drag one of the imageview(source) and drop on MainImageView(destination view).

<p>&nbsp;</p>

<b>Step 1 : </b>Import module / add dependency into build.gradle &quot;draggable-view&quot;.
<pre>
<code>compile 'com.app:draggable-views:1.0.0'</code></pre>

<b>Step 2 : </b>initlialize &quot;DragableViewMain&quot; class.

<pre>
<code>DraggableViewMain draggableViewMain = new DraggableViewMain(this, destinationViewGroup);</code></pre>

<b>Step 3 : </b>Add views, that is source views.

<pre>
<code>        draggableViewMain.addView(imgSourceOne);
        draggableViewMain.addView(imgSourceTwo);
        draggableViewMain.addView(imgSourceThree);</code></pre>

<b>Step 4 : </b>implements &quot;OnViewSelection&quot; interface.

<b>Step 5 : </b>Override method &quot;viewSelectedPosition(int position)&quot;.

<pre>
<code>@Override
    public int viewSelectedPosition(int position) {

        if (position == 0) {
            //do after view one dragged
            Toast.makeText(this, "dragged view position = " + position, Toast.LENGTH_SHORT).show();
        } else if (position == 1) {
            //do after view two dragged
            Toast.makeText(this, "dragged view position = " + position, Toast.LENGTH_SHORT).show();
        } else if (position == 2) {
            //do after view three dragged
            Toast.makeText(this, "dragged view position = " + position, Toast.LENGTH_SHORT).show();
        }
        return position;
    }</code></pre>

<b>That&#39;s it...Enjoy...:)</b>
