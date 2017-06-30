<h1><a href="https://github.com/PratikSurela/DragableView">DragableView</a></h1>

<h2>Using DragableView you can&nbsp;merge various views into one layout with dragg and drop animation.</h2>

<h2>For example if you have 3 ImageViews(source view) and one MainImageView(destination view) and you want to implement drag-drop animation to drag one of the imageview(source) and drop on&nbsp;MainImageView(destination view).</h2>

<p>&nbsp;</p>

<h2>Step 1 : Import module &quot;draggable-view&quot;.</h2>

<h2>Step 2 : initlialize &quot;DragableViewMain&quot; class.</h2>

<pre>
<code>DraggableViewMain draggableViewMain = new DraggableViewMain(this, destinationViewGroup);</code></pre>

<h2>Step 3 : Add views, that is source views.</h2>

<pre>
<code>        draggableViewMain.addView(imgSourceOne);
        draggableViewMain.addView(imgSourceTwo);
        draggableViewMain.addView(imgSourceThree);</code></pre>

<h2>Step 4 : implements &quot;OnViewSelection&quot; interface.</h2>

<h2>Step 5 : Override method &quot;viewSelectedPosition(int position)&quot;.</h2>

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

<h1>That&#39;s it...Enjoy...:)</h1>
