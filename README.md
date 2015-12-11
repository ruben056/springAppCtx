==application context==
** more namespaces
*** beans
*** context: provides support for configuring springs application config
*** p: for easy setter injection
*** c: for easy constructor injection
*** util: as the name suggest, provides some usefull utilities for DI config

two apps here to show difference between xml config and annotations:

*app-context.xml*
- as before, just define and wire dependencies togehter in xml

*app-context-annotation.xml*
- use annotations to define bean components and their dependencies.
- use <context:annotation-config/> to let spring search for annotations which define required dependencies (Resource, AutoWired etc...)
- use <context:component-scann base-package=""/> to let spring search for bean/component definitions

Two entry points for this project:
AppContextMain.java : test xml config:
AppCtxAnnotationMain.java : test annotation config

 

 