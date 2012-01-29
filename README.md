DROID
=====

This is a clone of the DROID code from SourceForge, set up here so that OPF/SCAPE 
folks can experiment with the code.

Official releases should be checked into the 'releases' branch and tagged appropriately
(e.g. droid-6.01).

Other modifications should occur in dedicated branches, and all folded into 'master' 
when ready.

The 'scape-minor-patches' branch should be used to make minor fixes to the base code.

Status
------

The code largely compiles but the tests are not working:

<code>
  mvn install -DskipTests
</code>

However, before doing that, you must install byteseek-1.1 (included here).

Note that the droid-swing-ui build depends on org.openide JARs which are not in Maven
Central, so the UI does not currently build. Consequentially, the binary release 
droid-binary module cannot be built, as it depend upon droid-swing-ui.


Also, at present, when running the GUI, it failes to display thing properly after adding files to scan. I get lots of these errors, and it's not clear why.

Exception in thread "AWT-EventQueue-0" java.lang.ClassCastException: uk.gov.nationalarchives.droid.gui.treemodel.DirectoryComparableString cannot be cast to javax.swing.tree.DefaultMutableTreeNode
	at uk.gov.nationalarchives.droid.gui.treemodel.NodeRenderer.getDisplayName(NodeRenderer.java:117)
	at uk.gov.nationalarchives.droid.gui.treemodel.NodeRenderer.getTableCellRendererComponent(NodeRenderer.java:104)
	at javax.swing.JTable.prepareRenderer(JTable.java:5720)
	at javax.swing.plaf.basic.BasicTableUI.paintCell(BasicTableUI.java:2072)
	at javax.swing.plaf.basic.BasicTableUI.paintCells(BasicTableUI.java:1974)
	at javax.swing.plaf.basic.BasicTableUI.paint(BasicTableUI.java:1770)
	at javax.swing.plaf.ComponentUI.update(ComponentUI.java:153)
	at javax.swing.JComponent.paintComponent(JComponent.java:752)
	at javax.swing.JComponent.paint(JComponent.java:1029)
	at javax.swing.JComponent.paintChildren(JComponent.java:862)
	at javax.swing.JComponent.paint(JComponent.java:1038)
	at javax.swing.JViewport.paint(JViewport.java:766)
	at javax.swing.JComponent.paintChildren(JComponent.java:862)
	at javax.swing.JComponent.paint(JComponent.java:1038)
	at javax.swing.JComponent.paintChildren(JComponent.java:862)
	at javax.swing.JComponent.paint(JComponent.java:1038)
	at javax.swing.JComponent._paintImmediately(JComponent.java:5098)
	at javax.swing.JComponent.paintImmediately(JComponent.java:4882)
	at javax.swing.RepaintManager.paintDirtyRegions(RepaintManager.java:812)
	at javax.swing.RepaintManager.paintDirtyRegions(RepaintManager.java:714)
	at javax.swing.RepaintManager.prePaintDirtyRegions(RepaintManager.java:694)
	at javax.swing.RepaintManager.access$700(RepaintManager.java:41)
	at javax.swing.RepaintManager$ProcessingRunnable.run(RepaintManager.java:1672)
	at java.awt.event.InvocationEvent.dispatch(InvocationEvent.java:209)
	at java.awt.EventQueue.dispatchEventImpl(EventQueue.java:677)
	at java.awt.EventQueue.access$000(EventQueue.java:85)
	at java.awt.EventQueue$1.run(EventQueue.java:638)
	at java.awt.EventQueue$1.run(EventQueue.java:636)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.security.AccessControlContext$1.doIntersectionPrivilege(AccessControlContext.java:87)
	at java.awt.EventQueue.dispatchEvent(EventQueue.java:647)
	at java.awt.EventDispatchThread.pumpOneEventForFilters(EventDispatchThread.java:296)
	at java.awt.EventDispatchThread.pumpEventsForFilter(EventDispatchThread.java:211)
	at java.awt.EventDispatchThread.pumpEventsForHierarchy(EventDispatchThread.java:201)
	at java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:196)
	at java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:188)
	at java.awt.EventDispatchThread.run(EventDispatchThread.java:122)

