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